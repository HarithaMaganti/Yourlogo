package com.maven.planit;

import com.maven.planit.driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before
    public void setUp() {
        driverFactory.setupBrowser("Chrome");
        driverFactory.setupUrl("http://automationpractice.com/index.php");
        driverFactory.maximise();
        driverFactory.timeOut();
        driverFactory.DeleteCookies();
    }

    @After
    public void tearDown() {

        //driverFactory.closeBrowser();
    }
}
