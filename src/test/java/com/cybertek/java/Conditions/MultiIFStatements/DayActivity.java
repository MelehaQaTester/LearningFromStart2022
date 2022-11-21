package com.cybertek.java.Conditions.MultiIFStatements;

public class DayActivity {
    public static void main (String [] args ){
        String weather = "Sunny";
        if (weather.equalsIgnoreCase("sunny")){
            System.out.println("Go to park, hiking an code java");
        }else if(weather.equalsIgnoreCase("rainy")){
            System.out.println("Stay home, drink tea, and code java");
        }else if (weather.equalsIgnoreCase("snowy")){
            System.out.println("Clean the car then build snowman, drink hot chocolate, and code java");
        }else if (weather.equalsIgnoreCase("windy")){
            System.out.println("Get ready for power loss, fly a kite, and cod java");
        }else{
            System.out.println("Just keep coding java");
        }
    }
}
