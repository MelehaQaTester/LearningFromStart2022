package com.cybertek.java.Array;

public class AwsZones {
    public static void main (String [] args){
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        String [] zonesArray = zones.split(",");
        for (String eachZone: zonesArray){
            System.out.println("Deploying "+app+" to: "+eachZone+"......");
            System.out.println("Deployment completed for "+eachZone);
        }
        System.out.println("----All deployment complete-----");

    }
}
