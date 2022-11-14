package com.example.demo.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Transaction {
	@Id
    @Column(name = "transaction_id")
	private int id;

    @Column
	private Date date;

    @Column
	private int price;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			  name = "product_transaction",
			  joinColumns = @JoinColumn(name = "product_id"), 
			  inverseJoinColumns = @JoinColumn(name = "transaction_id"))
	private List<Product> products;
	
	public Transaction() {
		super();
	}

	public Transaction(int id, Date date, int price) {
		super();
		this.id = id;
		this.date = date;
		this.price = price;
		this.products = new ArrayList<Product>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", date=" + date + ", price=" + price + "]";
	}
  	
	
}
