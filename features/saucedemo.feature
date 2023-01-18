Feature: SauceDemo  bag product add to cart Functionality

  Scenario: single product add to cart
    Given I have opened the browser then maximized it.
    And I have entered the url
    When I enter valid username and password
    And clicked Login button
    Then I clicked one product
    And I added it to cart
    Then I click backto Products
    And clicked on menu option
    Then I clicked on Logout option
    And Then I have closed the browser
