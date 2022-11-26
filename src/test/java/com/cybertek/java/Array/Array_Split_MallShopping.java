package com.cybertek.java.Array;

public class Array_Split_MallShopping {
    public static void main (String [] args){
        String [] Items = {"Shoes","Jacket","Gloves","Airpods","iPad","iphone 11 case"};
        double [] price = {99.99,150.0,9.99,250.0,439.50,39.99};
        int [] itemIDs = {12345,12346, 12347, 12348, 12349, 12350};
        System.out.println("-----Find The Index Of 'Gloves' in items array -------");
        // use for loop with conditions
        for (int i = 0; i<Items.length ; i++) {
            if (Items[i].equals("Gloves")) {
                System.out.println("Gloves found at index: " + i);
                System.out.println(Items[i]);
                break; // exit from loop
            }
        }
            System.out.println("-------Set boolean to true if first 'ipad' is found");
            boolean ipadExists =false;

            for (String eachStr:Items){
                if(eachStr.equalsIgnoreCase("iPad")){
                    ipadExists=true;
                    break;
                }
            }
            System.out.println("iPadExists = "+ipadExists);
            if(ipadExists){
                System.out.println("we bought the ipad");
            }else{
                System.out.println("we didn't buy the ipad we need to buy it");
            }

            System.out.println("----print out the report-----");
            for (int idx= 0; idx<Items.length; idx++){
                System.out.println(Items[idx]+" - $"+price[idx]+" - #"+itemIDs[idx]);
            }

            System.out.println("----Look for 'Jacket items and print all details ---");
            for (int idx=0; idx< Items.length;idx++) {
                if (Items[idx].equals("Jacket")){
                    System.out.println(Items[idx] + " - $" + price[idx] + " - #" + itemIDs[idx]);

                    break;
                }

            }


        }
    }
