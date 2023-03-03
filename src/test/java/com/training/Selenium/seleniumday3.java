package com.training.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumday3 {
	static WebDriver driver; 	

	public static void main(String[] args) throws InterruptedException {
		login ();
		Thread.sleep(5000);
		switchToTab ();
		clickonAlert ();
	    //clickonWindowAlert ();
		clickonpromptAlert ();
		
 	}

			
	public static void login (){
	
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver ();
	    driver.get("https://selenium-prd.firebaseapp.com");
	    driver.manage().window().maximize();
	    String expectedValue= "Selenium"; 
	    String title = driver.getTitle();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement email = driver.findElement(By.id("email_field"));
	    email.sendKeys("admin123@gmail.com");
	    WebElement password = driver.findElement(By.cssSelector("#password_field"));
	    password.sendKeys(("admin123"));
	    WebElement login = driver.findElement(By.xpath("//button[text ()='Login to Account']"));
	    login.click();
	
	 	}
	public static void switchToTab () {
		
		//button[contains (),'Switch To']
		
		WebElement SwitchTo = driver.findElement(By.xpath("//button[contains(text(), 'Switch To')]"));
		Actions action = new Actions (driver);
		action.moveToElement(SwitchTo).build().perform();
		
		//a[contains (), 'Alert']
		
	}
	private static void clickonAlert() {
	 
		WebElement alert = driver.findElement(By.xpath ("//a[text()='Alert']"));
		alert.click();
		
	}	
		
	private static void clickonWindowAlert() throws InterruptedException {
		WebElement windowalert = driver.findElement(By.xpath ("//button [text ()= 'Window Alert']"));
		windowalert.click(); 	
		Thread.sleep(5000);
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text" +alertText);
		driver.switchTo().alert().accept();
	}				
		
		private static void clickonpromptAlert () throws InterruptedException {
		WebElement Promtalert = driver.findElement(By.xpath ("//button [text ()= 'Promt Alert']"));
		Promtalert.click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Radha");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		String alertinfo = driver.findElement(By.id("Selenium")).getText();
		System.out.println(alertinfo);
		
	}

		
		
		
}