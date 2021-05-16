package com.resolver.qa.homepage.testcases;

import com.reslover.qa.base.TestBase;
import com.reslover.qa.pages.HomePageDivThree;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageDivThreeTest extends TestBase {
    static HomePageDivThree homePage;

    @BeforeAll
    public static void setUp() {
        initialization();
        homePage = new HomePageDivThree();
    }

    @Test
    public void dropDownDefalutSelectedTextCheck() {
        assertEquals("Option 1",homePage.getDefaultSelectedText());
    }


    @Test
    public void dropDownsetSelectedText() {
        homePage.setSelectedText("Option 3");

    }

    @AfterAll
    public static void tearDown() {
        try {
            Thread.sleep(4000);
            driver.quit();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

    }
}
