package com.cybertek.java.aruthmetic_Operters;

public class ArithmeticOperators {
    public static void main (String []args){
        // +,-,/,*,%
        System.out.println(5+10);//15
        System.out.println(10-3);//7
        System.out.println(3*3);//9
        System.out.println(15/5);//3
        System.out.println(12%5);//2
        System.out.println(-2*2);//-4
        int chairs = 4+2;
        System.out.println(chairs);
        int spoons =10+20+12+0;
        System.out.println(spoons);
        System.out.println("There are "+spoons+" spoons in kitchen");
    }
}
class MoreMathOperators {
    public static void main(String []  args){
        int toyotas = 431;
        int hondas = 233;
        int vw= 2;
        int tesla = 20;
        int nissan =1;
        int bmw= 155;
        int totalCarsInParking = toyotas+hondas+vw+tesla+nissan+bmw;
        System.out.println("There are "+totalCarsInParking+" cars in parking lot");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices/people;
        System.out.println("There are "+slicesPerPerson+" slices per person");
        System.out.println("We ordered "+pizza+" pizza with "+slices+" slices, "+people+" people ate "+slicesPerPerson+" slices each");
    }
}
class CalculateAge{
    public static void main(String [] args){
        int yearOfBirth = 1994;
        int CurrentYear = 2023;
        int age = CurrentYear-yearOfBirth;
        System.out.println("You will be "+age+" in 2023, you need to get married");
    }
}
