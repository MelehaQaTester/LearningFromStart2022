package com.cybertek.OfficeHours.ifStatment;
import java.util.Scanner;
public class Season {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please input a number to determine the Season:");
        int numberOfSeason = scan.nextInt();
        String nameOfSeason="";
        int day = 0;
        int night = 0;

        if (numberOfSeason == 1){
            nameOfSeason = "Spring";
            day = 14;
            night = 10;
        }else  if( numberOfSeason == 2){
            nameOfSeason = "Summer";
            day = 16;
            night = 8;
        } else if (numberOfSeason == 3){
            nameOfSeason = "Fall";
            day = 14;
            night = 10;
        } else if( numberOfSeason ==4){
            nameOfSeason = "Winter";
            day = 12;
            night = 12;
        }
        if (numberOfSeason<1 || numberOfSeason >4){
            System.out.print("The Number you defined does not corrospond to Any  season");
        }else {
            System.out.println("Name Of Season: " + nameOfSeason);
            System.out.println("days: " + day);
            System.out.println("nigh: " + night);
        }

    }
}
