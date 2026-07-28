package com.Framework.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[normalize-space()='Love Calculator']")
    WebElement lnkLoveCalculator;

    public void openLoveCalculator() {

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", lnkLoveCalculator);

    }

}