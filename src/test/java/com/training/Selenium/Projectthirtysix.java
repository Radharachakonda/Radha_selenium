package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projectthirtysix {

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
		   WebElement pmlink = driver.findElement(By.xpath (" //div[@class='multiLineEventBlock dragContentPointer']"));
		   pmlink.click();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		   WebElement Subjectcombo = driver.findElement(By.xpath ("//td[normalize-space()='Subject']"));
		   Subjectcombo.click();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		   WebElement Endtime = driver.findElement(By.xpath ("//td[@class='labelCol last']"));
		   Endtime.click();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		   WebElement Other = driver.findElement(By.xpath ("//div[@class='hoverOuter']"));
		   Other.click();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		   WebElement Editt = driver.findElement(By.xpath ("//input[@title='Edit']"));
		   Editt. click();
		   WebElement Save = driver.findElement(By.xpath ("//td[@id='topButtonRow']//input[@title='Save']"));
		   Save.click();
		   
		   
		   
	}

}
