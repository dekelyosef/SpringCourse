package musicalModels;

import ex2_inheritance.MusicalInstrument;

public class GrandPiano extends MusicalInstrument {
	private int keyNum = -1;
	private double length = -1;

	public GrandPiano() {}

	public GrandPiano(String model, String manufacturer, String color, int keyNum, double length) {
		super(model, manufacturer, color);
		this.setKeyNum(keyNum);
		this.setLength(length);
	}

	public int getKeyNum() {
		return keyNum;
	}

	public void setKeyNum(int keyNum) {
		if (keyNum >= 20 && keyNum <= 200) {
			this.keyNum = keyNum;
		}
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length >= 0 && length <= 300) {
			this.length = length;
		}
	}
	
	public String display() {
		return ("Grand Piano" + super.display() + "number of keys=" + keyNum + ", length=" + length + "]");
	}

	@Override
	public void makeSound() {
		System.out.println("Making Grand Piano Sound");
	}
}