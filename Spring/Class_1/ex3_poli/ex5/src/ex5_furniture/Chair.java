package ex5_furniture;

public class Chair extends Dimensions {
	private int legsNum;
	private String color;

	public Chair() {}
	
	public Chair(double length, double width, double height, String color, int legsNum) {
		super(length, width, height);
		this.legsNum = legsNum;
		this.color = color;
	}

	public int getLegsNum() {
		return legsNum;
	}

	public void setLegsNum(int legsNum) {
		this.legsNum = legsNum;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String display() {
		return "Chair" + super.display() + ", color=" + color + ", legsNum=" + legsNum + "]";
	}

	@Override
	public void draw() {
		System.out.println("  i______i");
		System.out.println("  I______I");
		System.out.println("  I      I");
		System.out.println("  I______I");
		System.out.println(" /      /I");
		System.out.println("(______( I");
		System.out.println("I I    I I");
		System.out.println("I      I");
	}

}
