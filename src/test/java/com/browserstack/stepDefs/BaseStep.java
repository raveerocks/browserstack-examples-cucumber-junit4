package com.browserstack.stepDefs;

import com.browserstack.junit.WebDriverRunner;
import org.openqa.selenium.WebDriver;

public class BaseStep {

    public WebDriver getWebDriver(){
        return WebDriverRunner.getWebDriver();
    }
}
