// src/test/java/tests/ShoppingCartTest.java
package tests;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;

import static org.testng.Assert.*;

/**
 * Test class for Shopping Cart functionality.
 * TODO: Implement the test methods.
 */
public class ShoppingCartTest extends BaseTest {

    @Test
    public void testAddProductToCart() {
        // TODO: Implement the test
        // 1. Create page objects
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);

        // 2. Navigate to login page
        loginPage.navigateTo();
         

        // 3. Login with valid credentials
        

        // 4. Add "Sauce Labs Backpack" to cart
        

        // 5. Navigate to cart

        // 6. Verify product is in cart
        

        // 7. Verify quantity is 1
       

        // 8. Add at least one more assertion of your choice
    }
}