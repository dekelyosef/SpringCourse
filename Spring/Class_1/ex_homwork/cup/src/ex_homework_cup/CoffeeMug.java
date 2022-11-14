package ex_homework_cup;

public class CoffeeMug extends CoffeeCup {
	private boolean handle;

	public CoffeeMug() {
		super();
	}

	public CoffeeMug(int size, TYPES type, boolean handle) {
		super(size, type);
		this.handle = handle;
	}

	public boolean isHandle() {
		return handle;
	}

	public void setHandle(boolean handle) {
		this.handle = handle;
	}

	public String dispklay() {
		return "CoffeeMug" + super.display() + ", handle=" + handle + "]";
	}
	
	@Override
	public String toString() {
		return "CoffeeMug";
	}
	
	

}
