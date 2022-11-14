package ex4_smartArray;

import java.util.Arrays;

public class SmartArray {
	private int[] smartArray;

	public SmartArray() {
		this.smartArray = new int[0];
	}
	
	public int find(int i) {
		return this.smartArray[i];
	}
	
	public void add(int num) {
		int[] tempArray = this.smartArray.clone();
		int size = tempArray.length;
		this.smartArray = new int[size + 1];
		for(int i = 0; i < size; i++) {
			this.smartArray[i] = tempArray[i];
		}
		this.smartArray[size] = num;
	}
	
	public void add(int index, int num) {
		int[] tempArray = this.smartArray.clone();
		int size = tempArray.length;
		this.smartArray = new int[size + 1];
		for(int i = 0; i < index; i++) {
			this.smartArray[i] = tempArray[i];
		}
		this.smartArray[index] = num;
		for(int i = index; i < size; i++) {
			this.smartArray[i+1] = tempArray[i];
		}
	}

	public void delete(int index) {
		// check if this is the last
		int[] tempArray = this.smartArray.clone();
		int size = tempArray.length;
		this.smartArray = new int[size - 1];
		for(int i = 0; i < index; i++) {
			this.smartArray[i] = tempArray[i];
		}
		for(int i = index + 1; i < size; i++) {
			this.smartArray[i - 1] = tempArray[i];
		}
	}

	@Override
	public String toString() {
		return "SmartArray smartArray=" + Arrays.toString(smartArray);
	}
	
}
