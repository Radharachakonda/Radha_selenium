package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

public class selleniumday2 {
	
	public static void main(String[] args) {
		
	FirefoxDriverManager driver;
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver  = new ChromeDriver(); 
	
	


	
driver.get("https://www.opera.com/");
	
	
	WebDriver driver = new FirefoxDriver();
	((WebDriver) driver).get("https://www.mozilla.org/en-US/firefox/all/");
	driver.manage().window().maximize();
	driver.manage().window().maximize();
    String expectedValue= "Selenium"; 
    String title = driver.getTitle();
     
    
    		
    		
    		
    
    

   
    
    
    
    
	
		
	}

}
