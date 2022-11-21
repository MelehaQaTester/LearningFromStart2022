package com.cybertek.java.Conditions.SWITCH;

public class CappuccinoBuyer {
    public static void main(String [] args){
            String size = "big";
            double price = 0;
            int calories = 0;

            switch (size){
                case "Tall" :
                    System.out.println("Cappuccino "+size+" Size please");
                    calories= 90;
                    price=3.69;
                    break;
                case "tall":
                    System.out.println("Cappuccino "+size+" Size please");
                    calories= 90;
                    price=3.69;
                    break;
                case "Grande":
                    System.out.println("Cappuccino "+size+" Size please");
                    calories = 120;
                    price = 3.99;
                    break;
                case "grande":
                    System.out.println("Cappuccino "+size+" Size please");
                    calories = 120;
                    price = 3.99;
                    break;
                case "Venti":
                    System.out.println("Cappuccino "+size+" Size please");
                    calories = 150;
                    price = 4.29;
                    break;
                case "venti":
                    System.out.println("Cappuccino "+size+" Size please");
                    calories = 150;
                    price = 4.29;
                    break;
                default:
                    System.out.println("We don't serve that size of Cappuccino");




            }
            System.out.println("Total price: $"+price+"\nYou will consume "+calories+" cal of energy");
    }
}
