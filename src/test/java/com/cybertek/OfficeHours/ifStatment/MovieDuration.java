package com.cybertek.OfficeHours.ifStatment;
import java.util.Scanner;
public class MovieDuration {
    public static void main (String []  args ){
        Scanner scan = new Scanner (System.in);
        System.out.println("how long is the movie?");
        double length = scan.nextDouble();
        double price = 0;

        // single if statements

        if(length==1.0){
            price = 8.99;

        }

        if (length==1.5) {
            price = 10.50;
        }

        if (length==2.0){
            price = 12.99;

        }

        if (length == 2.5) {
            price = 14.50;
        }

        if (length>=3){
            price = 15.99;
        }
        if(length <=0){
            System.out.println("INVALID LenGTH");
        }else {
            System.out.println("cost of the movie: $"+price);
        }



        /*
        Multiple if else statements
        */

        if(length>=1.0 && length <1.5){
            price= 8.99;
        }else if (length>=1.5 && length<2.0){
            price = 10.50;

        }else if (length>2.0  && length<2.5){
            price = 12.99;

        }else if (length>=2.5 && length<3){
            price =14.50;

        }else if (length>=3){
            price = 15.99 ;

        }
        System.out.print("Price "+price);

    }
}
