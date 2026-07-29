package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utility.BrowserFactory;
import Utility.ConfigDataProvider;
import Utility.ExcelDataProvider;
import Utility.Helper;

public class BaseClass {

	public WebDriver driver;

	public ConfigDataProvider config;

	public ExcelDataProvider excel;

	@BeforeMethod
	public void setup() {

		config = new ConfigDataProvider();

		excel = new ExcelDataProvider();

		driver = BrowserFactory.startApplication(driver,
				config.getBrowser(),
				config.getURL());

		Helper.implicitWait(driver, config.getImplicitWait());

	}

	@AfterMethod
	public void tearDown() throws Exception {

		BrowserFactory.quitBrowser(driver);

	}

}