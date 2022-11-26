package com.cybertek.java.Array;

public class SentenceSplit {
    public static void main (String [] args){
        String sentence = "java is fun";
        String [] words = sentence.split(" ");
        System.out.println("1st word = "+words[0]);
        System.out.println("2nd word = "+words[1]);
        System.out.println("3rd word = "+words[2]);
        for (String w: words){
            System.out.println(w);
        }


        String googleResult= "About 1,810,000 results (0.68  seconds)";
        String [] googleResultArray=googleResult.split(" ");
        for ( String p : googleResultArray){
            if(p.contains("0")){
                if(p.contains("(")) {
                    System.out.println(p.replace("(",""));
                }else {
                    System.out.println(p);
                }


            }
        }
        System.out.println("count = " + googleResultArray[1]);
        System.out.println("Seconds = " + googleResultArray[3].replace("(",""));



    }
}
