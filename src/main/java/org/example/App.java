package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        Student s1 = new Student("Rio", "cbs University");
        Student s2 = new Student("John", "abc University");
        Student s3 = new Student("Rohit", "ITI Bombay");
        Student s4 = new Student("Vinay", "Quantum University");
        System.out.println(s1.toString() + s2 + s3 + s4);

        session.beginTransaction();

        session.persist(s1);
        session.persist(s2);
        session.persist(s3);
        session.persist(s4);

        session.close();
        sf.close();

        System.out.println("Done...");
    }
}
