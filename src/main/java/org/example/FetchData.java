package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sf = configuration.buildSessionFactory();

        Session session = sf.openSession();

        Student st = session.get(Student.class, 1);
//        session.clear();
//        Student st2 = session.get(Student.class, 1);
//        Student s1 = session.load(Student.class, 2);
//        Student s2 = session.load(Student.class, 2);
//        System.out.println(s1);
//        System.out.println(s2);

        System.out.println(st);

        sf.close();
        session.close();
        System.out.println("Done........");
    }
}
