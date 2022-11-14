package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Account;
import com.example.demo.entities.Customer;
import com.example.demo.errors.AccountDoesntExistsException;
import com.example.demo.errors.CustomerDoesntExistsException;
import com.example.demo.errors.HandleException;
import com.example.demo.repositories.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepo;

	@Autowired
	private CustomerService customerService;
		
	@Override
	public Account getById(int id) throws AccountDoesntExistsException {
		Optional<Account> account = this.accountRepo.findById(id);
		if(account.isPresent())
		{
			return account.get();
		}
		throw new AccountDoesntExistsException();
	}

	@Override
	@Transactional
	public Account createNewAccount(Customer customer) throws CustomerDoesntExistsException, AccountDoesntExistsException {
		Customer customerExist = this.customerService.getById(customer.getId());
		boolean flag = true;
		if(customerExist != null)
		{
			while (flag) {
				int randomNum = ThreadLocalRandom.current().nextInt(0, 1000000000 + 1);
				try {
					if(getById(randomNum) != null) {
						throw new AccountDoesntExistsException();
					}
				} catch (AccountDoesntExistsException accountDoesntExistsException) {
					flag = false;
					Account account = new Account(randomNum, customer);
					return this.accountRepo.save(account);
				}
			}
		}
		throw new CustomerDoesntExistsException();
	}

	@Override
	@Transactional
	public Account limitAccount(int accountNumber, int limitation) throws AccountDoesntExistsException {
		Account account = getById(accountNumber);
		if(account != null) {
			account.setLimitation(limitation);
			return account;
		}
		throw new AccountDoesntExistsException();
	}
	
	@Override
	@Transactional
	public Account holdAccount(int accountNumber) throws AccountDoesntExistsException {
		Account account = getById(accountNumber);
		if(account != null) {
			account.setActive(!account.isActive());
			return account;
		}
		throw new AccountDoesntExistsException();
	}

	@Override
	@Transactional
	public Account depositing(int accountNumber, double amount) throws AccountDoesntExistsException {
		Account account = getById(accountNumber);
		if(account != null) {
			account.addAmount(amount);
			return account;
		}
		throw new AccountDoesntExistsException();
	}

	@Override
	@Transactional
	public Account withdrawal(int accountNumber, double amount) throws AccountDoesntExistsException, HandleException {
		Account account = getById(accountNumber);
		if(account != null) {
			if(account.getAmount() + account.getLimitation() >= amount) {
				account.subtractAmount(amount);
				return account;
			}
			throw new HandleException("Account doesn't have this amount");
		}
		throw new AccountDoesntExistsException();
	}

	@Override
	public double getBalance(int accountNumber) throws AccountDoesntExistsException {
		Account account = getById(accountNumber);
		if(account != null) {
			return account.getAmount();
		}
		throw new AccountDoesntExistsException();
	}

	@Override
	public Account transfer(double amount, int from, int to) throws AccountDoesntExistsException, HandleException {
		if(getById(from) != null && getById(to) != null) {
			try {
				withdrawal(from, amount);
				return depositing(to, amount);
			} catch (AccountDoesntExistsException accountDoesntExistsException){
				throw accountDoesntExistsException;
			}
		}
		throw new AccountDoesntExistsException();
	}

	@Override
	public List<Account> getAll() {
		return this.accountRepo.findAll();
	}
	
}
