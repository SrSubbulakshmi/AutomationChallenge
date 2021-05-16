package com.reslover.qa.pages;

import com.reslover.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomePageDivThree extends TestBase {

    //Page Factory - OR
    @FindBy(xpath = "//div[@id='test-3-div']//button[@id='dropdownMenuButton']")
    WebElement dropDown;

    public HomePageDivThree() {
        PageFactory.initElements(driver, this);

    }

    public String getDefaultSelectedText() {

        return dropDown.getText().trim();
    }

    public void setSelectedText(String selectedText) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        js.executeScript("document.getElementById('dropdownMenuButton').textContent ='"+ selectedText +"'");
    }
}
