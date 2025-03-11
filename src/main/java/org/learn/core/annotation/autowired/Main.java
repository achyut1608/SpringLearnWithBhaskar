package org.learn.core.annotation.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.learn.annotation.autowired");
        User u = context.getBean("user", User.class);
        u.getEngine();
        u.getVehicle().engine();
        u.getByName().engine();
    }
}
