package com.cybertek.java.StringManupiliation;

public class ReplacePractice {
    public static void main (String [] args){
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = "+word);
        word = word.replace("hub","lab");
        System.out.println("word = "+word);
        System.out.println(word.replace("i","o").replace("a","i"));

        String sentence = "Java is fun";
        System.out.println(sentence);
        String withNoSpace = sentence.replace(" ","");
        System.out.println("withNoSpace = " + withNoSpace);

        System.out.println(sentence.replace("Java","selenium").replace("fun","a lot of fun"));
        sentence =sentence.replace("Java","selenium").replace(" fun"," a lot of fun");
        System.out.println("sentence = " + sentence);
        

    }
}
