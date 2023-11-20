package org.sdet.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriver {
    private WebDriver driver = null;

    public MyDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/gangadarisowmya/projects/satya/sdet/satyaDsAlgo/src/test/java/org/sdet/utils/Drivers/chromedriver");
            driver = new ChromeDriver(options);
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
