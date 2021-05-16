package com.resolver.qa.homepage.testcases;

import com.reslover.qa.base.TestBase;
import com.reslover.qa.pages.HomePageDivOne;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageDivOneTest extends TestBase {
    static HomePageDivOne homePageDivOne;

    @BeforeAll
    public static void setUp() {
        initialization();
        homePageDivOne = new HomePageDivOne();
    }

    @Test
    public void homePageEmailTest() {
        assertTrue(homePageDivOne.validateHomePageEmail());
    }

    @Test
    public void homePagePasswordTest() {
        assertTrue(homePageDivOne.validateHomePagePassword());
    }

    @Test
    public void homePageLoginBtn() {
        assertTrue(homePageDivOne.validateHomePageLoginBtn());
    }

    @Test
    public void homepageEnterFieldTest() {
        homePageDivOne.login(prop.getProperty("email"), prop.getProperty("password"));
    }


    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
