package com.cybertek.java.StringManupiliation;

public class StringIsEmpty {
    public static void main (String [] args){
        String jobTitle ="";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()){
            System.out.println("JobTitle is missing, Please resend");
        }else {
            System.out.println("Job Title is not empty");
        }
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.equalsIgnoreCase(""));

        String word= " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrot";
        System.out.println(veggie.isEmpty());
        if(!veggie.isEmpty()){
            System.out.println("We have "+veggie);
        }
    }
}
