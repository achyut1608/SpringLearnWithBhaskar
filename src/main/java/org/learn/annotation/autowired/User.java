package org.learn.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

    // calling by Type
    @Autowired
    Hyundai vehicle1;
    //Honda vehicle1;
    //toyota vehicle1;


    @Qualifier("hyundai")
    // it will throw ambiguity since honda,hyundai, toyota implementing vehicle interface so it will not distinguish which bean is getting called
    // so to resolve ambiguity we are using @Qualifier annotation
    @Autowired
    Vehicle vehicle;

    // by name
    @Autowired
    //Vehicle honda;
    //Vehicle hyundai;
    Vehicle toyota;

    public void getEngine(){
        vehicle.engine();
    }

    public Vehicle getVehicle(){
        return vehicle1;
    }

    public Vehicle getByName(){
        return toyota;
    }
}
