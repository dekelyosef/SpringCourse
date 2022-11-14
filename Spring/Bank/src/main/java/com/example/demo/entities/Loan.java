package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Loan {
	@Id
    @Column(name = "loan_number")
	private int loanNumber;
	
	private double amount;
	private boolean active;

	@Column(name = "monthly_repayment")
	private double monthlyRepayment;

	@Column(name = "account_number")
	private int accountNumber;

	@JsonBackReference
    @ManyToOne
    @JoinColumn(name = "loan_customer_id")
	private Customer customer;
	
	public Loan() {}
	
	public Loan(int loanNumber, double amount, boolean active, double monthlyRepayment, int accountNumber, Customer customer) {
		super();
		this.loanNumber = loanNumber;
		this.amount = amount;
		this.active = active;
		this.monthlyRepayment = monthlyRepayment;
		this.accountNumber = accountNumber;
		this.customer = customer;
	}

	public int getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
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
	
	public double getMonthlyRepayment() {
		return monthlyRepayment;
	}

	public void setMonthlyRepayment(double monthlyRepayment) {
		this.monthlyRepayment = monthlyRepayment;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
