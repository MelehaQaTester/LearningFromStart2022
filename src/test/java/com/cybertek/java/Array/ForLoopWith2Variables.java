package com.cybertek.java.Array;

import java.util.Arrays;

public class ForLoopWith2Variables {
    public static void main (String [] args){
        for (int i =1 ,j =1; i<=4; i++,j++){
            System.out.println(" i = "+i+" j = "+j);
        }
        System.out.println("Two Way of For loop");
        for (int i =1,j=5;  j>=0; i++,j--){
            System.out.println(" i = "+i+" j = "+j);
        }
        System.out.println("Consist of having 2 different conditions");
        for (int i =1,j=5; i<=4 && j>=1; i++,j--){
            System.out.println(" i = "+i+" j = "+j);
        }
        int num1  = 10;
        int num2 = 30;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        // swaping the variable using a additional variables
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        int num [] ={5,10,4,100};
        System.out.println("before the swap: "+Arrays.toString(num));
        temp = num[0];
        num[0]=num[3];
        num[3]=temp;
        System.out.println("After the swap: "+Arrays.toString(num));

        int num3[] ={5,10,4,100};
        for (int i = 0; i<num3.length/2 ; i++){
            int temp1 = num3[i];
            num3[i] = num3[num3.length-1-i];
            num3[num3.length-1-i] = temp1;
        }
        System.out.println("Reverse Array: "+Arrays.toString(num3));

        // Swapping a String Array
        String [] words = {"Java", "html","js","ruby","css"};
        System.out.println("Before reverse word = "+Arrays.toString(words));
        for (int i = 0; i<words.length/2; i++){
            String wordTemp = words[i];
            words[i] = words[words.length-1-i];
            words[words.length-1-i]=wordTemp;
        }
        System.out.println("After reverse word = "+Arrays.toString(words));
        for (int i = 0,j=words.length-1; i<words.length/2; i++,j--){
            String wordTemp = words[i];
            words[i] = words[j];
            words[j]=wordTemp;
        }
        System.out.println("After reverse word to original= "+Arrays.toString(words));


    }
}
