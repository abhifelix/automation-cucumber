@Login @regression

Feature: WebDriver University - Login page

  Background:
    Given I access the WebDriver university Login page

  Scenario: Validate Successful login scenario
    When I enter the valid username webdriver
    And I enter valid password webdriver123
    And I click on login button
    Then I should be presented with a successful login message

  Scenario: Validate Un-Successful login scenario
    When I enter the valid username webdriver
    And I enter invalid password webdriver
    And I click on login button
    Then I should be presented with a validation failed message

  @smoke
  Scenario Outline: Validate successful and failure login scenarios
    When I enter the username <username>
    And I enter the password <password>
    And I click on login button
    Then I should be presented with a validationMessaage <validationMessage>

    Examples:
      | username | password | validationMessage |
      | webdriver | webdriver123 | validation succeeded |
      | selenium  | driver       | validation failed     |
      | webdriver | webdriver456 | validation failed     |

