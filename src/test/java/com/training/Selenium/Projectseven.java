package com.training.Selenium;

import java.awt.event.InputEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Projectseven {

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
		 
		WebElement userMenu = driver.findElement(By.id("userNav"));
		Actions actions = new Actions(driver);
		actions.moveToElement(userMenu).click().perform();
		WebElement mySettingsOption = driver.findElement(By.xpath ("//a[@title='My Settings']"));
		mySettingsOption.click();		
		WebElement mypersonalOption = driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
		mypersonalOption.click();
		WebElement Loginhistory = driver.findElement(By.xpath("//a[@id='LoginHistory_font']"));
		Loginhistory.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement DisplayandLayout = driver.findElement(By.cssSelector("a[href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('DisplayAndLayout');\"]"));
		DisplayandLayout.click();
		WebElement CustomizemyTabs = driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']"));
		CustomizemyTabs.click();
		WebElement Chatterr = driver.findElement(By.id("PersonalCollaboration_font"));
		Chatterr.click();
		WebElement CalanderandRemainder = driver.findElement(By.xpath ("//span[@id='CalendarAndReminders_font']"));
		CalanderandRemainder.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Remainderslink = driver.findElement(By.xpath ("//span[@id='Reminders_font']"));
		Remainderslink.click();
		
		}
}
