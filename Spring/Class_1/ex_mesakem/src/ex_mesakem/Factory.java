package ex_mesakem;

import java.util.List;

public class Factory {
	private int registrationNum;
	private String name;
	private CEO ceo;
	private List<Department> departments;

	public Factory() {}
	
	public Factory(int registrationNum, String name, CEO ceo) {
		this.registrationNum = registrationNum;
		this.name = name;
		this.ceo = ceo;
	}
	

	public int getRegistrationNum() {
		return registrationNum;
	}
	
	public void setRegistrationNum(int registrationNum) {
		this.registrationNum = registrationNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public CEO getCeo() {
		return ceo;
	}
	
	public void setCeo(CEO ceo) {
		this.ceo = ceo;
	}
	
	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Factory [registrationNum= " + registrationNum + ", name= " + name + ", ceo= " + ceo.getName() +
				", number of employees= " +  getEmployeesNum() +"]";
	}
	
	public int getEmployeesNum() {
		int sum = 0;
		for(Department dep: departments) {
			sum += dep.getEmployees().size() + 1;
		}
		return sum;
	}

}
