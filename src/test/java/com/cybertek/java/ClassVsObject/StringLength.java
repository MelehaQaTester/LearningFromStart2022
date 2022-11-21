package com.cybertek.java.ClassVsObject;

public class StringLength {
    public static void main (String [] args){
        String password = "meleha";
        int lengthOfPassword = password.length();
        System.out.print("is the length of password is >= 6 ");
        System.out.println( lengthOfPassword == 6);
        System.out.println(password);
        System.out.println(password.length());
        if (password.length()>=6){
            System.out.println("Valid Amazon Password");
        }else {
            System.out.println("Password too Short");
        }
    }
}
