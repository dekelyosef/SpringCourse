package ex3_vehicle;

public abstract class Truck extends Vehicle{
	private int loadWeight;
	
	public Truck() {}

	public Truck(String color, int wheels, int loadWeight) {
		super(color, wheels);
		this.setLoadWeight(loadWeight);
	}

	public int getLoadWeight() {
		return loadWeight;
	}

	public void setLoadWeight(int loadWeight) {
		this.loadWeight = loadWeight;
	}

	public String display() {
		return (super.display() + ", loadWeight=" + loadWeight);
	}

	@Override
	public String toString() {
		return "Truck";
	}

}
