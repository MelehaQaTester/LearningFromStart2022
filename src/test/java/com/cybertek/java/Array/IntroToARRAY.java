package com.cybertek.java.Array;

public class IntroToARRAY {
    public static void main (String [] args){
        int [] numbers = new int [3];

        for (int i=0 ; i<numbers.length ; i++){
            System.out.print(numbers[i]);// you don't have anything to that means it will print 0
        }
        System.out.println();
        numbers[0]=2;numbers[1]=9;numbers[2]=5;
        for (int i=0 ; i<numbers.length ; i++){
            System.out.println(numbers[i]);// now it will print the values in array
        }
        // Syntax of creating an array
        int [] number1 = new int [] {3,2,13,2,2};

        // or directly below
        int [] number2 = {23,12,3,1,32};

        String [] English = new String[] {"John","Smith","keeth"};
        System.out.print(English[0]+English[1]+English[2]);
        String [] names = {"john","smith", "keeth"};
    }
}
