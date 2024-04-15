package com.satya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.satya.model.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// Active HF / configure cfg file
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// create session factory Obj
		SessionFactory factory = cfg.buildSessionFactory();
		// create session
		Session ses = factory.openSession();

		// create java obj and setvalues
		Product prod = new Product();
//        prod.setId(5);
		prod.setP_name("peracetamol");
		prod.setType("Oral");
		prod.setPrize(100.0);

		Transaction tx=null;
		try {
			tx=ses.beginTransaction();
			// save obj
//			ses.delete(prod);
			ses.save(prod);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
		

	}
}
