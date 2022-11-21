package com.cybertek.java.ClassVsObject;

public class LoginTest {
    public static void main (String [] args){
        String expectUsername = "cybertek";
        String expectPassword = "Abc123";
        String userName = "CyberTek";
        String password = "Abc123";

        if (userName.equalsIgnoreCase(expectUsername) && password.equals(expectPassword)){

            System.out.println("Pass-User Successfully logged in");
        }else if (!userName.equalsIgnoreCase(expectUsername)){
            System.out.println("Incorrect Username");
        }else {
            System.out.println("Incorrect Password");
        }
    }
}
