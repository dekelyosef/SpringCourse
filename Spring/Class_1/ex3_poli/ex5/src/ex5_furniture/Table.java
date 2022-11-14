package ex5_furniture;

public class Table extends Dimensions {
	private int seatsNum;
	private String color;

	public Table() {}
	
	public Table(double length, double width, double height, String color, int seatsNum) {
		super(length, width, height);
		this.seatsNum = seatsNum;
		this.color = color;
	}

	public int getSeatsNum() {
		return seatsNum;
	}

	public void setSeatsNum(int seatsNum) {
		this.seatsNum = seatsNum;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String display() {
		return "Table" + super.display() + ", color=" + color + ", seatsNum=" + seatsNum + "]";
	}

	@Override
	public void draw() {
		System.out.println("   =====================");
		System.out.println("  /                   /");
		System.out.println(" /                   /|");
		System.out.println("===================== |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" | |               |  |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");
		System.out.println(" |                 |");		
	}

}
