package com.example.demo.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;

import lombok.Data;

@Entity
@Data
public class Room {
	
	@Id
    @Column(name = "room_number")
	private int roomNumber;

    @Column(name = "floor_number")
	@Digits(message="Invalid number", integer = 2, fraction = 0)
	private int floorNumber; // 1-20

    @Column(name = "occupied_since")
	private Date occupiedSince;

    @Column(name = "occupied_until")
	private Date occupiedUntil;
    
	@OneToMany(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name = "customer_room")
	private List<Customer> occupiedBy;

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public Date getOccupiedSince() {
		return occupiedSince;
	}

	public void setOccupiedSince(Date occupiedSince) {
		this.occupiedSince = occupiedSince;
	}

	public Date getOccupiedUntil() {
		return occupiedUntil;
	}

	public void setOccupiedUntil(Date occupiedUntil) {
		this.occupiedUntil = occupiedUntil;
	}

	public List<Customer> getOccupiedBy() {
		return occupiedBy;
	}

	public void setOccupiedBy(List<Customer> occupiedBy) {
		this.occupiedBy = occupiedBy;
	}

	

}
