package ex3_vehicle;


public abstract class Vehicle {

	public static int counter=0;
	
	private String color;
	private int wheels;
	
	public Vehicle() {}
	
	public Vehicle(String color, int wheels) {
		super();
		this.color = color;
		this.wheels = wheels;
		counter++;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String display() {
		return ("[color=" + color + ", wheels=" + wheels);
	}

	@Override
	public String toString() {
		return "Vehicle";
	}
	
}
