package com.cybertek.java.Conditions.DifferentBetweenOpperators;

public class AndOperatorPrractice {
    public static void main(String [] args){
        boolean onSale = true;
        boolean freeShipping = false;
        String itemName = "Bike";
        if(onSale & freeShipping){
            System.out.print("Add "+itemName+" to the cart");
        }
        onSale = true;
        freeShipping = false;
        itemName = "Wooden Spoon";
        if(onSale && freeShipping && itemName.equalsIgnoreCase("Wooden Spoon")){
            System.out.print("Add "+itemName+" to the cart");

        }else {
            System.out.print("Continue Shopping");

        }


    }

}
