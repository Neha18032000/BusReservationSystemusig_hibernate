package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SeatBooking")
public class SeatBooking 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Reservation_no")
	private int Reservation_no;
	@Column(name="Seat_No")
	private int Seat_no;
	@Column(name="Bus_Type")
	private String Bus_Type;
	@Column(name="Amount")
	private double Amount;
	
	
	public SeatBooking()
	{
		
	}


	public SeatBooking(int seat_no, String bus_Type, double amount) {
		super();
		Seat_no = seat_no;
		Bus_Type = bus_Type;
		Amount = amount;
	}


	public int getReservation_no() {
		return Reservation_no;
	}


	public void setReservation_no(int reservation_no) {
		Reservation_no = reservation_no;
	}


	public int getSeat_no() {
		return Seat_no;
	}


	public void setSeat_no(int seat_no) {
		Seat_no = seat_no;
	}


	public String getBus_Type() {
		return Bus_Type;
	}


	public void setBus_Type(String bus_Type) {
		Bus_Type = bus_Type;
	}


	public double getAmount() {
		return Amount;
	}


	public void setAmount(double amount) {
		Amount = amount;
	}

}
