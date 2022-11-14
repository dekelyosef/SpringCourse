package ex_exercise_bank;

import java.util.List;

public class Client {
	private List<Account> accounts;
	
	public Client() {}

	public Client(List<Account> accounts) {
		super();
		this.accounts = accounts;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void addAccount(Account account) {
		this.accounts.add(account);
	}
	
	public void removeAccount(Account account) {
		this.accounts.remove(account);
	}
	
	

}
