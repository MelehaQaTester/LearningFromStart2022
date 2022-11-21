package com.cybertek.java.Conditions.TernaryOperators;

public class AssigningTheResults {
    public static void main (String [] args){
        String result = "";
        int sccore = 90;
          result = (!(sccore>=90))?"fail":"pass";
          System.out.println(result);
    }
}
