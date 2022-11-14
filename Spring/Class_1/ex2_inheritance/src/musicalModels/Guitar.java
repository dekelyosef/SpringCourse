package musicalModels;

import ex2_inheritance.MusicalInstrument;

public class Guitar extends MusicalInstrument {
	private int stringNum = -1;
	
	public Guitar(String model, String manufacturer, String color, int stringNum) {
		super(model, manufacturer, color);
		this.setStringNum(stringNum);
	}

	public int getStringNum() {
		return stringNum;
	}

	public void setStringNum(int stringNum) {
		if (stringNum >= 4 && stringNum <= 10) {
			this.stringNum = stringNum;
		}
	}
	
	public String display() {
		return ("Guitar" + super.display() + "number of strings=" + stringNum + "]");
	}

	@Override
	public void makeSound() {
		System.out.println("Making Guitar Sound");
	}
}
