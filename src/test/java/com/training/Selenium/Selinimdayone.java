package com.training.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selinimdayone {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver(); 
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email_field")).sendKeys(("admin123@gmail.com"));
		driver.findElement(By.id("password_field")).sendKeys("admin123");
        driver.findElement(By.xpath ("//button[text()='Login to Account']")).click();
        
       
        		
             		
        		
        }}