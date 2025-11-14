// src/main/java/pages/ProductsPage.java
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object for the Products Page.
 * TODO: Add locators and implement methods for product interactions.
 */
public class ProductsPage extends BasePage {

    // TODO: Define locators for products, add to cart buttons, shopping cart icon, etc.
    // Example: private By shoppingCartBadge = By.className("shopping_cart_badge");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Add a specific product to cart by product name.
     * TODO: Implement this method
     *
     * @param productName Name of the product to add
     */
    public void addProductToCart(String productName) {
        // TODO: Implement logic to add product to cart
        // Hint: You may need to construct a dynamic locator based on product name
    }

    /**
     * Navigate to the shopping cart.
     * TODO: Implement this method
     */
    public void goToCart() {
        // TODO: Click on shopping cart icon
    }

    /**
     * Get the cart item count.
     * TODO: Implement this method
     *
     * @return Number of items in cart
     */
    public int getCartItemCount() {
        // TODO: Get the cart badge count and return as integer
        return 0;
    }
}