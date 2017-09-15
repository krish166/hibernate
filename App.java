package com.krish;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	
	public static void main(String[] args) {
		
		Manager m = new Manager();
		
		m.setName("john");
		
		Flowershop fs = new Flowershop();
		
		fs.setFname("abc");
		fs.setSales("20");
		
		
		m.setFs(fs);
		
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		

		session.save(m);
		session.beginTransaction();
		

		
		session.getTransaction().commit();
		
		session.close();
		
		
	}
}
