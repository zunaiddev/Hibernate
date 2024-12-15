package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sf = configuration.buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

//        Certificate cert = new Certificate("HackerRank", "1 Month");
//        Student st = new Student("John","Quantum University", cert);
//
//        Certificate cert2 = new Certificate("Android", "1 Month");
//        Student st2 = new Student("Zubair","Quantum University", cert);

//        //save objects
//        session.persist(st);
//        session.persist(st2);

        tx.commit();

        sf.close();
        session.close();
        System.out.println("Done.....");
    }

}
