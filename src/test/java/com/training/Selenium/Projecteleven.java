package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projecteleven {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://login.salesforce.com ");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("Josybhattla@abc.com");
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys(("@Machine1"));
	      driver.findElement(By.id("Login")).click();
		 try {
			Thread.sleep(2000);
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
		   AccountName.sendKeys("Venkata");
		   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   Select dropdown = new Select( driver.findElement (By.cssSelector("#acc6")));
		   dropdown. selectByVisibleText("Technology Partner");
		   
		   Select dropdownn = new Select( driver.findElement(By.xpath (" //select[@id='00N2w00000VGucc']")));
		   dropdownn.selectByIndex(1); 
		 
		WebElement btn = driver.findElement (By.cssSelector("[id='bottomButtonRow'] input[title='Save']"));
		btn.click();
		
	


	}

}
