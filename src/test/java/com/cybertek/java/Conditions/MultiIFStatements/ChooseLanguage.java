package com.cybertek.java.Conditions.MultiIFStatements;

public class ChooseLanguage {
    public static void main(String [] args){
        int selections = 0;
        if(selections==1){
            System.out.println("hello, thank for your call");
        }else if(selections ==2){
            System.out.println("hola, gracias para llamar");
        }else if(selections==3){
            System.out.println("merhaba, aradigniz icin teselluler");
        }else if (selections == 4){
            System.out.println("privet, spasibo za vash zvonok");
        }else if (selections==5){
            System.out.println("Merci, pour votre appel");
        }else {
            System.out.println("Lets talk java and english, hello");
        }
    }
}
