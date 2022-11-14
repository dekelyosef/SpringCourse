package ex1;

import java.util.ArrayList;

public class Ex1 implements Runnable {
	
	public static ArrayList<Double> list;
	
	public Ex1() {
		list = new ArrayList<>();
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			list.add(Math.random());
		}
	}
}
