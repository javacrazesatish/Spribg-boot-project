package com.satya.Hibernate_100_Doctor_Service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.satya.Hibernate_100_Doctor_Service.entity.Doctor;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        //
        SessionFactory factory=cfg.buildSessionFactory();
        //open session
        Session session=  factory.openSession();
        //create new obj for doctor
        Doctor doctor=new Doctor();
        doctor.setName("Satya");
        doctor.setSpecialization("java");
        doctor.setPhoneNumber("0707070707");
        
       
        //
        Transaction transaction=null;
        try {
        	transaction	 = session.beginTransaction();
        	session.save(doctor);
        	transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			transaction.rollback();
		}
       
        session.close();
        
    }
}
