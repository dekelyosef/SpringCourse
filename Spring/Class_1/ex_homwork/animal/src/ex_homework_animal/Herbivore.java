package ex_homework_animal;

public abstract class Herbivore extends Animal {
	private String favoritePlant;

	public Herbivore() {
		super();
	}

	public Herbivore(String father, String mother, String favoritePlant) {
		super(father, mother);
		this.favoritePlant = favoritePlant;
	}

	public String getFavoritePlant() {
		return favoritePlant;
	}

	public void setFavoritePlant(String favoritePlant) {
		this.favoritePlant = favoritePlant;
	}

	public String display() {
		return "Herbivore " + super.display() + ", favoritePlant=" + favoritePlant;
	}

}
