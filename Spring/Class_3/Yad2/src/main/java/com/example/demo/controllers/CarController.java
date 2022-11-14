package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Car;
import com.example.demo.repository.CarsRepository;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	CarsRepository carsRepo;

	@PostMapping("/update")
	public void updateCar(@RequestBody Car car) {
		Optional<Car> wasFound = carsRepo.findById(car.getId());
		if (wasFound != null) {
			carsRepo.save(car);
		}
	}

	@DeleteMapping("/delete/{id}")
	public void deleteProductById(@PathVariable() int id) {
		carsRepo.deleteById(id);
	}
	

}
