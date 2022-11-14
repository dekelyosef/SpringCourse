package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
    @Column
	private int id;

    @Column
	private String type;

    @Column
	private String color;

    @Column
	private String mileage;

    @Column
	private int year;
    
    @Column
	private int owners;

    @Column
	private int price;
    
    public Car() {}

	public Car(int id, String type, String color, String mileage, int year, int owners, int price) {
		super();
		this.id = id;
		this.type = type;
		this.color = color;
		this.mileage = mileage;
		this.year = year;
		this.owners = owners;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getOwners() {
		return owners;
	}

	public void setOwners(int owners) {
		this.owners = owners;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}