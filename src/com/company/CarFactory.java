package com.company;

public class CarFactory {

    public static Vehicle getVehicle(String vehicleType){

        switch (vehicleType) {
            case "BMW":
                return new BMW();
            case "Audi":
                return new Audi();
            case "Mercedes":
                return new Mercedes();
            default:
                throw new RuntimeException("No such vehicle");
        }

    }

}
