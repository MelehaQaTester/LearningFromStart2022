package com.cybertek.java.ScannerPractice;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is you name: ");
        String scan = scanner.next();
        System.out.println("Your name is: "+scan);

    }
}
class ScannerPractice{
    public static void main(String [] args){
        System.out.println("How old are you");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println(age+" - Thats  grreat age!");
    }
}
class AddNumber {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int num1,num2,result;
        System.out.println("Enter number 1: ");
        num1 = scan.nextInt();
        System.out.println("Enter Number2: ");
        num2 = scan.nextInt();
        result = num1+num2;
        System.out.print("Result: "+result);
    }
}
