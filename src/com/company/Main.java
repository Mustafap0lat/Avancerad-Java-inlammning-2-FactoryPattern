package com.company;

public class Main {

    public static void main(String[] args) {

        String vehicleType = "BMW";
        CarFactory.getVehicle(vehicleType).run();

        vehicleType = "Audi";
        CarFactory.getVehicle(vehicleType).run();

        vehicleType = "Mercedes";
        CarFactory.getVehicle(vehicleType).run();

        System.out.println("Lets go!");
    }
}
