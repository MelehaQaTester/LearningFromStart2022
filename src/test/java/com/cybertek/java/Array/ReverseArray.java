package com.cybertek.java.Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main (String [] args){

        int [] nums = {5,10,4,100};
        int [] numsRevers = new int[nums.length];
        //int number = 0;
        for (int i = nums.length-1, j=0;  i>=0; i--,j++){
//          numsRevers[number] = nums[i];
//          number++;
            numsRevers[j] = nums[i];
        }
        System.out.println("Original Array: "+ Arrays.toString(nums));
        System.out.println("Reverse Array: "+ Arrays.toString(numsRevers));
    }
}
