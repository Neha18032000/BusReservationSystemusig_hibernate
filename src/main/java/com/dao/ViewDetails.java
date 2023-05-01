package com.dao;

import java.util.List;

import com.entity.BusReservation;
import com.utility.hibernateUtility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class ViewDetails {
	public void view()
	{
		SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
		  Session session = sessionFactory.openSession();
		  session.beginTransaction();
		  
		  Query<BusReservation> query1=session.createQuery("from BusReservation");
	         
	        List<BusReservation> result=query1.list();
	         
       
       
     for(BusReservation br:result)
    {
     	System.out.println(br.getName());
     	System.out.println(br.getCheck_in());
     	System.out.println(br.getSeat_no());
     	

       }

	  session.getTransaction().commit();
	  session.close();
	  sessionFactory.close();

}

}
