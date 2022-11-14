package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	@Id
    @Column(name = "product_id")
	private int id;

    @Column
	private String name;

    @Column
	private int stock;

    @Column
	private double price;

    @ManyToMany(mappedBy = "products", fetch = FetchType.EAGER)
    private List<Transaction> transactions;

	public Product() {
		super();
	}

	public Product(int id, String name, int stock, double price) {
		super();
		this.id = id;
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.transactions = new ArrayList<Transaction>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", stock=" + stock + ", price=" + price + "]";
	}
	
}
