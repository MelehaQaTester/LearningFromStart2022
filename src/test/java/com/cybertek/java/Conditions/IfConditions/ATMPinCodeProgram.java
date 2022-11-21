package com.cybertek.java.Conditions.IfConditions;
import java.util.Scanner;
public class ATMPinCodeProgram {
    public static void main (String [] args){
        System.out.println("**** WELCOME TO TD BANK ATM ****");
        int secretPinCode = 6613;
        Scanner scan = new Scanner (System.in);
        System.out.println("Please input the pin code: ");
        int inputInCode = scan.nextInt();
        if(inputInCode==secretPinCode){
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check balance, deposit");
        }else  {
            System.out.println("Incorrect pinCode! "+inputInCode);
            System.out.println("Please try again.");
        }
        System.out.println("Thank you for using TD BBank ATM");
    }
}
class NiceDayeOrNot {
    public static void main(String [] args){
        int currentTemp = 71;
        if(currentTemp>=70){
            System.out.println("it  is a beautiful day");
            System.out.println("Lets Code Java");
        }else {
            System.out.println("It is kind of cold today");
            System.out.println("Stay home and code Java");
        }
    }
}
class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 0;
        double salesAmount = 1000;

        if (salesAmount <= 1000) {
            System.out.println("Good Job, You qualified for bonus!");
            bonus=50;
        }else {
            System.out.println("Great job, you are qualifided for full bouns");
            bonus = 100;
        }
        System.out.println("Your bound for salesAmount is $"+bonus);
    }
}
class IfWithBooleanVariable{
    public static void main(String [] args){
        boolean isHungry = false;
        if (isHungry){
            System.out.println("I am hungry i will fo get something to  eat");
            System.out.println("Then code Java");
        }else {
            System.out.println("I am not hungry Lets keep coding Java");
        }

//        if (isHungry == true){
//            System.out.println("I am hungry i will fo get something to  eat");
//            System.out.println("Then code Java");
//        }
//        else if (isHungry == false) {
//            System.out.println("I am not hungry Lets keep coding Java");
//        }
        double price = 130.44;
        boolean isAffordable = 200 < price;
        if (isAffordable){
            System.out.println("This iteam is Afforadable");
        }else{
            System.out.println("I am sorry this iteam is not afforabable");
        }
       boolean isRemoteJob = false;
        if (!isRemoteJob){
            System.out.println("Sorry I am not interested in the job");
        }else {
            System.out.println("Sure I  am interested, what is the interview process?");
        }
    }
}
class  StringComparison{
    public static void main(String [] args){
        String city = "New York";
        if(city.equals("Los Angeles")){
            System.out.println("It is LA");
        }else {
            System.out.println("It is not LA");
        }
        String weather = "sunny";
        if (weather.equals("sunny")){
            System.out.println("Lets go out and code java");
        }else{
            System.out.println("Lets stay indoors, and code java");
        }
    }
}
