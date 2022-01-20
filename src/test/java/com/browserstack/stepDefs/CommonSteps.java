package com.browserstack.stepDefs;

import com.browserstack.webdriver.core.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CommonSteps extends BaseStep{

    @Given("I navigate to website")
    public void iNavigateToWebsite() {
        getWebDriver().get(WebDriverFactory.getInstance().getTestEndpoint());
    }

    @And("I click on {string} link")
    public void iClickOnLink(String linkText) throws InterruptedException {
        getWebDriver().findElement(By.linkText(linkText)).click();
    }

    @And("I type {string} in {string} input")
    public void iTypeInInput(String text, String inputName) {
        getWebDriver().findElement(By.id(inputName)).sendKeys(text);
    }

    @And("I type {string} in {string}")
    public void iTypeIn(String text, String inputName) throws InterruptedException {
        if(inputName.equalsIgnoreCase("username")){
            getWebDriver().findElement(By.xpath("//*[@id=\"username\"]/div/div[1]")).click();
            getWebDriver().findElement(By.id("react-select-2-input")).sendKeys(text);
            getWebDriver().findElement(By.id("react-select-2-input")).sendKeys(Keys.ENTER);
        } else if (inputName.equalsIgnoreCase("password")) {
            getWebDriver().findElement(By.xpath("//*[@id=\"password\"]/div/div[1]")).click();
            getWebDriver().findElement(By.id("react-select-3-input")).sendKeys(text);
            getWebDriver().findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
        }
    }

}
