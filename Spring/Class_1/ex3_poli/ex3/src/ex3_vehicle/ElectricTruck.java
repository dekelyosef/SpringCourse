package ex3_vehicle;

public class ElectricTruck extends Truck implements Electric {
	private String manufacturer;
	
	public ElectricTruck() {}
	
	public ElectricTruck(String color, int wheels, int loadWeight, String manufacturer) {
		super(color, wheels, loadWeight);
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public void charge() {
		System.out.println("Charging the Truck");
		
	}

	public String display() {
		return "ElectricTruck" + super.display() + ", manufacturer=" + manufacturer + "]";
	}
	
	@Override
	public String toString() {
		return "ElectricTruck";
	}
	

}
