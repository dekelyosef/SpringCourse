package ex_homework_animal;

public abstract class Carnivore extends Animal {
	private boolean isCarnivore;

	public Carnivore() {
		super();
	}

	public Carnivore(String father, String mother, boolean isCarnivore) {
		super(father, mother);
		this.isCarnivore = isCarnivore;
	}

	public boolean isCarnivore() {
		return isCarnivore;
	}

	public void setCarnivore(boolean isCarnivore) {
		this.isCarnivore = isCarnivore;
	}

	public String display() {
		return "Carnivore " + super.display() + ", isCarnivore=" + isCarnivore;
	}
	
}
