package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.BusReservation;
import com.utility.hibernateUtility;

public class UpdateDetails {
	public void update()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the reservation number");
		int Reservation_no=sc.nextInt();
		
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();	
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  BusReservation br = (BusReservation)session.get(BusReservation.class,Reservation_no);
		  br.setName("Sanket");
		  br.setAge(20);
		  br.setSeat_no(15);
		  br.setBoarding_pt("Amravti");
		  br.setAlighting_Point("Nashik");
		  br.setMobile_no(992005899l);
		  
		  
		  System.out.println("Updated Successfully");
		  session.getTransaction().commit();
		  sessionFactory.close();

	}
}
