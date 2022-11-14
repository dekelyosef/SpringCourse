package com.example.demo.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Room;
import com.example.demo.services.IHotelService;

@RestController
@RequestMapping("/room")
public class RoomController {

	@Autowired
    private IHotelService hotelService;
	
    public RoomController(IHotelService hotelService) {
        this.hotelService = hotelService;
    }

    public List<Room> getOccupiedRooms(@RequestParam Date date) {
    	return hotelService.getOccupiedRooms(date);
    }
    
    @GetMapping("/getNumOfOccupiedRooms")
    public int getNumOfOccupiedRooms(@RequestParam Date date) {
    	return getOccupiedRooms(date).size();
    }
    
    @GetMapping("/getTodayCustomers")
    public void getTodayCustomers() {
    	hotelService.getTodayCustomers();
    }

}
