package ex4_smartArray;

public class smartArrayProject {

	public static void main(String[] args) {
		SmartArray smartArray = new SmartArray();
		smartArray.add(1);
		smartArray.add(2);
		smartArray.add(3);
		
		System.out.println(smartArray.find(2));
		System.out.println(smartArray.toString());
		smartArray.add(1, 4);
		System.out.println(smartArray);
		smartArray.delete(1);
		smartArray.delete(2);
		System.out.println(smartArray);
	}

}
