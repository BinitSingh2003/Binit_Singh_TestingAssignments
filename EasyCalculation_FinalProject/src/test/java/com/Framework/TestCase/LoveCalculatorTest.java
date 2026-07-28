package com.Framework.TestCase;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Framework.Pages.BaseClass;
import com.Framework.Pages.HomePage;
import com.Framework.Pages.LoginPage;
import com.Framework.Pages.LoveCalculatorPage;

import Utility.Helper;

@Feature("EasyCalculation Love Calculator")
public class LoveCalculatorTest extends BaseClass {

    @Test
    @Story("Verify Love Calculator Functionality")
    @Owner("Binit Singh")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Love Calculator using valid test data")
    public void verifyLoveCalculator() {

        // Open Login Page
        driver.get(config.getLoginURL());

        // Login
        LoginPage login = new LoginPage(driver);
        login.login(config.getEmail(), config.getPassword());

        // Open EasyCalculation Home
        driver.get(config.getURL());

        // Open Love Calculator
        HomePage home = new HomePage(driver);
        home.openLoveCalculator();

        // Love Calculator Page
        LoveCalculatorPage love = new LoveCalculatorPage(driver);

        // Read Excel Data
        String yourName = excel.getData("LoveData", 1, 0);
        String name1 = excel.getData("LoveData", 1, 1);
        String name2 = excel.getData("LoveData", 1, 2);
        String name3 = excel.getData("LoveData", 1, 3);
        String name4 = excel.getData("LoveData", 1, 4);

        // Enter Names
        love.enterYourName(yourName);
        love.enterName1(name1);
        love.enterName2(name2);
        love.enterName3(name3);
        love.enterName4(name4);

        // Click FLAMES
        love.clickFlames();

        Helper.captureScreenshot(driver, "LoveCalculatorResult");

        String result = love.getResult();

        System.out.println(result);

        Assert.assertFalse(result.isEmpty(), "Result not displayed.");
    }
}