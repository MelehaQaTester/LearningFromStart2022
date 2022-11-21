package com.cybertek.java.Conditions.MultiIFStatements;

public class IfWithOutElse {
    public static void main(String [] args){
        int year = 2020;
        if(year==2020){
            System.out.println("ovid19 pandemic Year");
            System.out.println("Wear mask and keep distance");
        }
        String country = "USA";
        if (country.equals("USA")){
            System.out.println("Washington DC is the capital");
            System.out.println("White house is on Pennsylvania ave");

        }
        System.out.println("Welcome to  "+country);
    }
}
