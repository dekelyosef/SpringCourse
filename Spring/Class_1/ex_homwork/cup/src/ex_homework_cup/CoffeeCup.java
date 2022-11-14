package ex_homework_cup;

enum TYPES { blackCoffee, espresso, instantCoffee, filter }

public abstract class CoffeeCup extends Cup {
	private TYPES type;
	
	public CoffeeCup() {
		super();
	}

	public CoffeeCup(int size, TYPES type) {
		super(size);
		this.type = type;
	}

	public TYPES getType() {
		return type;
	}

	public void setType(TYPES type) {
		this.type = type;
	}

	public String display() {
		return "CoffeeCup [" + super.display() + ", type=" + type + "]";
	}

	@Override
	public String toString() {
		return "CoffeeCup";
	}

}
