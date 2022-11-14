package ex_exercise_bank;

import java.util.List;

public class Bank {
	private List<Client> clients;
	private int accounts;
	private int money;
	private String activity;
	
	public Bank() {}
	
	public Bank(List<Client> clients, int accounts, int money, String activity) {
		super();
		this.clients = clients;
		this.accounts = accounts;
		this.money = money;
		this.activity = activity;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public int getAccounts() {
		return accounts;
	}

	public void setAccounts(int accounts) {
		this.accounts = accounts;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	public void addClient(Client client) {
		this.clients.add(client);
	}
	
	public void removeClient(Client client) {
		this.clients.remove(client);
	}

}
