package com.reslover.qa.pages;

import com.reslover.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageDivSix extends TestBase {
    //Page Factory - OR
    @FindBy(xpath = "//div[@id='test-6-div']//table//tr[2]//td[2]")
    WebElement emailType;

    public HomePageDivSix() {
        PageFactory.initElements(driver, this);
    }

    public String findCellValue(int row, int col) {
        return driver.findElement(By
                .xpath("//div[@id='test-6-div']//table//tr[" + (row+1) +  "]//td[" + (col + 1) + "]"))
                .getText();

    }
}
