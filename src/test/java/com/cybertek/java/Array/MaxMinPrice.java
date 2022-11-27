package com.cybertek.java.Array;

public class MaxMinPrice {
    public static void main (String [] args){
        String [] Items = {"Shoes","Jacket","Gloves","Airpods","iPad","iphone 11 case"};
        double [] price = {99.99,150.0,9.99,250.0,439.50,39.99};
        int [] itemIDs = {12345,12346, 12347, 12348, 12349, 12350};

        /**
         * Find and print detail of most expensive item
         * iPad
         */

        int maxIndex = 0;
        double max = price[maxIndex];
        for (int i =0 ; i<price.length; i++){
            if(max<price[i]){
                maxIndex=i;
                max = price[i];
            }
        }
        System.out.println(Items[maxIndex]+" - $"+price[maxIndex]+" - #"+itemIDs[maxIndex]);

        /**
         * Find and print the least expensive item
         * gloves
         */
        int minIndex = 0;
        double min = price[minIndex];
        for (int i =0 ; i<price.length; i++){
            if(min>price[i]){
                minIndex=i;
                min = price[i];
            }
        }
        System.out.println(Items[minIndex]+" - $"+price[minIndex]+" - #"+itemIDs[minIndex]);

    }
}
