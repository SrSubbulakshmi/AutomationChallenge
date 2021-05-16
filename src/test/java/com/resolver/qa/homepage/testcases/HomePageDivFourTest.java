package com.resolver.qa.homepage.testcases;

import com.reslover.qa.base.TestBase;
import com.reslover.qa.pages.HomePageDivFour;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageDivFourTest extends TestBase {
    static HomePageDivFour homePage;

    @BeforeAll
    public static void setUp() {
        initialization();
        homePage = new HomePageDivFour();
    }

    @Test
    public void divFourBtnOneEnabledTest() {
        assertTrue(homePage.validateDivFourBtnone());
    }

    @Test
    public void divFourBtnTwoDisabledTest() {
        assertTrue(homePage.validateDivFourBtntwo());
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
