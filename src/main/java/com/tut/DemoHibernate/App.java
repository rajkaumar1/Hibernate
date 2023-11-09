package com.tut.DemoHibernate;

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
        System.out.println( "Project started");
        
     
        Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        Employee e = new Employee();
        
        e.setId(103);
        e.setName("Ajay");
        e.setSalary(20000);
        
        System.out.println(e);
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(e);
        tx.commit();
        session.close();
        
        
        
   }
}

