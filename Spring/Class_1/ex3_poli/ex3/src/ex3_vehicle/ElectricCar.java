package ex3_vehicle;

public class ElectricCar extends Car implements Electric {
	private boolean privateCharger;
	
	public ElectricCar() {}
	
	public ElectricCar(String color, int wheels, boolean privateCar, boolean privateCharger) {
		super(color, wheels, privateCar);
		this.setPrivateCharger(privateCharger);
	}
	
	public boolean isPrivateCharger() {
		return privateCharger;
	}

	public void setPrivateCharger(boolean privateCharger) {
		this.privateCharger = privateCharger;
	}

	@Override
	public void charge() {
		System.out.println("Charging the Car");
	}
	
	public String display() {
		return "ElectricCar" + super.display() + ", privateCharger=" + privateCharger + "]";
	}
	
	@Override
	public String toString() {
		return "ElectricCar";
	}
	
}
