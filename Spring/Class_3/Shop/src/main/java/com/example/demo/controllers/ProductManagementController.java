package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.repository.ProductRepository;

@RestController
@RequestMapping("/productManagement")
public class ProductManagementController {
	
	@Autowired
    private ProductRepository productRepository;
	
	@PostMapping("/add")
	public Product addNewProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@PostMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		if (productRepository.findAll().contains(product)) {
			product.setStock(product.getStock()-1);
		}
		return productRepository.save(product);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteProductById(@PathVariable() int id) {
		productRepository.deleteById(id);
	}
	
}
