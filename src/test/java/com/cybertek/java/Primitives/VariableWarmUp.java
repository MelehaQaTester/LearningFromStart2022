package com.cybertek.java.Primitives;

public class VariableWarmUp {
    public static void main(String [] args){
        int count ;
        count =10;
        System.out.println(count);
        count = 25;
        System.out.println(count);

    }
}
class PrimitivesExamples{
    public static void main(String []args){
        // these are the whole values
        byte byteValue = 100; // limitation is  -128 to 126
        short shortValue = 32767 ;// limitation is  -32768 to 32767
        int intValue = 214768263;
        long longValue = 123843908984689374L;

        // these are decimals
        float floatValue = 123343242.32f;
        double doubleValue =123034739428342934.99;//123034739428342934.99D -- > is also valid

        ///****Character Type*****
        char charValue = 'a';

        ///****Boolean Value

        boolean booleanValue = true;
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);



    }
}
class CharType{
    public static void main(String [] args){
        // try to print the name Meleha using char type
        char firstLetterOfName = 77;
        char secondLetterOfName = 101;
        char thirdLetterOfName = 108;
        char fourthLetterOfName = 101;
        char fiffthLetterOfName = 104;
        char sixLetterOfName = 97;
        System.out.println(firstLetterOfName+""+secondLetterOfName+""+thirdLetterOfName+""+fourthLetterOfName+""+fiffthLetterOfName+""+sixLetterOfName+"");
        System.out.println("another way of: ");
        System.out.print(firstLetterOfName);
        System.out.print(secondLetterOfName);
        System.out.print(thirdLetterOfName);
        System.out.print(fourthLetterOfName);
        System.out.print(fiffthLetterOfName);
        System.out.print(sixLetterOfName);

        char letter = 'M';
        System.out.println("\n"+letter);

        char randome = 2023;
        System.out.println(randome);
        randome = 1234;
        System.out.println(randome);
        randome=11122;
        System.out.println(randome);
    }
}

class BooleanPractice{
    public static void main(String []args ){
        boolean isHungry = false;
        boolean isSleepy = true;
        boolean javaIsFun = true;
        boolean isBreakTime= true;
        System.out.println(isHungry);
        System.out.println(isBreakTime);
        System.out.println(isSleepy);
        System.out.println(javaIsFun);
    }
}

class UsingVaribales {
    public static void main(String [] args){
        int num1 = 100;
        int num2 =num1;
        System.out.println(num1);
        System.out.println(num2);

        num1 = 200;
        System.out.println(num1);
        System.out.println(num2);
    }
}
class Jobinfo{
    public static void main(String [] args){
        String title = "QA JUNIOR";
        String compnay = "Apple";
        String jobDescription = "Be able to do manuale  testing etc.";
        int Salary = 120000;
        int yearsExp= 6;
        boolean hasBenfit = true;
        System.out.println("Job title: "+title);
        System.out.println("Company name: "+compnay);
        System.out.println("JobDesctiption : "+jobDescription);
        System.out.println("Salary: "+Salary);
        System.out.println("Years of Experiences that is need: "+yearsExp);
        System.out.println("Does this job has Benifit: "+hasBenfit );
    }
}
