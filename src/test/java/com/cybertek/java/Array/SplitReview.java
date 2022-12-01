package com.cybertek.java.Array;

import java.util.Arrays;

public class SplitReview {
    public static void main (String [] args){
        String word = "ajava";
        String [] arr = word.split("a");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        /**
         * Please don't use this approch to count the occurancec, instead use the looping array rather than if stataments
         */
        int countA =0;
        if(word.startsWith("a") ){
            countA = arr.length;
        }else if (word.endsWith("a")){
            countA = arr.length;
        } else {
            countA = arr.length-1;
        }
        System.out.println("Cont of a: "+countA);


        System.out.println("-----Spliting byt empty Array--------");
        String Word = "java1html2sql";
        String [] arrWord = Word.split("\\d");
        System.out.println(arrWord[1]);
        System.out.println(arrWord[0]);
        System.out.println(arrWord[2]);
        System.out.println(Arrays.toString(arrWord));


    }
}
