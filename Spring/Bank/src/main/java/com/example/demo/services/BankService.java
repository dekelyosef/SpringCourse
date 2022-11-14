package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Account;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Loan;
import com.example.demo.errors.AccountDoesntExistsException;
import com.example.demo.errors.HandleException;
import com.example.demo.errors.LoanDoesntExistsException;
import com.example.demo.errors.LoanIsntActiveException;

@Service
public class BankService {

	@Autowired
    private LoanService loanService;

	@Autowired
    private AccountService accountService;

	@Autowired
	private EmailSenderService emailSenderService;

	@Scheduled(cron = "0 0 0 1 * ?")
	public void monthlyLoanRepayment()
			throws LoanDoesntExistsException, AccountDoesntExistsException, LoanIsntActiveException, HandleException {
		List<Loan> loans = this.loanService.getAll();
		// change only active loans
		for (Loan loan : loans) {
			try {
				this.loanService.loanRepayment(loan.getLoanNumber(), loan.getMonthlyRepayment());
			} catch (LoanIsntActiveException loanIsntActiveException) {}
		}
	}

	@Scheduled(cron = "0 0 8 * * ?")
	public void sendAccountExceptionEmail() {
		List<Account> accounts = this.accountService.getAll();
		// get by amount
		for (Account account: accounts) {
			if (account.getAmount() < -1 * account.getLimitation()) {
				Customer customer = account.getCustomer();
				this.emailSenderService.sendEmail(customer.getEmail(), "Account Exception", this.getMessage(customer,
						" You have an exception in account number " + account.getAccountNumber()
						+ " of " + account.getAmount() + " ILS"));
			}
		}
	}
	
	public String getMessage(Customer customer, String topic) {
		return "Dear " + customer.getFirstName() + " " + customer.getLastName() + "\n" + topic;
	}
	
}
	
