package com.cybertek.java.Array;

public class CharArray {
    public static void main (String [] args){
        char [] letter = {'j','a','v','a',' ','i','s',' ','f','u','n'};
        System.out.println(letter.length);
        // print each letter using the loop
        // for loop
        for (int  i = 0 ; i<letter.length ; i++){
            System.out.print(letter[i]+" ");
        }
        System.out.println();

        // for each loop
        for (char eachArray : letter){
            System.out.print(eachArray);
        }
        System.out.println();
        String sentence = new String (letter);
        System.out.println("Sentence: "+sentence);

        String fruits []  ={"bananas","apples","kiwi","mango","papaya","strawberry"};
        /**
         For loop
         */

        for (int i = 0; i<fruits.length ; i++){
            System.out.print(fruits[i]+" - ");
        }
        System.out.println();
        /**
         For each loop
         */
        for (String each : fruits){
            System.out.print(each+"-");
        }

        String fruitStr = "";
        for (String each : fruits){
            fruitStr += each+"-";
        }

        System.out.println("\nAll the Fruits: "+fruitStr);

        String [] language = {"java","python","c++","sql","ruby","javascript"};
        System.out.println(String.join("|",language));
        System.out.println(String.join(" ## ", language));
        String joinedLanguage = String.join(" <> ", language);
        System.out.println("Joined Languages = "+joinedLanguage);

        // converting string to char array

        String str = "git";
        char [] convertingToCharARRY = str.toCharArray();
        for (char eachCHar : convertingToCharARRY){
            System.out.print(eachCHar);
        }
        System.out.println("How to convert char to an string ");
        /**
         * Either we can loop, or we can make a new string object
         */
        char [] grades = {'A','B','C','D','E','F'};
        String gradeStr= new String (grades);
        System.out.println(grades);

        /**
         * Join methods,
         */
        String [] array = {"one","two","three"};
        String joiningArray = String.join(" ! ",array);

    }
}
