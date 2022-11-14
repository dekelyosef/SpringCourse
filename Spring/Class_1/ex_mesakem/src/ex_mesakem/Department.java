package ex_mesakem;

import java.util.List;

enum Specialization {Production, Marketing, Management, Operations}

public class Department extends Factory {
	private String name;
	private List<Employee> employees;
	private Manager maneger;
	
	public Department(int registrationNum, String factoryName, CEO ceo, String name, List<Employee> employees, Manager maneger) {
		super(registrationNum, factoryName, ceo);
		this.name = name;
		this.employees = employees;
		this.maneger = maneger;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public Manager getManeger() {
		return maneger;
	}
	
	public void setManeger(Manager maneger) {
		this.maneger = maneger;
	}
	
	

}
