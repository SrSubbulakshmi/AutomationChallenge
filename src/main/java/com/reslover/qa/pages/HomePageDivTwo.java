package com.reslover.qa.pages;

import com.reslover.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageDivTwo extends TestBase {

    //Page Factory - OR
    @FindBy(xpath = "//div[@id='test-2-div']//ul//li")
    List<WebElement> listgroup;

    @FindBy(xpath = "//div[@id=\"test-2-div\"]//ul//li[2][not(contains(text(),'6'))]")
    WebElement secondListItem;

    @FindBy(xpath = "//div[@id='test-2-div']//ul/li[2]/span")
    WebElement listItemBadge;

    public HomePageDivTwo() {
        PageFactory.initElements(driver, this);
    }

    public int listGroupSize() {
        return listgroup.size();
    }

    public String secondListItemText() {
        return secondListItem.getText();

    }

    public String listItemBadge() {
        return listItemBadge.getText();



    }




}
