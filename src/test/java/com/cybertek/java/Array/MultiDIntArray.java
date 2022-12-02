package com.cybertek.java.Array;

public class MultiDIntArray {
    public static void main (String [] args){
        int [][]  num2d = {{12,55,4,7},{123,55,9},{56,87,455,34},{234,12,54,23,23}};
        //System.out.println(Arrays.deepToString(num2d));
        //You can use for loop,   int [outerloop][innerloop]

        for (int i = 0; i<num2d.length; i++){
            for (int k = 0; k<num2d[i].length;k++){
                System.out.println(num2d[i][k]);
            }
        }
    }
}
