package ex6;

public class Landing implements Runnable {
	private Airplane airplane;
	private Airport airport;
	
	public Landing(Airplane airplane) {
		this.airplane = airplane;
	}

	@Override
	public synchronized void run() {
		try {
			wait();
			airport.landing(airplane);
		} catch (InterruptedException e) { }
	}

}
