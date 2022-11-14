package ex_homework_cup;

public abstract class Cup {
	public static int counter=0;

	private int size;
	
	public Cup() {
		counter++;
	}

	public Cup(int size) {
		super();
		counter++;
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String display() {
		return "[size=" + size + "]";
	}

	@Override
	public String toString() {
		return "Cup";
	}

}
