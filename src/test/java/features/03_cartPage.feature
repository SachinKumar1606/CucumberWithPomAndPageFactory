Feature: Cart Page

  Scenario: Successful check the BackPack is added to cart
    Given User is on the Inventory Page
    When Click on links of the product BackPack
    And Again click on the product name
    Then User is on BackPack Page

  Scenario: Successful check the BikeLight is added to cart or not
    Given User is on the Inventory Page
    When Click on links of the product BikeLight
    And Again click on the product name
    Then User is on BikeLight Page

  Scenario: Successful check the Item is added to cart or not
    Given User is on the Inventory Page
    When Click on links of the product tShirt
    And Again click on the product name
    Then User is on tShirt Page

  Scenario: Successful check the Jacket is added to cart or not
    Given User is on the Inventory Page
    When Click on links of the product Jacket
    And Again click on the product name
    Then User is on Jacket Page

  Scenario: Successful check the Onesie is added to cart or not
    Given User is on the Inventory Page
    When Click on links of the product Onesie
    And Again click on the product name
    Then User is on Onesie Page

  Scenario: Successful check the tRed is added to cart or not
    Given User is on the Inventory Page
    When Click on links of the product tRed
    And Again click on the product name
    Then User is on tRed Page