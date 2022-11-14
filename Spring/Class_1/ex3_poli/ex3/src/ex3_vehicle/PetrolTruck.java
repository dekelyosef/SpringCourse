package ex3_vehicle;

public class PetrolTruck extends Truck implements Petrol {
	private String model;
	
	public PetrolTruck() {}

	public PetrolTruck(String color, int wheels, int loadWeight, String model) {
		super(color, wheels, loadWeight);
		this.setModel(model);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public void refuel() {
		System.out.println("Refueling the Truck");
	}
	
	public String display() {
		return "PetrolTruck" + super.display() + ", model=" + model + "]";
	}

	@Override
	public String toString() {
		return "PetrolTruck";
	}
}
