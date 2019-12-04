package com.company;

public class Car extends Vehicle {
    public Car() {
    }

    @Override
    void go() {
        System.out.println("Car go");
    }

    void horn(){
        System.out.println("Car Exclusive");
    }
}
