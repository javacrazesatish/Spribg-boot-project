package com.satya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.satya.domain.UserDetails;

public class App 
{
    public static void main( String[] args ){

		// Activate Hibernate s/w
		Configuration cfg = new Configuration();

		// Read and store HB cfg file mapping file data into configuration obj
		cfg = cfg.configure("hibernate.cfg.xml");

		// create SessionFactory obj
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		//get session obj
		Session openSession = sessionFactory.openSession();
		
		// get domain class obj
		UserDetails ud=new UserDetails();
//		ud.setId(1);
		ud.setUserName("rohit");
		ud.setMobileNo("0123456");
		ud.setBank("SBI");
		ud.setGovId("adhar");
		
		Transaction tx = null;
		try {
			tx = openSession.beginTransaction();
//			openSession.save(ud);// saves obj(insert)
			
			UserDetails userDetails1 = 	openSession.load(UserDetails.class, 1);//  2 create    proxy
			
			openSession.delete(ud);
			UserDetails userDetails = openSession.get(UserDetails.class, 1);//  fetch operation/ get data -->select persistence instruction 
		System.out.println("UserDetails Data Model "+userDetails);
			tx.commit();//completes the insert operation
		} catch (Exception e) {
			tx.rollback();
		}
		openSession.close();
		sessionFactory.close();
	}//main
}//clas
