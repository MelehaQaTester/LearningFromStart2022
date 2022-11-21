package com.cybertek.java.Casting;

public class ShoppingBalanceCalculator {
    public static void main(String [] args){
        double balance = 345.55;
        double price1 = 20.88;
        double price2Shoes= 89.99;
        double price3Socks= 15 ;
        double  remainingBalance = balance-price1+ price2Shoes +price3Socks;
        System.out.println("your initial balance: $"+balance+"\nYour remaining balance: $"+remainingBalance);
        int remsiningBalanceWithOutCents=(int)remainingBalance;
        System.out.println("Your remaining balance without Cents: $"+remsiningBalanceWithOutCents);

    }
}
class CastingExamples{
    public static void main(String [] args){
        // byte -  short -int- long
        byte num1 =100;
        short shnum1=num1;
        // float - double
        float flnum1 = 123.32f;
        double num2 = flnum1;


        int num11 = 55;
        byte num22=(byte) num11;

    }
}
