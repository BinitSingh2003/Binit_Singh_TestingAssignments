package com.Framework.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoveCalculatorPage {
    WebDriver driver;
	public LoveCalculatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//======================== Web Elements ========================//

	@FindBy(xpath = "//input[@name='name']")
	WebElement YourName;

	@FindBy(xpath = "//input[@name='name1']")
	WebElement FieldName1;

	@FindBy(xpath = "//input[@name='name2']")
	WebElement FieldName2;

	@FindBy(xpath = "//input[@name='name3']")
	WebElement FieldName3;

	@FindBy(xpath = "//input[@name='name4']")
	WebElement FieldName4;

	@FindBy(xpath = "//input[@name='calculate']")
	WebElement btnFlames;

//	@FindBy(xpath = "//input[@value='Reset']")
//	WebElement btnReset;

	@FindBy(xpath = "//div[@id='tablid']//div[@class='group clearfix']")
	WebElement ResultSection;

	
	public void enterYourName(String yourName) {
		YourName.sendKeys(yourName);
	}

	public void enterName1(String name1) {
		FieldName1.sendKeys(name1);
	}

	public void enterName2(String name2) {
		FieldName2.sendKeys(name2);
	}

	public void enterName3(String name3) {
		FieldName3.sendKeys(name3);
	}

	public void enterName4(String name4) {	
		FieldName4.sendKeys(name4);
	}

	public void clickFlames() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", btnFlames);
	}
//	public void clickReset() {
//		btnReset.click();
//	}

	public String getResult() {

		return ResultSection.getText();

	}

}