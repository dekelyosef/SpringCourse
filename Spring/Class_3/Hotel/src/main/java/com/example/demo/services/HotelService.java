package com.example.demo.services;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Room;
import com.example.demo.errors.HandleException;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.repositories.RoomRepository;

@Service
public class HotelService implements IHotelService {

	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	private RoomRepository roomRepo;

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}

	@Override
	public Optional<Customer> getCustomerByFirstName(String name) {
		return customerRepo.findCustomerByFirstName(name);
	}

	@Override
	public List<Customer> getChildren() {
		return customerRepo.getChildren();
	}
	
	@Override
	public List<Room> getOccupiedRooms(Date date) {
		return (List<Room>) roomRepo.getOccupiedRooms(date);
	}

	@Override
	public void getTodayCustomers() {
		roomRepo.getTodayCustomers();
	}

	@Override
	public List<Room> getAllRooms() {
		return (List<Room>) roomRepo.findAll();
	}

	@Override
	public String getRoomStatus(int id) throws HandleException {                
		Room room = roomRepo.findById(id)
				.orElseThrow( () -> new HandleException("Room number " + String.valueOf(id) + " was not found"));
		List<Room> rooms = getOccupiedRooms(new Date(System.currentTimeMillis()));
		if(rooms.contains(room)) {
			return "occupied";
		}
		return "vacant";
	}
	
	public List<Room> getVacantRoomsByDate(Date date) {
		List<Room> rooms = getAllRooms();
		List<Room> vacantRooms = new ArrayList<Room>();
		List<Room> occupiedRooms = getOccupiedRooms(date);
		rooms.forEach(room -> {
			if(!occupiedRooms.contains(room)) {
				vacantRooms.add(room);
			}
		});
		return vacantRooms;
	}


	@Override
	public List<Room> getVacantRooms() {
		return getVacantRoomsByDate(new Date(System.currentTimeMillis()));
	}

	@Override
	public List<Room> getTomorrowVacantRooms() {
		LocalDateTime tomorrow = LocalDateTime.now().plusDays(1);
		return getVacantRoomsByDate(Date.valueOf(tomorrow.toLocalDate()));
	}
	

	@Override
	public void addNewRoom(List<Customer> customers, Date from, Date to) {
		Room vacantRoom = getVacantRoom(from, to);
		if (vacantRoom != null) {
			customers.forEach(customer -> {
				customer.setRoomNumber(vacantRoom.getRoomNumber());
				customerRepo.save(customer);
			});
		}		
	}
	
	public Room getVacantRoom(Date from, Date to) {
		List<Room> rooms = getAllRooms();
		for(int i=0; i <= rooms.size(); i++) {
			if(rooms.get(i).getOccupiedSince().after(to) && rooms.get(i).getOccupiedUntil().before(from)) {
				return rooms.get(i);
			}
		}
		return null;
	}

}
