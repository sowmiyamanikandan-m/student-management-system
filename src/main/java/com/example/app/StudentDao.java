package com.example.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveStudent(Student student) {

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(student);

        tx.commit();

        session.close();

        System.out.println("Student saved successfully!");
    }
}
