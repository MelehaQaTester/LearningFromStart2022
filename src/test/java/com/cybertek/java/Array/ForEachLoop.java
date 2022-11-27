package com.cybertek.java.Array;

public class ForEachLoop {
    public static void main(String [] args){
        int [] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
        for (int each : data){
            System.out.println(each);
        }
        for (int n: data){
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("-------------FOR LOOP--------------");
        for (int i=0; i<data.length; i++){
            System.out.println(data[i]);

        }
        System.out.println("Last Value in the array index : "+data[data.length-1]);
        //print all the number backward in the same line
        for(int idx = data.length -1 ; idx>=0 ;idx--){

            System.out.print(data[idx]+" ");
        }
    }
}
