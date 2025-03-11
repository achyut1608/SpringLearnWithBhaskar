package org.learn.xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(" bean-factory-demo.xml");
        //ApplicationContext factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
        org.learn.xml.Student student =(org.learn.xml.Student) applicationContext.getBean("student123");
        Student student1 =applicationContext.getBean("student123",Student.class);
        System.out.println("Student1 : "+student1);
        System.out.println("Stucent.hashcode : " + student.hashCode());
        System.out.println("Stucent1.hashcode : " + student1.hashCode());

        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.learn.core.annotation");
        context.refresh();
        Student student = context.getBean("student",Student.class);
        System.out.println(student);*/

    }

}
