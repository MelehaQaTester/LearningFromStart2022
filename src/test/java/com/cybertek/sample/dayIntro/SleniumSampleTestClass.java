package com.cybertek.sample.dayIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleniumSampleTestClass {
    //we need the main method to run things
    public static void main (String [] args){

        // set up the webdriver (which are coming up from the dependencies from the libraries)
        WebDriverManager.chromedriver().setup(); //setting up the driver for my self

        WebDriver driver = new ChromeDriver();// setting up the instance of chrome Driver

        driver.get("https://google.com"); // test if the driver is working, in order to call you will be calling the driver
    }
}
