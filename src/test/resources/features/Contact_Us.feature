@Contact-Us @regression

Feature: WebDriver University - Contact Us page

  Background:
    Given I access the WebDriver university Contact Us page

  Scenario: Validate Successful login scenario
    When I enter the first name
    And I enter the last name
    And I enter the email address
    And I enter the comment
    And I click on submit button
    Then I should be presented with a successful Contact Us submission message

  Scenario: Validate Reset button scenario
    When I enter the first name
    And I enter the last name
    And I enter the email address
    And I enter the comment
    And I click on reset button
    Then All the text fields should get cleared

  Scenario: Validate Successful login scenario - specific data
    Given I access the WebDriver university Contact Us page
    When I enter the specific first name abhijeet
    And I enter the specific last name kadamba
    And I enter the specific email address abhijeeth@gmail.com
    And I enter the specific comment "How are you"
    And I click on submit button
    Then I should be presented with a successful Contact Us submission message