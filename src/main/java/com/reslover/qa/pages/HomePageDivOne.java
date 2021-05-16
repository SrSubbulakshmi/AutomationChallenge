package com.reslover.qa.pages;

import com.reslover.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageDivOne extends TestBase {

    //Page Factory - OR
    @FindBy(xpath = "//div[@id='test-1-div']//form[@class='form-signin']//input[@type='email']")
    WebElement emailType;

    @FindBy(xpath = "//div[@id='test-1-div']//form[@class='form-signin']//input[@type='password']")
    WebElement passwordType;

    @FindBy(xpath = "//div[@id='test-1-div']//form[@class='form-signin']//button[@class='btn btn-lg btn-primary btn-block']")
    WebElement loginBtn;

    public HomePageDivOne() {
        PageFactory.initElements(driver, this);
    }

    public boolean validateHomePageEmail() {
        return emailType.isDisplayed();
    }

    public boolean validateHomePagePassword() {
        return passwordType.isDisplayed();
    }

    public boolean validateHomePageLoginBtn() {
        return loginBtn.isDisplayed();
    }

    public HomePageDivOne login(String un, String pwd) {
        emailType.sendKeys(un);
        passwordType.sendKeys(pwd);
        loginBtn.click();

        return new HomePageDivOne();
    }

}
