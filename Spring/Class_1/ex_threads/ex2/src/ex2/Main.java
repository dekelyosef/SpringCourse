package ex2;

import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
			PriorityQueue<Integer> clients = new PriorityQueue<Integer>();

			for(int i = 0; i < 10; i++) {
				clients.add((int) Math.floor(Math.random() * 100));
				
				try { 
					int c = clients.poll();
					System.out.println("sleeps for " + c + " seconds");
					Thread.sleep(c);
				} 
				catch (Exception e) { 
					e.printStackTrace(); 
				}
			}
			
			System.out.println(clients.isEmpty());
	}
	
}
