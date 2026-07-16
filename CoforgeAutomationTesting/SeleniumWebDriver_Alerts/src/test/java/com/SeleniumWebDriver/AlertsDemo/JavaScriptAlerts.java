package com.SeleniumWebDriver.AlertsDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Helper;

public class JavaScriptAlerts{
	@Test
	public void TestPopup() throws Exception{
		WebDriver driver=Helper.startBrowser("Chrome");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(10000);
		alert.accept();
		String result=driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result);
		
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(10000);
		alert2.dismiss();
		String result2=driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result2);
		Assert.assertEquals("You clicked: Cancel", result2);
		
		
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert3=driver.switchTo().alert();
		Thread.sleep(10000);
		alert3.accept();
		String result3=driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result3);
		Assert.assertEquals("You clicked: Ok", result3);
		
		
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		driver.switchTo().alert().sendKeys("Binit");
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		String result4=driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result4);
		Assert.assertEquals("You entered: Binit", result4);
		
		
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String result5=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
		Thread.sleep(10000);
		System.out.println(result5);
		Assert.assertEquals("Congratulations! You must have the proper credentials.", result5);
		
	}
	
	    
	
	
}
