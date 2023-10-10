Feature: Make a login in the application

  Scenario: An existing user make the authentication in the ecommerce
    Given I enter to the luma ecommerce site
    When I entered a valid credential
    Then I should see the title after login