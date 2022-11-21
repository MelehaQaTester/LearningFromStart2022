package com.cybertek.java.Conditions.MultiIFStatements;

public class YesOrNo {
    public static void main (String [] args){
       // Scanner scan = new Scanner(System.in);
        System.out.println("Are you sure you want to delete this file?");
         char selection ='y';
        boolean answer ;
        if(selection == 'y'){
            System.out.println("Your file will be deleted");
            answer=true;
        }else {
            System.out.println("file deleting cancelled");
            answer=false;
        }
        System.out.println("Did file get deleted? - "+answer);
    }
}
