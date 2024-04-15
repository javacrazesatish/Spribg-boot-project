package com.satya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
     // Activate Hibernate s/w
     		Configuration cfg = new Configuration();

     		// Read and store HB cfg file mapping file data into configuration obj
     		cfg = cfg.configure("hibernate.cfg.xml");

     		// create SessionFactory obj
     		SessionFactory sessionFactory = cfg.buildSessionFactory();
     		//get session obj
     		Session openSession = sessionFactory.openSession();
     		
     		Patient patient =new Patient();
     		patient.setName("Rishabh Pant");
     		patient.setAge(28);
     		patient.setAddress("Delhi");
     		
     		Transaction tx = null;
    		try {
    			tx = openSession.beginTransaction();
    			openSession.save(patient);// saves obj(insert)
    			
    			
    			tx.commit();//completes the insert operation
    		} catch (Exception e) {
    			tx.rollback();
    		}
    		openSession.close();
//    		sessionFactory.close();
    }
}
