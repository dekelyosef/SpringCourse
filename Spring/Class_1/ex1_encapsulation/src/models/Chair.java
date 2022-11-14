package models;

enum Color {Black, White, Red, Green, Blue}

public class Chair {
	private String materialType;
	private String color;
	private double length;
	private double width;
	private double height;
	
	public Chair() {}
	
	public String getMaterialType() {
		return materialType;
	}
	
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String newColor) {
		for (Color c : Color.values()) {
			if (c.name().equals(newColor)) {
				this.color = newColor;
			}
		}
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		if (length >= 10 && length <= 150) {
			this.length = length;
		}
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		if (width >= 10 && width <= 150) {
			this.width = width;
		}
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		if (height >= 10 && height <= 150) {
			this.height = height;
		}
	}
	
	public double calculateVolume() {
		return (this.length * this.width * this.height);
	}

	@Override
	public String toString() {
		return "Chair [materialType=" + materialType + ", color=" + color + ", length=" + length + ", width=" + width
				+ ", height=" + height + ", volume=" + this.calculateVolume() + "]";
	}
	
}
