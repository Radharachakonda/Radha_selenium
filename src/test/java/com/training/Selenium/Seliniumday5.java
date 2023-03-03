package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seliniumday5 {

	static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver ();
	driver.get("https://selenium-prd.firebaseapp.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebElement email = driver.findElement(By.id("email_field"));
    email.sendKeys("admin123@gmail.com");
    WebElement password = driver.findElement(By.cssSelector("#password_field"));
    password.sendKeys(("admin123"));
    WebElement login = driver.findElement(By.xpath("//button[text ()='Login to Account']"));
    login.click();
    WebElement switchToTab = driver.findElement(By.xpath("//button[contains(text(), 'Switch To')]"));
   switchToTab.click();
			
	
			
	
		

	}

}
