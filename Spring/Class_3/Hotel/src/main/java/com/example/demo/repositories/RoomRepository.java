package com.example.demo.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Room;

@Repository
public interface RoomRepository extends JpaRepository <Room, Integer> {
	List<Room> getOccupiedRooms(Date date);
	void getTodayCustomers();
}