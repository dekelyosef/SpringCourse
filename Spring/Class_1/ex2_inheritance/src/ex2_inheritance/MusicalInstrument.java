package ex2_inheritance;

public abstract class MusicalInstrument {
	private String model;
	private String manufacturer;
	private String color;
	
	public MusicalInstrument() {}
	
	public MusicalInstrument(String model, String manufacturer, String color) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.color = color;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void makeSound();

	public String display() {
		return ("[model=" + model + ", manufacturer=" + manufacturer + ", color=" + color + ", ");
	}
	
}
