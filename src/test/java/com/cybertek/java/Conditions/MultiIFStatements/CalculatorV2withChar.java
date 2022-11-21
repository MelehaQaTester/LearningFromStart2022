package com.cybertek.java.Conditions.MultiIFStatements;
import java.util.Scanner;
public class CalculatorV2withChar {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("enter 2 numbers");
        double num1= scan.nextDouble();
        double num2 = scan.nextDouble();
        double result = 0;
        System.out.println("enter operator: -,+,*,/");
        char operator = scan.next().charAt(0);
        if(operator=='+'){
            result = num1+num2;
        }else if (operator == '-'){
            result = num1-num2;
        }else if (operator == '*'){
            result = num1*num2;
        }else if(operator == '/'){
            result = num1 /num2;
        }else{
            System.out.println("invalid operator - "+operator);
        }
        System.out.println(result);
    }
}
