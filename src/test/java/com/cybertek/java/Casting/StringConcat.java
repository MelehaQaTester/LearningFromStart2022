package com.cybertek.java.Casting;

public class StringConcat {
    public static void main(String [] args){
        System.out.println("java"+5+3);// java53
        System.out.println("java"+(5+3));//java8
        System.out.println(5+3+"Java");//8Java
        System.out.println(5+(3+"Java"));//53java
        char Char1 = 'a';
        char Char2='b';
        System.out.println(Char1+Char2);
        // printing ab togther
        System.out.println(Char1+""+Char2);

    }

}
class OperatorPrecedence{
    public static void main(String [] args){
        System.out.println(10+5);
        System.out.println(10+5-3);
        System.out.println(10-5+3);
        System.out.println(10-(5+3));
        System.out.println(2*3);
        System.out.println(2*3/3);
        System.out.println(20/(2*2));
       // System.out.println(10/0); // error (run time error)
    }
}
class PrimitiveCasting{
    public static void main(String [] args){
            int num1 = 100;
            byte b1=(byte)num1;
            short shNum1 = (short) num1;
            long Lnum1 = num1;
            System.out.println(num1);
            System.out.println(b1);
            System.out.println(shNum1);
            System.out.println(Lnum1);


    }
}
