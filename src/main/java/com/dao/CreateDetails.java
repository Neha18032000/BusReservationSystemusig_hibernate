package com.dao;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.BusReservation;
import com.entity.SeatBooking;
import com.utility.hibernateUtility;




public class CreateDetails {
	public void create()
	{
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  LocalDate Check_in=LocalDate.now() ;
	      LocalDate Check_out=LocalDate.now() ;
	      
	      BusReservation br = new BusReservation("Neha",23,998643564l,"Phaltan","Satara",Check_in,Check_out,10);
	      BusReservation br1 = new BusReservation("Ankita",21,575800874l,"Pune","Mumbai",Check_in,Check_out,11);
	      BusReservation br2 = new BusReservation("Sakshi",19,994005899l,"Mumbai","Kolhapur",Check_in,Check_out,12);
	      BusReservation br3 = new BusReservation("Pranjal",16,918609226l,"Karad","Sangola",Check_in,Check_out,13);
	      
	     
	      SeatBooking seatbooking=new SeatBooking();
	      seatbooking.setSeat_no(10);
	      seatbooking.setBus_Type("AC");
	      seatbooking.setAmount(125);
	      
	      SeatBooking seatbooking1=new SeatBooking();
	      seatbooking1.setSeat_no(11);
	      seatbooking1.setBus_Type("Non-AC");
	      seatbooking1.setAmount(300);
	      
	      SeatBooking seatbooking2=new SeatBooking();
	      seatbooking2.setSeat_no(12);
	      seatbooking2.setBus_Type("AC");
	      seatbooking2.setAmount(800);
	      
	      SeatBooking seatbooking3=new SeatBooking();
	      seatbooking3.setSeat_no(13);
	      seatbooking3.setBus_Type("Non-AC");
	      seatbooking3.setAmount(150);
	      
	      
	      br.setSeatBooking(seatbooking);
	      session.save(br);
	      session.save(seatbooking);
	      
	      br1.setSeatBooking(seatbooking1);
	      session.save(br1);
	      session.save(seatbooking1);
	      
	      br2.setSeatBooking(seatbooking2);
	      session.save(br2);
	      session.save(seatbooking2);
	      
	      br3.setSeatBooking(seatbooking3);
	      session.save(br3);
	      session.save(seatbooking3);
	      
	      System.out.println("Inserted Successfully");
		  session.getTransaction().commit();
		  session.close();
		  sessionFactory.close();

	      
	}
	
	

}
