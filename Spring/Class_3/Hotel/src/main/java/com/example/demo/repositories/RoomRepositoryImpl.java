package com.example.demo.repositories;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Room;

@Component
public class RoomRepositoryImpl {

    @Autowired
    private RoomRepository roomRepo;

	 public List<Room> getOccupiedRooms(Date date) {
			List<Room> rooms = roomRepo.findAll();
			List<Room> occupied = new ArrayList<Room>();
			rooms.forEach(room -> {
				if (date.after(room.getOccupiedSince()) && date.before(room.getOccupiedUntil())) {
					occupied.add(room);
				}
			});
			return occupied;
	}

	public void getTodayCustomers() {
		List<Room> occupiedRooms = getOccupiedRooms(new Date(System.currentTimeMillis()));
    	occupiedRooms.forEach(room -> {
    		room.getOccupiedBy().forEach(customer -> {
    			System.out.println(customer.getFirstName() + " " + customer.getLastName());
    		});
    	});
	}

}
