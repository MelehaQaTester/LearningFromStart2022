package com.cybertek.java.StringManupiliation;

public class StringCharAt {
    public static void main (String [] args){
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.length());


        String company = "Cybertek";
        System.out.println("first letter : "+company.charAt(0));
        char first =company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char fifth  = company.charAt(4);
        char six = company.charAt(5);
        char seven = company.charAt(6);
        char eight = company.charAt(7);
        System.out.print(first+ " "+second+" "+third+" "+fourth+" "
                +fifth+" "+six+" "+seven+" "+eight+"\n");
        // Palindrome word
        String word1 = "mom";
        char first1  = word1.charAt(0);
        char last = word1.charAt(word1.length()-1);
        System.out.println(first1 == last);

        if(first1 == last){
            System.out.println("First and last letter are matching");
        }else {
            System.out.println ("first and last letter are not matching");
        }

        String anotherWord = "aziza";
        char firstletter = anotherWord.charAt(0);
        char lastletter = anotherWord.charAt(anotherWord.length()-1);
        if(firstletter == lastletter){
            System.out.println("First and last letter are matching in the name");
        }else {
            System.out.println ("first and last letter are not matching in the name");
        }

    }
}
