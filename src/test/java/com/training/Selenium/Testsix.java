package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testsix {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("oct22radha@abc.com");
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys(("aajjay@12"));
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	    driver.findElement(By.id("userNavButton")).click();
	    driver.findElement (By.linkText("My Profile")).click();
	    
	    
	    		
	    			 
	    
	}

}
