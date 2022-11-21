package com.cybertek.java.ComparisonOperator;

public class BooleanComparisonOpertors {
    public static void main (String [] args){
        int age =2;
        boolean noMoreToddler = age>3;
        System.out.println(noMoreToddler);
        age = 65;
        boolean isSeniorCitizen = age >=65;
        System.out.print("is Senior citizen: "+isSeniorCitizen);

    }
}
class ComparisonExamples{
    public static void main (String [] args){
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;
        String print= "Are you speeding? - "+isSpeeding;
        System.out.println(print);
    }
}
class CompareChars {
    public static void main(String [] args){
        char letter1 = 'A';
        char letter2= 'B';
        System.out.println(letter1==letter2);
        System.out.println(letter1>letter2);
        System.out.println(letter1<letter2);
    }
}
