package com.company;

public class Main {

    public static void main(String[] args) {
       SportCar sportCar = new SportCar();
        Car car = new Car();
        Vehicle vehicle = new Vehicle();

        //Rzutowanie
        Vehicle VehicleWhoIsSportCar = new SportCar();
        VehicleWhoIsSportCar.go();//Nie ma turbo z klasy sport car
        SportCar FakeSportCar=(SportCar) VehicleWhoIsSportCar;//rzutowanie
        FakeSportCar.turbo();
        ((SportCar) VehicleWhoIsSportCar).turbo();//rzutowanie 2 sposob
        System.out.println("\n\n");


        Vehicle[] T = {sportCar, car, vehicle};
        for (Vehicle vehicles : T) {
            System.out.println("\nNew example");
            vehicles.go();
            if (vehicles instanceof Car)
            {
                ((Car) vehicles).horn();
            }
            if (vehicles instanceof SportCar)
            {
                ((SportCar) vehicles).turbo();
            }
        }
    }
}
