package com.cybertek.java.IncrementAndDecrement;

public class Inc_Dec {
    public static void main (String [] args){
        int i = 1;
        System.out.println ("i = "+i);
        i++; //2
        System.out.print("i= "+i);
        i++;//3
        System.out.print("i= "+i);
        ++i;//4
        System.out.print("i= "+i);

        int num1 = 45;
        int num2 = 42;
        int reult = --num1 + ++num2;
        System.out.print(reult);
        reult = num1-- + ++num2;
        System.out.print(reult);
        reult = num1-- + ++num2 * --num1;
        System.out.print(reult);
       // System.out.print(reult);
        //System.out.print(reult);


    }
}
