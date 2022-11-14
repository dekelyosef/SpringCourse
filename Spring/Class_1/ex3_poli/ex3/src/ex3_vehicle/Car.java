package ex3_vehicle;

public abstract class Car extends Vehicle {
	private boolean privateCar;
	
	public Car() {}

	public Car(String color, int wheels, boolean privateCar) {
		super(color, wheels);
		this.privateCar = privateCar;
	}

	public boolean isPrivateCar() {
		return privateCar;
	}

	public void setPrivateCar(boolean privateCar) {
		this.privateCar = privateCar;
	}

	public String display() {
		return (super.display() + ", privateCar=" + privateCar);
	}

	@Override
	public String toString() {
		return "Car";
	}

}
