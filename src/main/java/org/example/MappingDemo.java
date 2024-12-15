package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
    public static void main(String[] args) {
        Configuration config = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        Answer ans1 = new Answer(11, "Java is a Programming Language");
        Answer ans2 = new Answer(12, "Hibernate is used to connect application with Database");
        Answer ans3 = new Answer(13, "Easy to use");

        Question question1 = new Question(1, "What is Java", ans1);
        Question question2 = new Question(2, "Why is Hibernate", ans2);
        Question question3 = new Question(3, "Why is Hibernate", ans3);

//        session.persist(ans1);
//        session.persist(ans2);
//        session.persist(ans3);

        session.persist(question1);
//        session.persist(question2);
//        session.persist(question3);

        session.getTransaction().commit();

        sf.close();
        session.close();
        System.out.println("Done...");
    }
}
