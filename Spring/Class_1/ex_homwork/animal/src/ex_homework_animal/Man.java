package ex_homework_animal;

public class Man extends Omnivore implements Soundable {
	private int id;

	public Man(int id) {
		super();
		this.id = id;
	}

	public Man(String father, String mother, boolean vegetarian, int id) {
		super(father, mother, vegetarian);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String display() {
		return "Man " + super.display() + ", id=" + id + "]";
	}

	@Override
	public void makeSound() {
		System.out.println("Hello World!");
	}

	
}
