package ex_mesakem;

public class CEO extends Manager {
	private int pocketMoney;

	public CEO(String name, int age, String email, String role, int salary, int bonusSum, int pocketMoney) {
		super(name, age, email, role, 13, bonusSum);
		this.pocketMoney = pocketMoney;
	}

	public int getPocketMoney() {
		return pocketMoney;
	}

	public void setPocketMoney(int pocketMoney) {
		this.pocketMoney = pocketMoney;
	}
	
}
