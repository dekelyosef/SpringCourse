package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	private int student_id;
	
	private String name;
	
	private int average;
	
	@ManyToOne
	@JoinColumn(name = "grade_id")
	private Grade grade;
	
	public Student() {}

	public Student(int id, String name, int average, Grade grade) {
		super();
		this.student_id = id;
		this.name = name;
		this.average = average;
		this.grade = grade;
	}

	public int getId() {
		return student_id;
	}

	public void setId(int id) {
		this.student_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", average=" + average + "]";
	}

}
