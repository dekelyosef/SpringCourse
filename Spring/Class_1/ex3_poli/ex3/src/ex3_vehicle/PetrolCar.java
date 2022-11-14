package ex3_vehicle;

public class PetrolCar extends Car implements Petrol {
	private int year;
	
	public PetrolCar() {}
	
	public PetrolCar(String color, int wheels, boolean privateCar, int year) {
		super(color, wheels, privateCar);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public void refuel() {
		System.out.println("Refueling the Car");
	}

	public String display() {
		return "PetrolCar" + super.display() + ", year=" + year + "]";
	}

	@Override
	public String toString() {
		return "PetrolCar";
	}

}
