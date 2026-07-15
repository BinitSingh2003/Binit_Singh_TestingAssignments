package com.SeleniumWebDriver.EdgeBrowserTest;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
	}

}
