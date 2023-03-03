package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projectthirteen {

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
	   WebElement Accounts = driver.findElement(By.xpath ("//a[@title='Accounts Tab']"));
	   Accounts.click();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	   WebElement New = driver.findElement(By.cssSelector("input[title='New']"));
	   New.click();
	   WebElement AccountName = driver.findElement(By.xpath ("//input[@id='acc2']"));
	   AccountName.sendKeys("Uma");
	   	   
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   WebElement SaveandNew = driver.findElement(By.xpath ("//td[@id='topButtonRow']//input[@title='Save & New']"));
	   SaveandNew.click();
	   WebElement AccounttName = driver.findElement(By.xpath ("//input[@id='acc2']"));
	   AccounttName.sendKeys("Bharathi");
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	 //td[@id='topButtonRow']//input[@title='Save']
	   WebElement save = driver.findElement(By.xpath ("//td[@id='topButtonRow']//input[@title='Save']"));
	   
	   WebElement MergeAccounts = driver.findElement(By.xpath ("//input[@id='acc2']"));
	   MergeAccounts.click();
	       
}

}



