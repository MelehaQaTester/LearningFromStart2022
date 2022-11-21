package com.cybertek.java.Conditions.DifferentBetweenOpperators;

public class GradeEvaluator {
    public static void main (String [] args )
    {
        char grade ='A';
        if(grade == 'A' ||grade == 'B'||grade == 'C'){
            System.out.println("Passed with grade "+grade
            );
        } else if(grade == 'D'){
            System.out.println("Qualify for retake");
        } else if (grade == 'E'){
            System.out.println("fail");
        }else {
            System.out.println("Invalid grade");
        }
    }
}
