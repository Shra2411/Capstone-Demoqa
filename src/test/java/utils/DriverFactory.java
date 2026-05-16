package utils;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver initDriver() {

        try {

            ChromeOptions options =
                    new ChromeOptions();

            options.addArguments("--start-maximized");

            driver =
                    new RemoteWebDriver(
                            new URL("http://localhost:4444/wd/hub"),
                            options
                    );

        }

        catch(Exception e) {

            e.printStackTrace();
        }

        return driver;
    }
}