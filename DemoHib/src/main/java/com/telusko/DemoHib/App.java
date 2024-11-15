package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
/*
  Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien telusko = new Alien();
    	telusko.setAid(101);
    	telusko.setAname("Anika");
    	telusko.setColor("pink");
    	
    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	//presist the data store data into database
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(telusko);
       tx.commit();
    }
}
