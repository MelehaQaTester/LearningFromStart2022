package com.cybertek.java.Conditions.MultiIFStatements;

public class CalculatorV1 {
    public static void main (String [] args){
        double num1= 2.3;
        double num2 = 3.3;
        double result = 0;
        char operator = '+';
        if(operator=='+'){
            result = num1+num2;
        }else if (operator == '-'){
            result = num1-num2;
        }else if (operator == '*'){
            result = num1*num2;
        }else if(operator == '/'){
            result = num1 /num2;
        }else{
            System.out.println("invalid operator");
        }
        System.out.println(result);
    }
}
