package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Account {

	@Id
    @Column(name = "account_number")
	private int accountNumber;
	
	private double amount;
	private boolean active;
	private int limitation;

	@JsonBackReference
    @ManyToOne
    @JoinColumn(name = "account_customer_id")
	private Customer customer;

	public Account() {}
	
	public Account(int accountNumber, Customer customer) {
		this.accountNumber = accountNumber;
		this.amount = 0;
		this.active = true;
		this.limitation = 0;
		this.customer = customer;
	}

	public Account(int accountNumber, double amount, boolean active, int limitation, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.active = active;
		this.limitation = limitation;
		this.customer = customer;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void addAmount(double amount) {
		this.amount += amount;
	}

	public void subtractAmount(double amount) {
		this.amount -= amount;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getLimitation() {
		return limitation;
	}

	public void setLimitation(int limitation) {
		this.limitation = limitation;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
