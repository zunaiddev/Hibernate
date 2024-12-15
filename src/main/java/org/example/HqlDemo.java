package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HqlDemo {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure();

        SessionFactory sf = config.buildSessionFactory();

        Session session = sf.openSession();

        final String query = "from Student";
        final String query2 = "from Student where name=:x";
        Query q = session.createQuery(query);
        Query q2 = session.createQuery(query2);
        q2.setParameter("x", "Rio");

        Student st = (Student) q2.uniqueResult();
        System.out.println(st);
        //single - Unique uniqueResult()
        //multiple - list list()

//        List<Student> list = q.list();
//
//        for (Student student : list) {
//            System.out.println(student);
//        }

        sf.close();
        session.close();
        System.out.println("Done...");
    }
}
