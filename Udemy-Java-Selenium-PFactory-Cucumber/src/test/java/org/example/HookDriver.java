package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HookDriver {
    public static WebDriver driver;

    @Before
    public static void createDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public static void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
