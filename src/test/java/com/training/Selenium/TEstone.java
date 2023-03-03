package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEstone {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver ();
	driver.get("https://login.salesforce.com");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	WebElement username = driver.findElement(By.id("username"));
    username.sendKeys("oct22radha@abc.com");
    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys((" "));
   Thread.sleep(3000);
   driver.findElement(By.id("Login")).click();
   driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS); 
   
    		
	}}