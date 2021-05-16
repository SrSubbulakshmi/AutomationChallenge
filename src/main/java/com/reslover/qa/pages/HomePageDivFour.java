package com.reslover.qa.pages;

import com.reslover.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageDivFour extends TestBase {
    //Page Factory - OR
    @FindBy(xpath = "//div[@id='test-4-div']//button[1]")
    WebElement firstBtn;

    @FindBy(xpath = "//div[@id='test-4-div']//button[2]")
    WebElement secondBtn;

    public HomePageDivFour() {
        PageFactory.initElements(driver, this);
    }

    public boolean validateDivFourBtnone() {
        return firstBtn.isEnabled();
    }

    public boolean validateDivFourBtntwo() {
        return secondBtn.isDisplayed();
    }


}
