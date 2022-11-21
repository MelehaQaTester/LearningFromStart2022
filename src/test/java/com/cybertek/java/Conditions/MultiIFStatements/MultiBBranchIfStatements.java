package com.cybertek.java.Conditions.MultiIFStatements;

public class MultiBBranchIfStatements {
    public static void main (String [] args){
        int day =20;
        String whichDay = "";
        if(day==1)
        {
            whichDay = "Monday";
        }else if(day == 2){
            whichDay = "Tuesday";
        }else if(day==3){
            whichDay = "Wednesday";
        }else {
            whichDay="Java day";
        }
        System.out.println(whichDay);
        System.out.println("Everyday code java");
    }
}
