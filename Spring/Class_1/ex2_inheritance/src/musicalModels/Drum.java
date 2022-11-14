package musicalModels;

import ex2_inheritance.MusicalInstrument;

public class Drum extends MusicalInstrument {
	private double diameter = -1;
	
	public Drum() {}

	public Drum(String model, String manufacturer, String color, double diameter) {
		super(model, manufacturer, color);
		this.setDiameter(diameter);
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		if (diameter >= 0 && diameter <= 100) {
			this.diameter = diameter;
		}
	}

	public String display() {
		return ("Drum" + super.display() + "diameter=" + diameter + "]");
	}

	@Override
	public void makeSound() {
		System.out.println("Making Drum Sound");
	}
}
