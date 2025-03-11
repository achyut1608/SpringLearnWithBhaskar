package org.learn.core.xml;

public class Student {
    private String name;
    private int age;
    private Address1 address;

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address1 getAddress() {
        return address;
    }

    public void setAddress(Address1 address) {
        this.address = address;
    }

    public String toString(){
        return "name : " + name + " Age : " +age+ " Address : "+address;
    }

}
