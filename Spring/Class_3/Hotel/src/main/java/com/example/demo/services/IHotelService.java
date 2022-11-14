package com.example.demo.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Room;
import com.example.demo.errors.HandleException;

public interface IHotelService {

	List<Customer> getAllCustomers();
	Optional<Customer> getCustomerByFirstName(String name);
	List<Customer> getChildren();
	List<Room> getAllRooms();
	String getRoomStatus(int id) throws HandleException;
	List<Room> getVacantRooms();
	List<Room> getTomorrowVacantRooms();
	List<Room> getOccupiedRooms(Date date);
	void getTodayCustomers();
	void addNewRoom(List<Customer> customers, Date from, Date to);
}
