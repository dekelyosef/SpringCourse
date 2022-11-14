package ex_homework_animal;

public abstract class Animal implements Soundable {
	public static int counter=0;
	
	private String father;
	private String mother;
	public Animal() {
		counter++;
	}
	public Animal(String father, String mother) {
		this.mother = mother;
		this.father = father;
		counter++;
	}
	
	public String getMother() {
		return mother;
	}
	
	public void setMother(String mother) {
		this.mother = mother;
	}
	
	public String getFather() {
		return father;
	}
	
	public void setFather(String father) {
		this.father = father;
	}
	
	public String display() {
		return "[mother=" + mother + ", father=" + father;
	}

}
