package com.cybertek.java.ClassVsObject;

public class StringComparison {
    public static void main (String [] args){
        String city = "new york";
        System.out.print("this is a case senasative boolean statment "+city.equals("New York")); // equals is a the case sensatives
        System.out.println("case INSensative  boolean statments "+city.equalsIgnoreCase("New YORK"));

    }
}
