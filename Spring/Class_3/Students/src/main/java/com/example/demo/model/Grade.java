package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grade")
public class Grade {
	@Id
	private int grade_id;
	
	private String name;
	
	@OneToMany(mappedBy = "grade")
	private List<Student> students;
	
	public Grade() {}

	public Grade(int id, String name) {
		super();
		this.grade_id = id;
		this.name = name;
	}

	public int getId() {
		return grade_id;
	}

	public void setId(int id) {
		this.grade_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Grade [grade_id=" + grade_id + ", name=" + name + "]";
	}

}
