package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projectthirtyseven {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("Josybhattla@abc.com");
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys(("@Machine1"));
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   driver.findElement(By.id("Login")).click();
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   WebElement Homepage = driver.findElement(By.id("home_Tab"));
		   Homepage.click();
		   WebElement Currentdate = driver.findElement(By.xpath("//a[@title='February 28 (Today)']"));
		   Currentdate.click();
		   WebElement pmlink = driver.findElement(By.xpath ("//div[@id='p:f:j_id25:j_id69:20:hh']"));
		   pmlink.click();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		   WebElement other = driver.findElement(By.xpath ("//div[@class='multiLineEventBlock dragContentPointer']")); 
		   other.click();
		   WebElement pmlinkk = driver.findElement(By.xpath ("//div[@id='p:f:j_id25:j_id69:20:hh']"));
		   pmlinkk.click();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		   WebElement NewEvent = driver.findElement(By.xpath ("//input[@title='New Event']"));
		   NewEvent.click();
		   driver.findElement(By.id("IsRecurrence")).click();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		   driver.findElement(By.xpath("//label[@for='rectypeftw']")).click();
		   driver.findElement(By.xpath ("//label[@for='RecurrenceEndDateOnly']")).click();
		   driver.findElement(By.xpath ("//a[normalize-space()='Calculate Latest Date']")).click();
		   driver.findElement(By.xpath ("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
		   
           
		   
		   	}

}
