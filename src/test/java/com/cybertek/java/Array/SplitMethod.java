package com.cybertek.java.Array;

import java.util.Arrays;

public class SplitMethod {
    public static void main (String [] args){
        String words = "java,python,selenium,html";
        String [] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println(wordsArray.length);

        String sentence = "today I am coding Java arrays";
        String[] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("Sentences length: "+sentenceArray.length);
        System.out.println("Print the first word: "+sentenceArray[0]);
        System.out.println("Print the first word: "+sentence.split(" ")[0]);
        for(String eachArray : sentenceArray){
            System.out.println(eachArray);
        }



    }
}
