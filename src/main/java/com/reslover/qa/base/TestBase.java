package com.reslover.qa.base;

import com.reslover.qa.utilities.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.nio.file.Paths;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public static void initialization() {
        loadProperties();
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {

            System.setProperty("webdriver.chrome.driver", "./src/main/java/com/reslover/qa/utilities/ChromeDriver90/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("FireFox")) {
            System.setProperty("webdriver.gecko.driver", "./src/main/java/com/reslover/qa/utilities/geckodriver-v0.29.1-win64/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
    }

    static void loadProperties() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("./src/main/resources/config.properties");
            prop.load(ip);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}
