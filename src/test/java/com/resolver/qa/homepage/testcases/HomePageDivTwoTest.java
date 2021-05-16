package com.resolver.qa.homepage.testcases;

import com.reslover.qa.base.TestBase;
import com.reslover.qa.pages.HomePageDivTwo;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageDivTwoTest extends TestBase {
    static HomePageDivTwo homePage;

    @BeforeAll
    public static void setUp() {
        initialization();
        homePage = new HomePageDivTwo();
    }

    @Test
    public void listGroupSizeCheck() {
        assertEquals(3,homePage.listGroupSize());
    }

    @Test
    public void listItem2Check() {
        assertTrue(homePage.secondListItemText().trim().contains("List Item 2"));
    }

    @Test
    public void listItemBadgeCheck() {
        assertEquals("6",homePage.listItemBadge().trim());
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
