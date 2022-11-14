package com.iis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Program {
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext context = SpringApplication.run(Program.class, args);
			
		Test test = context.getBean(Test.class);
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		Thread t3 = new Thread(test);		
		Thread t4 = new Thread(test);
		
		t1.start();
		t2.start();
		
		t3.sleep(4000);
		t3.start();
		
		t4.start();
	
	}

}