package com.satya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.satya.model.Products;




public class App 
{
    public static void main( String[] args ){
        System.out.println( "Project Running!" );
        
//        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        // Build the SessionFactory
        SessionFactory factory = cfg.buildSessionFactory();

        // Open a new session
        Session session = factory.openSession();
        
        // Do your Hibernate operations using the 'session' object
        
        // Close the session and factory when done
        session.close();
        factory.close();
//        Products prd=new Products();
//        prd.setpId(1);
//        prd.setpName("Lupi");
//        prd.setPrize(122.34);
//        prd.setpType("tab");
//        
//        System.out.println(prd);
//        System.out.println(openSession.save(prd));
        
    }
}
