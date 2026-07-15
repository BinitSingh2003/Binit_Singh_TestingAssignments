package com.SeleniumWebDriver.FireFoxtest;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxTest {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize(); //for full screen of web--maximize() is a method

	}

}
