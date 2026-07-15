package com.SeleniumWebDriver.ChromeBrowsertest;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize(); //for full screen of web--maximize() is a method
	  //driver.manage().window().minimize();//for half screen of web
		
	}

}
