package com.cybertek.java.ClassVsObject;

public class StartsWithAndEndsWith {
    public static void main (String [] args){
        String word = "Intellij idea";
        System.out.println(word.startsWith("i"));

        System.out.println(word.startsWith("Inte"));
        System.out.println(word.endsWith("a"));
        System.out.println(word.endsWith("idea"));

        String name  = "meleha";
        if(name.endsWith("a")){
            System.out.println("There is a possiblity this person is a female");
        }

        name = "Dr. Nadir";
        if(name.startsWith("Mr.")){
            System.out.println("This person is a man");
        }else if (name.startsWith("Dr.")){
            System.out.println("This person is a doctor");
        } else if (name.startsWith("Mrs.")){
            System.out.println("This person is a Married women");

        }else if(name.startsWith("Ms.")){
            System.out.println("This person is a Single Women");

        }else if(name.startsWith("Sr.")){
            System.out.println("This person is a Senior");
        }
        String url = "";
        if(url.endsWith(".com")){
            System.out.println("Commercial Website");
        }else if (url.endsWith("ru")){
            System.out.println("Russian Website");
        }else if(url.endsWith(".gov")){
            System.out.println("Government Website");
        }else if(url.endsWith(".edu")){
            System.out.println("education WebSite");
        }else if (url.endsWith(".org")){
            System.out.println("Orginization Website");
        }
    }
}
