package com.training.Selenium;

import java.awt.Menu;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTFoura {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("oct22radha@abc.com");
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys(("radha"));
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   driver.findElement(By.id("Login")).click();
		  driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		  Select usermenu = new Select ((WebElement) usermenu.getFirstSelectedOption()Menu.class.getDeclaredMethods();
		
				
		   
			
	}

}
