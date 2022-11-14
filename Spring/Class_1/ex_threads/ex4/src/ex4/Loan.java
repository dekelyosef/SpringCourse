package ex4;

public class Loan extends BankingOperation {
	private int redemptionTime;

	public Loan() {}
	
	public Loan(int amount, int redemptionTime) {
		super(120, amount);
		this.redemptionTime = redemptionTime;
	}

	public int getRedemptionTime() {
		return redemptionTime;
	}

	public void setRedemptionTime(int redemptionTime) {
		this.redemptionTime = redemptionTime;
	}
	
}
