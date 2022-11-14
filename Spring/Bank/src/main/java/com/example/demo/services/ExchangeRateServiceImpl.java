package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.beans.ExchangeResult;
import com.example.demo.entities.Account;
import com.example.demo.errors.AccountDoesntExistsException;
import com.example.demo.errors.HandleException;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {

	private static final String URL = "https://api.exchangerate-api.com/v4/latest/";
	private static final String FROM = "ILS";

	@Autowired
	private ExchangeResult exchangeResult;

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private AccountService accountService;

	@Bean
	@Scheduled(cron = "0 0 0 * * ?")
	// synchronized
	public void getLatest() {
		this.exchangeResult = this.restTemplate.getForObject(URL + FROM, ExchangeResult.class);
	}
	
	private Double convert(String from, String to, Double amount) {
		double fromRate = this.exchangeResult.getRates().get(from);
		double toRate = this.exchangeResult.getRates().get(to);
        return (amount / fromRate) * toRate;
    }

	@Override
	public Account depositing(int accountNumber, String from, String to, double amount) throws AccountDoesntExistsException {
		double amountRate = this.convert(from, to, amount);
		Account account = this.accountService.depositing(accountNumber, amountRate);
		return account;
	}

	@Override
	public Account withdrawal(int accountNumber, String from, String to, double amount) throws AccountDoesntExistsException, HandleException {
		double amountRate = this.convert(from, to, amount);
		Account account = this.accountService.withdrawal(accountNumber, amountRate);
		return account;
	}
		
}
