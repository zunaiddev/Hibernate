package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SimpleConfiguration {
    public void start(){
        Configuration config = new Configuration();
        config.configure();
        System.out.println("File Configured successfully");

        SessionFactory sf = config.buildSessionFactory();
        System.out.println("Session Factory created successfully");

        Session session = sf.openSession();
        System.out.println("Session Opened successfully");

        session.beginTransaction();

//        Student student = new Student(2,"Vinay","ITE Delhi");
//        session.persist(student);

        session.getTransaction().commit();

        session.close();
        sf.close();

        System.out.println("closed");
    }
}
