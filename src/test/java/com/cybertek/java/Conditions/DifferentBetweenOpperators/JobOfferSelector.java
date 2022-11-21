package com.cybertek.java.Conditions.DifferentBetweenOpperators;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "New york";
        int Salary = 120_000;
        boolean remote = true;
        boolean benefits = true;
        if(location.equalsIgnoreCase("new york") && Salary >=120000 && remote && benefits){
            System.out.println("Accept the offers");
            System.out.println("what is the interview process");
        }else{
            System.out.print("Lets consider another offer or negotiate another offer");
        }

    }
}
