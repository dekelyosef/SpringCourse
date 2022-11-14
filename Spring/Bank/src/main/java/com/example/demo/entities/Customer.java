package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Customer {
	@Id
    @Column(name = "customer_id")
	private long id;

    @Column(name = "first_name")
	private String firstName;

    @Column(name = "last_name")
	private String lastName;

	private String email;

	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_customer_id", referencedColumnName = "customer_id")
	private List<Account> accounts;

    @JsonManagedReference
  	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "loan_customer_id", referencedColumnName = "customer_id")
    private List<Loan> loans;
	
    public Customer() {}
	
	public Customer(long id, String firstName, String lastName, String email, List<Account> accounts, List<Loan> loans) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.accounts = accounts;
		this.loans = loans;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public List<Loan> getLoans() {
		return loans;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

}
