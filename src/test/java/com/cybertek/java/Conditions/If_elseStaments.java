package com.cybertek.java.Conditions;
import java.util.Scanner;
public class If_elseStaments {
    public static void main (String [] args ){
        if (10>5){
            System.out.println("Condition is true");
        }else{
            System.out.println("Condition is false");
        }

        int count = 25;
        if (count>5){
            System.out.println("Condition is true");
        }else{
            System.out.println("Condition is false");
        }
        byte age = 26;
        if(age >18){
            System.out.println("You can vote!");
            System.out.println("Age is greater or equal to 18");
        }else {
            System.out.println("I am sorry to let you  know, you are not old enough to vote");
        }


    }
}
class AmazonFreeShipping{
    public static void main (String [] args){
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter total price");
        double totalPrice = scan.nextDouble();
        if (totalPrice>=25){
            System.out.println("FREE SHIPPING ELIGIBLE. Your order total: $"+totalPrice);
        }else{
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. Your order total is @10.");
            System.out.println("less than minimum of $25");
        }
    }
}
