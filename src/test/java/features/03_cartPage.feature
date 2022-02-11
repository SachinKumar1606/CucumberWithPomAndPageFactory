Feature: Cart Page

  Scenario: Successful check the BackPack is added to cart
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product BackPack
    And Again click on the product name
    Then User is on BackPack Page

  Scenario: Successful check the BikeLight is added to cart or not
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product BikeLight
    And Again click on the product name
    Then User is on BikeLight Page

  Scenario: Successful check the Item is added to cart or not
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product tShirt
    And Again click on the product name
    Then User is on tShirt Page

  Scenario: Successful check the Jacket is added to cart or not
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product Jacket
    And Again click on the product name
    Then User is on Jacket Page

  Scenario: Successful check the Onesie is added to cart or not
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product Onesie
    And Again click on the product name
    Then User is on Onesie Page

  Scenario: Successful check the tRed is added to cart or not
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product tRed
    And Again click on the product name
    Then User is on tRed Page

  Scenario: Successful check the BackPack is added to cart and then remove
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product BackPack
    And Again click on the add to cart and move to cart page BackPack
    And Click on remove button on cart page
    Then User is on Home Page again

  Scenario: Successful check the BikeLight is added to cart or not
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product BikeLight
    And Again click on the add to cart and move to cart page Bike Light
    And Click on remove button on cart page
    Then User is on Home Page again

  Scenario: Successful check the Item is added to cart or not
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product tShirt
    And Again click on the add to cart and move to cart page tShirt
    And Click on remove button on cart page
    Then User is on Home Page again

  Scenario: Successful check the Jacket is added to cart or not
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product Jacket
    And Again click on the add to cart and move to cart page Jacket
    And Click on remove button on cart page
    Then User is on Home Page again

  Scenario: Successful check the Onesie is added to cart or not
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product Onesie
    And Again click on the add to cart and move to cart page Onesie
    And Click on remove button on cart page
    Then User is on Home Page again

  Scenario: Successful check the tRed is added to cart or not
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product tRed
    And Again click on the add to cart and move to cart page tRed
    And Click on remove button on cart page
    Then User is on Home Page again

  Scenario: Successful buying product
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product BackPack
    And Again click on the add to cart
    And Click on CheckOut button
    Then User should be on your cart page

  Scenario: Successful buying product
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product BikeLight
    And Again click on the add to cart
    And Click on CheckOut button
    Then User should be on your cart page

  Scenario: Successful buying product
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product tShirt
    And Again click on the add to cart
    And Click on CheckOut button
    Then User should be on your cart page

  Scenario: Successful buying product
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product Jacket
    And Again click on the add to cart
    And Click on CheckOut button
    Then User should be on your cart page

  Scenario: Successful buying product
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product Onesie
    And Again click on the add to cart
    And Click on CheckOut button
    Then User should be on your cart page

  Scenario: Successful buying product
    Given User is on the Inventory Page with "standard_user" and "secret_sauce"
    When Click on links of the product tRed
    And Again click on the add to cart
    And Click on CheckOut button
    Then User should be on your cart page