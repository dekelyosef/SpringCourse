package ex6;

public class Airplane {
	private int passengers;
	private int gas;
	
	public Airplane(int passengers, int gas) {
		this.passengers = passengers;
		this.gas = gas;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	public int getGas() {
		return gas;
	}
	
	public void setGas(int gas) {
		this.gas = gas;
	}

}
