package ex_mesakem;

public class Employee extends Person {
	private String role;
	private int salary;
	
	public Employee(String name, int age, String email, String role, int salary) {
		super(name, age, email);
		this.role = role;
		this.salary = salary;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}


}
