package ex_mesakem;

import java.util.ArrayList;
import java.util.List;

public class Mesakem {

	public static void main(String[] args) {
		List<Factory> factoriesList = new ArrayList<Factory>();
		for (Factory fact: factoriesList) {
			fact.toString();
		}
		
		int salary = 0;
		int employeesNum = 0;
		Factory factory = new Factory();
		salary += factory.getCeo().getSalary();
		employeesNum += 1;
		List<Department> deps = factory.getDepartments();
		for (Department dep: deps) {
			salary += dep.getManeger().getSalary();
			employeesNum += 1;
			System.out.println("Department name: " + dep.getName());
			for (Employee emp: dep.getEmployees()) {
				salary += emp.getSalary();
				employeesNum += 1;
				System.out.println("Employee name: " + emp.getName() + ", salary: " + emp.getSalary());
			}
		}
		System.out.println("Average salary: " + salary/employeesNum);
	}

}
