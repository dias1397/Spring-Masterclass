package com.joaodias.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                                    .configure()
                                    .addAnnotatedClass(Student.class)
                                    .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            System.out.println("Creating a new student object...");
            Student tempStudent = new Student("Joâo", "Dias", "joao@gmail.com");

            session.beginTransaction();
            session.save(tempStudent);
            session.getTransaction().commit();

            System.out.println("Done");
        } finally {
            factory.close();
        }
    }

}
