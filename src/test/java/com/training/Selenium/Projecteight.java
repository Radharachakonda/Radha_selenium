package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.SearchContext;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Projecteight {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver ();
			driver.get("https://login.salesforce.com ");
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			WebElement username = driver.findElement(By.id("username"));
		    username.sendKeys("oct22radha@abc.com");
		    WebElement password = driver.findElement(By.id("password"));
		    password.sendKeys(("aajjay@12"));
		      driver.findElement(By.id("Login")).click();
			 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			WebElement userMenu = driver.findElement(By.id("userNav"));
			Actions actions = new Actions(driver);
			actions.moveToElement(userMenu).click().perform();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
			WebElement DeveloperConsole = driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']"));
			DeveloperConsole.click();
		    driver.quit();
			
			
			

	}

}
