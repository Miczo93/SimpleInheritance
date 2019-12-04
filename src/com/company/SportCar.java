package com.company;

public class SportCar extends Car{
    public SportCar() {
    }

    @Override
    void go() {
        System.out.println("Sport Car go");
    }

    void turbo(){
        System.out.println("Sport Car Exlusive");
    }
}
