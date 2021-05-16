package com.resolver.qa.homepage.testcases;

import com.reslover.qa.base.TestBase;
import com.reslover.qa.pages.HomePageDivFive;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageDivFiveTest extends TestBase {
    static HomePageDivFive homepage;

    @BeforeAll
    public static void setUp() {
        initialization();
        homepage = new HomePageDivFive();
    }


    @Test
    public void successMessageCheck() {
        assertEquals("You clicked a button!", homepage.validateSuccessMsgDisplayed());
    }

    @Test
    public void afterClickedBtnDisplayedCheck() {
        homepage.buttonClick();
        assertTrue(homepage.validateDisplayMessage());
        assertTrue(homepage.validateBtnDisabled());
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

}
