Feature: E-Commerce Application

Scenario: Customer Registration

Given User should open Chrome Browser.
When User should enter E-Commerce application URL in browser.
Then User should click on Sign Up/Register option.
Then User should enter valid First Name.
Then User should enter valid Last Name.
Then User should enter valid Email Address.
Then User should enter valid Mobile Number.
Then User should enter valid Password.
Then User should click on Register button.
Then User should verify registration success message is displayed.

Scenario: Customer Login

Given User should open Chrome Browser.
When User should enter E-Commerce application URL in browser.
Then User should click on Login option.
Then User should enter registered Email Address/Mobile Number.
Then User should enter valid Password.
Then User should click on Login button.
Then User should verify Home page is displayed successfully.

Scenario: Product Search

Given User should be logged into the application.
When User should search for a product.
Then User should click on a product from the search results.
Then User should verify Product Details page is displayed.
Then User should verify Product Name, Price, Images and Specifications are displayed.
Then User should verify Product Availability is displayed.

Scenario: Product Details

Given User should search for a product.
When User should select a product from the search results.
Then User should verify Product Details page is displayed.
Then User should verify Product Description is displayed.
Then User should verify Product Reviews and Ratings are displayed.

Scenario: Add Product to Cart

Given User should be on the Product Details page.
When User should click on Add to Cart button.
Then User should verify the product is added to the shopping cart.
Then User should verify Cart count is updated.

Scenario: Update Cart

Given User should have products in the shopping cart.
When User should update the quantity of a product.
Then User should click on Update Cart button.
Then User should verify the shopping cart is updated successfully.

Scenario: Remove Product from Cart

Given User should have products in the shopping cart.
When User should click on Remove button for a product.
Then User should verify the product is removed from the shopping cart.
Then User should verify the shopping cart is updated successfully.

Scenario: Wishlist

Given User should be on the Product Details page.
When User should click on Add to Wishlist button.
Then User should verify the product is added to the Wishlist.
Then User should verify Wishlist success message is displayed.

Scenario: Checkout

Given User should have products in the shopping cart.
When User should click on Checkout button.
Then User should enter Shipping Address.
Then User should verify Checkout page is displayed successfully.
Then User should verify Order Summary is displayed.

Scenario: Payment

Given User should be on the Checkout page.
When User should select a payment method.
Then User should enter valid payment details.
Then User should click on Pay Now button.
Then User should verify payment is successful.
Then User should verify payment confirmation message is displayed.

Scenario: Order Confirmation

Given User should complete payment successfully.
When User should place the order.
Then User should verify Order Confirmation page is displayed.
Then User should verify Order ID is generated.
Then User should verify Order Confirmation message is displayed.

Scenario: Order History

Given User should be logged into the application.
When User should navigate to Order History page.
Then User should verify previously placed orders are displayed.

Scenario: Logout

Given User should be logged into the application.
When User should click on Logout button.
Then User should verify Login page is displayed successfully.