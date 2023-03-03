package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projecttwentysix {

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
		CreateNewView.click();
		WebElement ViewName = driver.findElement(By.cssSelector("#fname"));
		ViewName.sendKeys("Ajay");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		WebElement ViewUniqueName = driver.findElement(By.cssSelector("#devname"));
		ViewUniqueName.sendKeys("");
		WebElement save = driver.findElement(By.xpath(" /html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		save.click();
		

	}

}
