package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projecttwentyseven {

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
			WebElement View = driver.findElement(By.xpath("//label[@for='fcf']"));
			View.click();
			Select select = new Select (driver.findElement(By.xpath ("//input[@title='Go!]")));
			select.selectByIndex(3);
		
		

	}

}
