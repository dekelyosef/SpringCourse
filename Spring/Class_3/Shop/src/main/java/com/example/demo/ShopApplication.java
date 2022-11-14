package com.example.demo;

import java.sql.Date;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Product;
import com.example.demo.entities.Transaction;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.TransactionRepository;


@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext configurableApplicationContext = 
				SpringApplication.run(ShopApplication.class, args);

		ProductRepository productRepo = configurableApplicationContext.getBean(ProductRepository.class);
		TransactionRepository transactionRepo = configurableApplicationContext.getBean(TransactionRepository.class);
		
		Transaction transaction1 = new Transaction(1, Date.valueOf("2022-07-01"), 1500);
		transactionRepo.save(transaction1);

		Transaction transaction2 = new Transaction(2, Date.valueOf("2022-07-01"), 2500);
		transactionRepo.save(transaction2);
		
		Product product1 = new Product(1, "Milk", 5, 4.5);
		product1.addTransaction(transaction1);
		productRepo.save(product1);
		
		System.out.println("-------------------------get all products--------------------------------");
		productRepo.findAll().forEach(product -> System.out.println(product.toString()));
		
		product1.setStock(4);
		productRepo.save(product1);
		
		Product product2 = new Product(2, "Sugar", 10, 8.9);
		product2.addTransaction(transaction1);
		productRepo.save(product2);

		Product product3 = new Product(3, "Eggs", 2, 12.8);
		product3.addTransaction(transaction1);
		productRepo.save(product3);
		
		transaction1.addProduct(product1);
		transaction1.addProduct(product2);
		transaction1.addProduct(product3);
		transactionRepo.save(transaction1);

		Product product4 = new Product(4, "Coffee", 18, 3.9);
		product4.addTransaction(transaction2);
		productRepo.save(product4);
		transaction2.addProduct(product4);
		transactionRepo.save(transaction2);

		
		System.out.println("-------------------------get all products--------------------------------");
		productRepo.findAll().forEach(product -> System.out.println(product.toString()));

		System.out.println("-------------------------get all products of transaction1--------------------------------");
		Optional<Transaction> transaction = transactionRepo.findById(1);
		transaction.get().getProducts().forEach(product -> System.out.println(product.toString()));

		System.out.println("-------------------------get all products of transaction2--------------------------------");
		transaction = transactionRepo.findById(2);
		transaction.get().getProducts().forEach(product -> System.out.println(product.toString()));
	}
}
