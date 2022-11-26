package com.cybertek.java.Array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtil {
    public static void main (String [] args){
        int [] nums  = {100, 5, 1, 7, 0, -4, 44, 33};
        // printing all the nums value in a signle line without going through loops
        System.out.println(Arrays.toString(nums));
        // sorting the arrays
       Arrays.sort(nums);
       System.out.println(Arrays.toString(nums));

       // min value
        System.out.println("min value: "+nums[0]);
        System.out.println("max value: "+nums[nums.length-1]);

        //Arrays.sort(nums, Collections.reverseOrder());

        String [] word = {"java","C#","C++","Kotlin","Python","Ruby","Assembly"};
        System.out.println(Arrays.toString(word));
        System.out.println(String.join(" , ",word));
        Arrays.sort(word);
        System.out.println(Arrays.toString(word));
        System.out.println("["+String.join(" , ",word)+"]");
        // sort words in reverse order
        Arrays.sort(word, Collections.reverseOrder());
        System.out.println(String.join("|",word));
    }
}
