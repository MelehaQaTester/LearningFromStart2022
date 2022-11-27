package com.cybertek.java.Array;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String [] args){
        int [] num1 = {4,12,53};
        int [] num2 = {4,12,53};
        System.out.println(Arrays.equals(num1,num2));// true
        int[] num3 ={4,12,53,45};
        System.out.println(Arrays.equals(num1,num3));// false (the size is different)
        int [] num4 = {12,4,53};
        System.out.println(Arrays.equals(num1,num4));// false (the size is same but the index is different)

        String [] car1 = {"Toyota", "Honda","Tesla","BMW","Dodge"};
        String [] car2 = {"Toyota", "Honda","Tesla","BMW","Dodge"};
        String [] car3= {"toyota", "honda","tesla","bMW","dodge"};
        String [] car4= {"Toyota", "Honda","Tesla"};

        System.out.println("car1 == car 2 --->"+Arrays.equals(car1,car2));
        System.out.println("car1 == car 3 --->"+Arrays.equals(car1,car3));
        System.out.println("car2 == car 3 --->"+Arrays.equals(car2,car3));
        System.out.println("car2 == car 4 --->"+Arrays.equals(car2,car4));
        System.out.println("car1 == car 4 --->"+Arrays.equals(car1,car4));
        System.out.println("car3 == car 4 --->"+Arrays.equals(car3,car4));

        if(Arrays.toString(car2).equalsIgnoreCase(Arrays.toString(car3))){
            System.out.println("car2 == car 3 --case insensative->"+Arrays.equals(car2,car3));
        }


    }
}
