package models;

public class Speaker {
	
	private String color;
	private int volume;
	
	public Speaker() {}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if (volume >= 1 && volume <= 10) {
			this.volume = volume;
		}
	}
	
	public void turningOn() {
		System.out.println("The speaker turns on");
	}

	public void turningOff() {
		System.out.println("The speaker turns off");
	}
	
	public void makeSound() {
		System.out.println("The speaker makes a sound");
	}

	@Override
	public String toString() {
		return "Speaker [color=" + color + ", volume=" + volume + "]";
	}
	

	
	
	
}
