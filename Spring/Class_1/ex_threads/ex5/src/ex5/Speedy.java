package ex5;

public class Speedy implements Runnable {	
	
	public static boolean flag = false;
	private Speedy speedy;

	public Speedy() {}

	public Speedy(Speedy speedy) {
		this.speedy = speedy;
	}

	public Speedy getSpeedy() {
		return speedy;
	}

	public void setSpeedy(Speedy speedy) {
		this.speedy = speedy;
	}

	@Override
	public void run() {
		int i = 1;
		while(!flag && i <= 10) {
			System.out.println(i);
			i++;
			try {
				Thread.sleep(getRandomInt());
			}
			catch (Exception e) { 
				e.printStackTrace(); 
			}
		}
		this.stop();
	}
	
	public void stop() {
		flag = true;
	}

	public int getRandomInt() {
		  return (int) Math.floor(Math.random() * (1000 - 0) + 0);
	}

}
