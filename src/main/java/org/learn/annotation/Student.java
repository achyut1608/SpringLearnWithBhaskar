package org.learn.annotation;

import org.learn.CustomAnnotations.CustomAnnotation1;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;

@Repository
public class Student {
    private int id;


    private String name;

    @CustomAnnotation1(value="Address,Bangalore",abcd=1)
    private String address;

    public void getAddress(){
        Field field = null;
        try {
            field = this.getClass().getDeclaredField("address");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        CustomAnnotation1 a = field.getAnnotation(CustomAnnotation1.class);
        System.out.println(a.value() + " " + a.abcd());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
