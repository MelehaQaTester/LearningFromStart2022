package com.cybertek.OfficeHours;

import java.util.Scanner;
public class Rectangle {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
         double length,width,Area,Perimeters;
        System.out.println("length: ");
        length = scan.nextInt();
        System.out.println("Width: ");
        width= scan.nextInt();
        Area = length*width;
        Perimeters = 2*Area;
        System.out.println("Length of rectnagle is: "+length+" Width is: "+width+" Area of rectangle  is: "+Area+" Perometer of rectangle is: "+Perimeters);


    }
}


class calculating {
    public static void  main (String [] args){
        // when coding outside of intellij
        // first save the package with the .java at the end
        // then create the packahe and main method
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Seconds:");
        int inputseconds, hour, min, seconds;
        inputseconds = scan.nextInt();
		/*
		how many second are in an hour?
		60 sec = 1min
		60 min = 1 hour
		60*60 = 3600
		*/
        hour = inputseconds/3600;
        // min = (inputseconds%3600)/60;
        // seconds = (inputseconds%3600)%60; or
        inputseconds%=3600;
        min = inputseconds/60;
        seconds = inputseconds%60;
        System.out.println(hour+" hours, "+min+" minutes, and "+seconds+" seconds");

    }

}
