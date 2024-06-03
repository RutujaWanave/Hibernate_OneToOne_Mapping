package com.learn.hibernatemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sessionFactory =cfg.buildSessionFactory();
        
        HodDepart h=new HodDepart();
        h.setName("shrinath");
        h.setIncome(2000000);
        h.setProfession("PHD");
        
        
        Department d=new Department();
        d.setName("Computer Science");
        d.setHod(h);
        
 Session session=sessionFactory.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.save(d);
        
        tx.commit();
        session.close();
    	
    	
    }
}
