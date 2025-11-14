# Selenium Test Engineer Coding Challenge

## Setup Instructions

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- Chrome browser installed

### Getting Started

1. Import the project into your IDE (IntelliJ IDEA or Eclipse)
2. Maven will automatically download dependencies
3. Run `mvn clean test` to verify setup

## Your Task

Complete the test automation for adding a product to cart on https://www.saucedemo.com/

### What's Already Done
- Project structure with Maven
- Base page class with common methods
- Page object skeleton classes
- Test class structure
- WebDriver setup and teardown

### What You Need to Do
1. Add locators to the page classes
2. Implement methods in LoginPage, ProductsPage, and CartPage
3. Complete the test in ShoppingCartTest
4. Ensure at least 3 assertions pass

### Test Credentials
- Username: `standard_user`
- Password: `secret_sauce`

### Running Tests
```bash
mvn clean test