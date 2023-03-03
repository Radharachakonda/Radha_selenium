package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projectthirtytwo {

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
		WebElement New = driver.findElement(By.xpath("//input[@title='New']"));
		New.click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		WebElement LastName =  driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		LastName.sendKeys("Indian");
		WebElement AccountName =  driver.findElement(By.cssSelector("#con4")); 
		AccountName.sendKeys("Global media");
		WebElement SaveANDNew = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save & New']"));
		SaveANDNew.click();
		

	}

}