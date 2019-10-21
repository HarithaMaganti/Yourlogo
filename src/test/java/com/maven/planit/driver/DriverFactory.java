package com.maven.planit.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory() {

        PageFactory.initElements(driver, this);
    }

    public void setupBrowser(String Browser) {
        switch (Browser) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                driver = new InternetExplorerDriver();
                break;
        }
    }

    public void setupUrl(String URL) {

        driver.get(URL);
    }

    public void maximise() {

        driver.manage().window().maximize();
    }

    public void timeOut() {

        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    public void DeleteCookies() {

        driver.manage().deleteAllCookies();
    }

    public void closeBrowser() {

        driver.close();
    }




}
