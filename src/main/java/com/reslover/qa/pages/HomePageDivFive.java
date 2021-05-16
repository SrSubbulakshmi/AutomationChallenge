package com.reslover.qa.pages;

import com.reslover.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageDivFive extends TestBase {


    //Page Factory - OR
    @FindBy(xpath = "//div[@id='test-5-div']//button[@id='test5-button']")
    WebElement divBtn;

    //Page Factory - OR
    @FindBy(xpath = "//div[@id='test-5-div']//div[@id='test5-alert']")
    WebElement divAlert;


    public HomePageDivFive() {

        PageFactory.initElements(driver, this);
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//div[@id='test-5-div']//button[@id='test5-button']")));
    }

    public void buttonClick() {
        try {
            divBtn.click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,400)", "");
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean validateDisplayMessage() {
        return divAlert.isDisplayed();
    }

    public String validateSuccessMsgDisplayed() {

        return divAlert.getText();
    }

    public boolean validateBtnDisabled() {
        return divBtn.isDisplayed();
    }





}
