package org.learn.xml;

public class Student {
    String name;
    int age;
    org.learn.xml.Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public org.learn.xml.Address getAddress() {
        return address;
    }

    public void setAddress(org.learn.xml.Address address) {
        this.address = address;
    }

    public String toString(){
        return "name : " + name + " Age : " + age + " address : " + address;
    }

}
