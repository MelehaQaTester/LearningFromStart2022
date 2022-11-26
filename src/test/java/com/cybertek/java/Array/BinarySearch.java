package com.cybertek.java.Array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String [] args){
        int [] nums = {23,123,654,2344,12345,14421};
        Arrays.sort(nums);
        System.out.println(Arrays.binarySearch(nums,23));//0
        System.out.println(Arrays.binarySearch(nums,2344));//4
        System.out.println(Arrays.binarySearch(nums,25));//-2
        System.out.println(Arrays.binarySearch(nums,700));//-4
        System.out.println(Arrays.binarySearch(nums,-5));//1

        // check if the number 12345 is among numbers in array
        if(Arrays.binarySearch(nums,12345)>=0){
            System.out.println("Yes It does Contains 12345");
        }else {
            System.out.println("No it doesn't contains 12345");
        }
        System.out.println(Arrays.binarySearch(nums,12345));

    }
}
