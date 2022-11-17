package org.example.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.enums.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    public static WebDriver get(Browser browser){
        if (Browser.chrome == browser){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (Browser.firefox == browser){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (Browser.ie == browser){
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        } else  if (Browser.edge == browser){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }
        throw  new IllegalArgumentException("Driver not found: " + browser);
    }
}
