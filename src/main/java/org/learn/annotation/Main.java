package org.learn.annotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.learn.annotation");
        org.learn.annotation.inner.Student s = context.getBean("innerStudent",org.learn.annotation.inner.Student.class);
        org.learn.annotation.Student outerStudent = context.getBean("student", org.learn.annotation.Student.class);

        s.setId(1);
        s.setName("Test");

        outerStudent.setId(10);
        outerStudent.setName("outer student");
        System.out.println("Student : " +s);
        System.out.println("Outer student : " + outerStudent);
        outerStudent.getAddress();


    }
}