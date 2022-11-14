package ex_exercise_bank;

enum STATUS {allowed, warned, blocked}

public class Account {
	private int amount;
	private int money;
	private STATUS status;
	
	public Account() {}
	
	public Account(int amount, int money, STATUS status) {
		super();
		this.amount = amount;
		this.money = money;
		this.status = status;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public void deposit(int sum) {
		this.amount += sum;
	}
	
	public void withdraw(int sum) {
		this.amount -= sum;
	}

}
