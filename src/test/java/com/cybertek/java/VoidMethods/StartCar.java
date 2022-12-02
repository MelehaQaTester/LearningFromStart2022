package com.cybertek.java.VoidMethods;

public class StartCar {
    public static void main(String [] args){
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }
    public static void seatInCar(){
        System.out.println("1. Open the door and sit in the car");
    }
    public static void shiftToDrive(){
        System.out.println("3. press the break pedal and shift to Drive");
    }
    public static void startTheCar(){
        System.out.println("2. Start Your car either by inserting the key to Ignition or pressing the button");
    }

    public static void pressGasPedal(){
        System.out.println("4. hold the steering wheel and press the the gass pedal");
    }
}
