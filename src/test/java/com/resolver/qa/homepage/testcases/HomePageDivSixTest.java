package com.resolver.qa.homepage.testcases;

import com.reslover.qa.base.TestBase;
import com.reslover.qa.pages.HomePageDivFive;
import com.reslover.qa.pages.HomePageDivSix;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageDivSixTest extends TestBase {
    static HomePageDivSix homepage;

    @BeforeAll
    public static void setUp() {
        initialization();
        homepage = new HomePageDivSix();
    }

    @Test
    public void successMessageCheck() {
        assertEquals("Ventosanzap", homepage.findCellValue(2,2));
        assertEquals("Cardguard", homepage.findCellValue(0,2));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
