package ex5_furniture;

public abstract class Dimensions {
	public static int counter=0;

	private double length;
	private double width;
	private double height;
	
	public Dimensions() {}

	public Dimensions(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String display() {
		return "[length=" + length + ", width=" + width + ", height=" + height;
	}
	
	public abstract void draw();
	
	
	
	

}
