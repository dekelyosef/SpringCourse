package ex5;

public class Main {
	
	public static void main(String[] args) {
		
		Speedy speedy = new Speedy(new Speedy());
		Speedy mainSpeedy = new Speedy(speedy);
		
		Thread t1 = new Thread(mainSpeedy);
		Thread t2 = new Thread(speedy);
		
		t1.start();
		t2.start();
		
	}

}
