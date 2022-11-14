package musicalModels;

import ex2_inheritance.MusicalInstrument;

public class Piano extends MusicalInstrument {
	private int keyNum = -1;
	
	public Piano() {}

	public Piano(String model, String manufacturer, String color, int keyNum) {
		super(model, manufacturer, color);
		this.setKeyNum(keyNum);
	}

	public int getKeyNum() {
		return keyNum;
	}

	public void setKeyNum(int keyNum) {
		if (keyNum >= 20 && keyNum <= 200) {
			this.keyNum = keyNum;
		}
	}
	
	public String display() {
		return ("Piano" + super.display() + "number of keys=" + keyNum + "]");
	}

	@Override
	public void makeSound() {
		System.out.println("Making Piano Sound");
	}
}