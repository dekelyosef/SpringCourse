package ex_homework_animal;

public abstract class Omnivore extends Animal {
	private boolean vegetarian;

	public Omnivore() {
		super();
	}

	public Omnivore(String father, String mother, boolean vegetarian) {
		super(father, mother);
		this.vegetarian = vegetarian;
	}

	public boolean vegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String display() {
		return "Omnivore " + super.display() + ", vegetarian=" + vegetarian;
	}
	
}
