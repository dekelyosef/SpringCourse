package ex6;

public class Airport {
	public Airport() {}
	
	public synchronized Airplane landing(Airplane airplane) {
		try {
			Thread.sleep(airplane.getGas());
			Thread.sleep(airplane.getPassengers()); // dropping off passengers
			Thread.sleep(airplane.getPassengers()); // boarding
		} catch (InterruptedException e) { }
		return airplane;
	}
	
	public synchronized void takeoff() {
		
		
	}

}
