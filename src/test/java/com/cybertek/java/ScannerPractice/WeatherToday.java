package com.cybertek.java.ScannerPractice;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the Weather?");
        String weather = scan.next();
        System.out.println(weather+" - is  a nice day today!");

    }
}
