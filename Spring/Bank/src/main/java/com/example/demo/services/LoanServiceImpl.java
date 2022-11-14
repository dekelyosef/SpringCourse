package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Account;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Loan;
import com.example.demo.errors.AccountDoesntExistsException;
import com.example.demo.errors.HandleException;
import com.example.demo.errors.LoanDoesntExistsException;
import com.example.demo.errors.LoanIsntActiveException;
import com.example.demo.repositories.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	private LoanRepository loanRepo;

	@Autowired
	private AccountService accountService;
	
	@Override
	public Loan getById(int id) throws LoanDoesntExistsException {
		Optional<Loan> loan = this.loanRepo.findById(id);
		if(loan.isPresent())
		{
			return loan.get();
		}
		throw new LoanDoesntExistsException();
	}
	
	@Override
	@Transactional
	public Loan giveLoan(int accountNumber, double amount, Customer customer, double monthlyRepayment) throws AccountDoesntExistsException, LoanDoesntExistsException {
		Account account = this.accountService.getById(accountNumber);
		boolean flag = true;
		if(account != null
				&& account.getCustomer().getId() == customer.getId()) {
			while (flag) {
				int randomNum = ThreadLocalRandom.current().nextInt(0, 1000000000 + 1);
				try {
					if(getById(randomNum) != null) {
						throw new LoanDoesntExistsException();
					}
				} catch (LoanDoesntExistsException loanDoesntExistsException) {
					flag = false;
					account.addAmount(amount);
					Loan loan = new Loan(randomNum, amount, true, monthlyRepayment, accountNumber, customer);
					return this.loanRepo.save(loan);
				}
			}
		}
		throw new AccountDoesntExistsException();
	}

	@Override
	@Transactional
	public Loan loanRepayment(int loanNumber, double amount)
			throws AccountDoesntExistsException, LoanDoesntExistsException,
			LoanIsntActiveException, HandleException {
		try {
			Loan loan = getById(loanNumber);
			if (!loan.isActive()) {
				throw new LoanIsntActiveException();
			}
			if (amount > loan.getAmount()) {
				amount = amount - loan.getAmount();
			}
			try {
				this.accountService.withdrawal(loan.getAccountNumber(), amount);
			} catch (AccountDoesntExistsException accountDoesntExistsException) {
				throw accountDoesntExistsException;
			} catch (HandleException message) {
				throw message;	
			}
			loan.subtractAmount(amount);
			if(loan.getAmount() <= 0) {
				loan.setActive(false);
			}
			return loan;
		} catch (LoanDoesntExistsException loanDoesntExistsException) {
			throw loanDoesntExistsException;
		}
	}
	
	@Override
	public List<Loan> getAll() {
		return this.loanRepo.findAll();
	}
	
	
}
