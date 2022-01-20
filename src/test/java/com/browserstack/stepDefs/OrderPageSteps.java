package com.browserstack.stepDefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class OrderPageSteps extends BaseStep{

    @Then("I should see elements in list")
    public void iShouldSeeElementsInList() {
        WebDriverWait wait = new WebDriverWait(getWebDriver(), 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logout")));
        WebElement element = null;
        try {
            element = getWebDriver().findElement(By.cssSelector("#__next > main > div > div"));
            List<WebElement> orders = element.findElements(By.tagName("div"));
            Assert.assertNotEquals(0, orders.size());
        } catch (NoSuchElementException e) {
            throw new AssertionError("There are no orders");
        }
    }

}
