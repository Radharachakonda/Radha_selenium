package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projecttwelve {

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
		   WebElement editBtn = driver.findElement(By.xpath ("//a[normalize-space()='Edit']"));
		   editBtn.click();
		   WebElement FilterByOwner = driver.findElement(By.cssSelector("td[nowrap='nowrap']"));
		   FilterByOwner.click();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		   WebElement fieldTypeDropdown = driver.findElement (By.xpath ("//select[@id='fcol1']")); 
			fieldTypeDropdown.sendKeys("account name");
			WebElement fieldTypeOperator = driver.findElement (By.xpath ("//select[@id='fop1']")); 
			fieldTypeOperator.sendKeys("contains");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			WebElement fieldTypeValue = driver.findElement (By.xpath ("//input[@id='fval1']"));
			fieldTypeOperator.sendKeys("Venkata");
			WebElement Saved = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
			Saved.click();
					
			
			
		  
		  
		
		  
	}
}

