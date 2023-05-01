package com.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BusReservation")
public class BusReservation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Reservation_no")
	int Reservation_no;
	@Column(name="Name")
	private String Name;
	@Column(name="Age")
	private int Age;
	@Column(name="Mobile_no")
	private Long Mobile_no;
	@Column(name="Boarding_pt")
	private String Boarding_pt;
	@Column(name="Alighting_pt")
	private String Alighting_Point;
	@Column(name="Check_in")
    private LocalDate Check_in;
    @Column(name="Check_out")
    private LocalDate Chech_out;
	@Column(name="Seat_No")
	private int Seat_No;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Reservation_no")
	private SeatBooking seatbooking;
	
	public BusReservation()
	{
		
	}

	

	public BusReservation(String name, int age, Long mobile_no, String boarding_pt, String alighting_Point,
			LocalDate check_in, LocalDate chech_out, int seat_no) {
		super();
		Name = name;
		Age = age;
		Mobile_no = mobile_no;
		Boarding_pt = boarding_pt;
		Alighting_Point = alighting_Point;
		Check_in = check_in;
		Chech_out = chech_out;
		Seat_No = seat_no;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getAge() {
		return Age;
	}



	public void setAge(int age) {
		Age = age;
	}



	public Long getMobile_no() {
		return Mobile_no;
	}



	public void setMobile_no(Long mobile_no) {
		Mobile_no = mobile_no;
	}



	public String getBoarding_pt() {
		return Boarding_pt;
	}



	public void setBoarding_pt(String boarding_pt) {
		Boarding_pt = boarding_pt;
	}



	public String getAlighting_Point() {
		return Alighting_Point;
	}



	public void setAlighting_Point(String alighting_Point) {
		Alighting_Point = alighting_Point;
	}



	public LocalDate getCheck_in() {
		return Check_in;
	}



	public void setCheck_in(LocalDate check_in) {
		Check_in = check_in;
	}



	public LocalDate getChech_out() {
		return Chech_out;
	}



	public void setChech_out(LocalDate chech_out) {
		Chech_out = chech_out;
	}



	public int getSeat_no() {
		return Seat_No;
	}



	public void setSeat_no(int seat_no) {
		Seat_No = seat_no;
	}



	public SeatBooking seatbooking() {
		return seatbooking;
	}
	public void setSeatBooking(SeatBooking seatbooking) {
		this.seatbooking = seatbooking;
	}

	

}
