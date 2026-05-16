package base;

import org.openqa.selenium.WebDriver;

import utils.DriverFactory;

public class BaseTest {

    public static WebDriver driver;

    public void initDriver() {

        driver = DriverFactory.initDriver();

        driver.get("https://demoqa.com/login");
    }

    public void quitDriver() {

        if(driver != null) {
            driver.quit();
        }
    }
}