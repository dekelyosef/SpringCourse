package models;

public class Flashlight {
	private String color;
	private int length;
	private int luminosity;
	private int batteryNum;
	
	public Flashlight() {}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		if (length >= 0) {
			this.length = length;
		}
	}
	
	public int getLuminosity() {
		return luminosity;
	}
	
	public void setLuminosity(int luminosity) {
		if (luminosity >= 0) {
			this.luminosity = luminosity;
		}
	}
	
	public int getBatteryNum() {
		return batteryNum;
	}
	
	public void setBatteryNum(int batteryNum) {
		if (batteryNum >= 1 && batteryNum <= 4) {
			this.batteryNum = batteryNum;
		}
	}
	
	public void turningOn() {
		System.out.println("The flashlight turns on");
	}

	public void turningOff() {
		System.out.println("The flashlight turns off");
	}
	
	public void changeBattery() {
		System.out.println("Change batteries");
	}

	@Override
	public String toString() {
		return "Flashlight [color=" + color + ", length=" + length + ", luminosity=" + luminosity + ", batteryNum="
				+ batteryNum + "]";
	}
	
}
