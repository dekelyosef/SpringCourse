package ex1;

public class Main {

	public static void main(String[] args) {
		
		Ex1 runner1 = new Ex1();
		Ex1 runner2 = new Ex1();

		Thread t1 = new Thread(runner1);
		Thread t2 = new Thread(runner2);
		
		try { 
			t1.run();
			t2.run();
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}
		
		System.out.println(Ex1.list);
	}

}
