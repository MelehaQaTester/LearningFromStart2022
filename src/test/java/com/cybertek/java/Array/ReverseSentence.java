package com.cybertek.java.Array;

public class ReverseSentence {
    public static void main(String [] args){
        String sentence ="java is fun";
        String rever = "";
        String [] SentenceReverse = sentence.split(" ");
        for(int i = SentenceReverse.length-1; i>=0;i--){
            System.out.print(SentenceReverse[i]+" ");
            rever += SentenceReverse[i]+" ";
        }
        System.out.println();
        System.out.println("actual: "+sentence);

        System.out.println("Reverse: "+rever);


    }
}
