package com.cybertek.java.ClassVsObject;

public class StringCaseConversions {

    public static void main(String [] args){
        String word = "CyberTek";
        System.out.println(word);
        System.out.print(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());

        word.toLowerCase(); // this would not change the actual change nor would it print it in the next line, unless you re-assign it or making another object
        System.out.println(word.toUpperCase());

        String company = "AmaZon wEB Survises";
        System.out.println(company);
        System.out.println(company.toUpperCase());
        company=company.toUpperCase();
        System.out.println(company);
    }
}
