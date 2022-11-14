package ex4;

import java.util.Date;

public class Clerk {
	
	public static void main(String[] args) {
		Client client = new Client(123456789, "Avi", new Date(), new WithdrawingMoney(500));

		try {
			Thread.sleep(client.getBankingOperation().getTime());
			System.out.println("The operation finished");
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}		
	}

}
