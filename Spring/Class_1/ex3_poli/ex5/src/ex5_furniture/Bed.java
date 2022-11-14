package ex5_furniture;

public class Bed extends Dimensions {
	private boolean isEven;
	private String color;

	public Bed() {}
	
	public Bed(double length, double width, double height, String color, boolean isEven) {
		super(length, width, height);
		this.isEven = isEven;
		this.color = color;
	}

	public boolean getIsEven() {
		return isEven;
	}

	public void setIsEven(boolean isEven) {
		this.isEven = isEven;
	}
	
	public String display() {
		return "Bed" + super.display() + ", color=" + color + ", isEven=" + isEven + "]";
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("   ||");
		System.out.println("   ||                   ||");
		System.out.println("||/||___                ||");
		System.out.println("|| /`   )____________||_/|");
		System.out.println("||/___ //_/_/_/_/_/_/||/ |");
		System.out.println("||(___)/_/_/_/_/_/_/_||  |");
		System.out.println("||     |_|_|_|_|_|_|_|| /|");
		System.out.println("||     | | | | | | | ||/||");
		System.out.println("||~~~~~~~~~~~~~~~~~~~||");
		System.out.println("||                   ||");		
	}

}
