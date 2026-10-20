package com.example.app;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.cfg.xml");

        StudentDao dao =
                (StudentDao) context.getBean("studentDao");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Course Name: ");
        String coursename = sc.nextLine();

        System.out.println("Enter Duration: ");
        int duration = sc.nextInt();

        Student s1 = new Student(coursename, duration);

        dao.saveStudent(s1);

        System.out.println(
                "✔ Student details saved successfully to database!"
        );

        System.out.println("✔ Done!");

        sc.close();
    }
}