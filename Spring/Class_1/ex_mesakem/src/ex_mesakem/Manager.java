package ex_mesakem;

public class Manager extends Employee {
	private int bonusSum;

	public Manager(String name, int age, String email, String role, int salary, int bonusSum) {
		super(name, age, email, role, salary);
		this.bonusSum = bonusSum;
	}

	public int getBonusSum() {
		return bonusSum;
	}

	public void setBonusSum(int bonusSum) {
		this.bonusSum = bonusSum;
	}

}
