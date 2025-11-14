// src/main/java/pages/BasePage.java
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Base page class that all page objects inherit from.
 * Contains common methods used across all pages.
 */
public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /**
     * Find an element with explicit wait.
     *
     * @param locator By locator for the element
     * @return WebElement
     */
    protected WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Click on an element with explicit wait.
     *
     * @param locator By locator for the element
     */
    protected void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    /**
     * Type text into an input field.
     *
     * @param locator By locator for the element
     * @param text    Text to type
     */
    protected void type(By locator, String text) {
        WebElement element = findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    /**
     * Get text from an element.
     *
     * @param locator By locator for the element
     * @return Text content of the element
     */
    protected String getText(By locator) {
        return findElement(locator).getText();
    }

    /**
     * Check if element is displayed.
     *
     * @param locator By locator for the element
     * @return true if element is displayed
     */
    protected boolean isDisplayed(By locator) {
        try {
            return findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}