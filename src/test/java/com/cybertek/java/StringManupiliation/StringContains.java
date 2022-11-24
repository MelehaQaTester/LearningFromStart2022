package com.cybertek.java.StringManupiliation;

public class StringContains {
    public static void main(String [] args){
        String company = "Capital One";
        System.out.println(company.contains("i")); // true
        System.out.println("ital");//true
        System.out.println(company.contains("l o")); // true

        // if company contains space, print "Muliple words company name '
        // else "Single word Company name
        if (company.contains(" ")){
            System.out.println("Multiple words company name");
        }else {
            System.out.println("Single word company name");
        }
        String etsyTitle = "Wooden Spoon | ETSY";
        if (etsyTitle.contains("|")){
            System.out.println("Pass -it is an Etsy title");
        }else {
            System.out.println("Fali -it is not an Etsy title");
        }
        String firstName = "ahmed";
        if(firstName.contains("a") && firstName.contains("e")){
            System.out.println("Both a && e are present");
        }else {
            System.out.println(" a || e are not present0");
        }
        String email = "meleha.yousafit@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("then you have a valid email");
        }else {
            System.out.println("you don't have either @ || .com in you email, you have invalid email");
        }
        // how to deal with case insensatives,
        if(email.toLowerCase().contains("a")){
            System.out.println("a is present ");
        }else {
            System.out.println("a is not present ");

        }
        String word  = "java";
        System.out.println(word.replace("a", "u"));// juvu

    }
}
