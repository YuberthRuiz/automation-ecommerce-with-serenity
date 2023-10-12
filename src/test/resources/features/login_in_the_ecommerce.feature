@regression @login
Feature: Validate login in the lumma ecommerce site

  Scenario: An existing user make the authentication in the ecommerce
    Given I enter to the luma ecommerce site
    When I entered the credentials "yuberth@gmail.com" and "Testing123"
    Then I should see the title after login

  Scenario Outline: An existing user make the authentication with wrong credentials in the ecommerce
    Given I enter to the luma ecommerce site
    When I entered the credentials "<user>" and "<password>"
    Then I should see the error message
    Examples:
      | user              | password   |
      | yuberth@gmail.com | testing123 |
      | yyb@gmail.com     | Testing123 |