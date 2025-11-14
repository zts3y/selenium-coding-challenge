// src/main/java/pages/LoginPage.java
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for the Login Page.
 * TODO: Add locators and implement methods for login functionality.
 */
public class LoginPage extends BasePage {

    // TODO: Define locators for username field, password field, and login button
    // Example: private By usernameField = By.id("user-name");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Navigate to the login page.
     */
    public void navigateTo() {
        driver.get("https://www.saucedemo.com/");
    }

    /**
     * Perform login with username and password.
     * TODO: Implement this method
     *
     * @param username Username
     * @param password Password
     */
    public void login(String username, String password) {
        // TODO: Implement login logic
        // 1. Enter username
        // 2. Enter password
        // 3. Click login button
    }
}