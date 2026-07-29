package com.Framework.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//input[@id='log_email']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='log_password']")
    WebElement Password;

    @FindBy(xpath = "//input[@name='log_submit']")
    WebElement SignInbutton;
    public void enterEmail(String email) {  
        Email.sendKeys(email);
    }
    public void enterPassword(String password) {
        Password.sendKeys(password);
    }
    public void clickSignIn() {

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", SignInbutton);
    }
    public void login(String email,String password) {
        enterEmail(email);
        enterPassword(password);
        clickSignIn();

    }

}
