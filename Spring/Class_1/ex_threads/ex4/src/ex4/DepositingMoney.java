package ex4;

enum DEPOSIT { cash, check }

public class DepositingMoney extends BankingOperation {
	private DEPOSIT deposit;

	public DepositingMoney(int amount, DEPOSIT deposit) {
		super(30, amount);
		this.deposit = deposit;
	}

	public DEPOSIT getDeposit() {
		return deposit;
	}

	public void setDeposit(DEPOSIT deposit) {
		this.deposit = deposit;
	}


}
