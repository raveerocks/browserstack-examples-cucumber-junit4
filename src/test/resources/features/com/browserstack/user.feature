Feature: User Feature

  Scenario: Login as User with no image loaded
    Given I navigate to website
    And I click on "Sign In" link
    And I type "image_not_loading_user" in "username"
    And I type "testingisfun99" in "password"
    And I press Log In Button
    Then I should see no image loaded

  Scenario: Login as User with existing Orders
    Given I navigate to website
    And I click on "Sign In" link
    And I type "existing_orders_user" in "username"
    And I type "testingisfun99" in "password"
    And I press Log In Button
    And I click on "Orders" link
    Then I should see elements in list
