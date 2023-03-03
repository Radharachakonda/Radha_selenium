package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projectthirtyfive {

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
		   WebElement AllTabs = driver.findElement(By.xpath("//img[@title='All Tabs']"));
		   AllTabs.click();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		   WebElement Customizemytabs = driver.findElement(By.xpath("//input[@title='Customize My Tabs']"));
		   Customizemytabs.click();
		   WebElement Selectedtab = driver.findElement(By.cssSelector("label[for='duel_select_1']"));
		   Selectedtab.click();
		   	WebElement ConsumptionSchedules = driver.findElement(By.xpath("//option[@value='ConsumptionSchedule']"));
			ConsumptionSchedules.click();
			WebElement Remove = driver.findElement(By.xpath("//img[@title='Remove']"));
			Remove.click();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			WebElement usermenu = driver.findElement(By.id("userNav-arrow"));
			usermenu.click();
			WebElement Logout = driver.findElement(By.xpath ("//a[@title='Logout']"));
			Logout.click();
			
			
			
			
		   

	}

}
