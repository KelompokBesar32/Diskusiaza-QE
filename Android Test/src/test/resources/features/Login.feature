@login
Feature: User on login page

  Scenario: User input valid email and password
    Given user on login page
    When user type valid email ii@gmail.com and valid password 123
    And user click button login
    Then user success to landing page

  Scenario: user input valid email and invalid password
    Given user on login page
    When user input valid email and invalid password
    And user click button login2
    Then got massage2 email or password wrong

  Scenario: user input invalid email and valid password
    Given user on login page
    When user input invalid email and valid password
    And user click button login3
    Then got massage3 email or password wrong

  Scenario: user input invalid email and invalid password
    Given user on login page
    When user input invalid email and invalid password
    And user click button login4
    Then got massage4 email or password wrong