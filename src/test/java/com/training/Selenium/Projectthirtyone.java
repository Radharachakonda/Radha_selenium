package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projectthirtyone {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("Josybhattla@abc.com");
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys(("@Machine1"));
	   	driver.findElement(By.id("Login")).click();
		   
	   	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		WebElement Contacts = driver.findElement(By.id("Contact_Tab"));
		Contacts.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		WebElement CreateNewView = driver.findElement(By.cssSelector("a[href='/ui/list/FilterEditPage?ftype=c&retURL=%2F003&cancelURL=%2F003%2Fo']"));
		CreateNewView.sendKeys("ABCD");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		WebElement ViewUniqueName = driver.findElement(By.cssSelector("#devname"));
		ViewUniqueName.sendKeys("EFGH");
		WebElement Cancel = driver.findElement(By.cssSelector("body > div:nth-child(4) > div:nth-child(2) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > div:nth-child(3) > form:nth-child(1) > div:nth-child(11) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(2)"));
		Cancel.click();
		

	}

}
