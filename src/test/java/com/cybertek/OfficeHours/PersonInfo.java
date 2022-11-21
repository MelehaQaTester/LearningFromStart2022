package com.cybertek.OfficeHours;

public class PersonInfo {
    public static void main(String [] args){
        String name, fullBirthdate,favoriteQuote;
        name ="Meleha Yousaf";
        byte age;
        age =28;
        char gender;
        gender = 'F';
        boolean student;
        student=false;
        Long faviortNumber;
        faviortNumber=15L;
        short numberOfSiblings;
        numberOfSiblings =4;
        int numberOfSeasons, year;
        numberOfSeasons = 5;
        double birthDay = 08.11;
        year = 1994;
        fullBirthdate= birthDay+"."+year;
        favoriteQuote = "If you want to life yourself up, lift up Someone else";
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Are you student: "+student);
        System.out.println("I have "+numberOfSiblings+" Sibilings");
        System.out.println("Faviort number: "+faviortNumber);
        System.out.println("Number of seasons: "+numberOfSeasons);
        System.out.println("Date Of Birthday: "+fullBirthdate);
        System.out.println("Favorite Quote: "+favoriteQuote);
        char firstLetterOfName = 77;
        char secondLetterOfName = 101;
        char thirdLetterOfName = 108;
        char fourthLetterOfName = 101;
        char fiffthLetterOfName = 104;
        char sixLetterOfName = 97;
        System.out.println(firstLetterOfName);
        System.out.println(secondLetterOfName);
        System.out.println(thirdLetterOfName);
        System.out.println(fourthLetterOfName);
        System.out.println(fiffthLetterOfName);
        System.out.println(sixLetterOfName);
    }
}
class zoo {
    public static void main(String [] args){
        String name, startingTime, clossingTime,parkRules;
        int foundedDate, numberOfBirds, numberOfPrimate, numberOfemploy, ticketCostForAdults,ticketCostForUnder13, numberOfBigCats , numberOfCamels, numberOfGoat, numberOfLambs, numberOfMonkey;
        boolean isOpenOnHolidays, hasAqurium;

        name= "Mano Jungle";
        startingTime="8:00 Am";
        clossingTime="8:00 Pm ";
        parkRules="No feeding the amimale, no littering, please be respectFull of animals and your surrondings ";
        foundedDate= 1994;
        numberOfBigCats = 8;
        numberOfBirds=20;
        numberOfemploy=30;
        numberOfPrimate = 10;
        numberOfCamels = 5;
        numberOfGoat = 15;
        numberOfLambs = 15;
        numberOfMonkey=8;
        ticketCostForAdults = 20;
        ticketCostForUnder13 = 10;
        isOpenOnHolidays= true;
        hasAqurium = true;

        System.out.println("\t\t\t\t\t\t\tWELCOME TO "+name+"\t\t\t\t\t\t\t");
        System.out.println("Our zoom is open from "+startingTime+" Untill "+clossingTime);
        System.out.println("In our zoo we have: we have "+numberOfBigCats+" BigCats we have "+numberOfBirds+" Birds all different type");
        System.out.println("we have "+ numberOfPrimate+" Primate, we have "+numberOfCamels+" Camels");
        System.out.println("we have "+ numberOfGoat+" Goat, we have "+numberOfLambs+" lambs");
        System.out.println("we have "+ numberOfMonkey+" Monkeys");
        System.out.println("We also have aqurium: "+hasAqurium);
        System.out.println("Open for holidays: "+isOpenOnHolidays);
        System.out.println("We also have "+numberOfemploy+" employees working at zoo, " +
                "\nif you need any assistance please reach out to them if you need any assistance");
        System.out.println("For entry to our zoo, for adults it is $"+ticketCostForAdults+" and for children under the age of 13 it is: $"+ticketCostForUnder13);
        System.out.println("Please follow our park rules: "+parkRules);

    }
}
