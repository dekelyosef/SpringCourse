package ex_homework_cup;

public class TeaCup extends Cup {
	private boolean withMint;

	public TeaCup() {
		super();
	}

	public TeaCup(int size, boolean withMint) {
		super(size);
		this.withMint = withMint;
	}

	public boolean isWithMint() {
		return withMint;
	}

	public void setWithMint(boolean withMint) {
		this.withMint = withMint;
	}

	public String display() {
		return "TeaCup" + super.display() + ", withMint=" + withMint + "]";
	}
	
	@Override
	public String toString() {
		return "TeaCup";
	}

}
