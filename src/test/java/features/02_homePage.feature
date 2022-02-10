Feature: Inventory Page

  Scenario: Successful check the Links of Inventory page of StuUser
    Given User is on Inventory Page
    When Click on links and verify that user is on the right page
    Then Click on logout button

  Scenario: Successful check the images of Inventory page of StuUser
    Given User is on Inventory Page
    When Click on Image and verify that user is on the right page
    Then Click on logout button

  Scenario: Successful check the add to cart of Inventory page of StuUser
    Given User is on Inventory Page
    When Click on add to cart and verify that user is on the right page
    Then Click on logout button

  Scenario: Successful check the social media links of Inventory page of StuUser
    Given User is on Inventory Page
    When Click on social media verify that user is on the right page
    Then Click on logout button