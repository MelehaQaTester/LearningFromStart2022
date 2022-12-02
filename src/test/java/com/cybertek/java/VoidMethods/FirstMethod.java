package com.cybertek.java.VoidMethods;

public class FirstMethod {
    public static void main (String [] args){
        displayMessage();// we are calling the method
        // calling this method 100 time
        for (int  i=1; i<=100; i++){
            System.out.print(i+" - ");
            displayMessage();

        }
    }
    public static void displayMessage(){

        System.out.println("Hello B22 Friends");
    }
}
