package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.BusReservation;
import com.utility.hibernateUtility;

public class DeleteDetails {
	public void delete() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the reservation number");
		int Reservation_no=sc.nextInt();
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		BusReservation br = (BusReservation)session.load(BusReservation.class, Reservation_no);
		session.delete(br);
		
		  System.out.println("Deleted Successfully");
		  session.getTransaction().commit();
		     sessionFactory.close();

	}

	

}
