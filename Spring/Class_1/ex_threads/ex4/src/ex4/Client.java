package ex4;

import java.util.Date;

public class Client {
	private int id;
	private String name;
	private Date birthDate;
	private BankingOperation bankingOperation;
	
	public Client() {}

	public Client(int id, String name, Date birthDate, BankingOperation bankingOperation) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.bankingOperation = bankingOperation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public BankingOperation getBankingOperation() {
		return bankingOperation;
	}

	public void setBankingOperation(BankingOperation bankingOperation) {
		this.bankingOperation = bankingOperation;
	}

}
