Feature: User on login page

  Scenario: User input valid email and password
    Given user on login page
    When user input valid email and valid password
    And user click button login
    Then user success to landing page

  Scenario: user input valid email and unvalid password
    Given user on login page 2
    When user input valid email and unvalid password
    And user click button login2
    Then got massage email or password wrong

  Scenario: user input unvalid email and valid password
    Given user on login page 3
    When user input unvalid email and valid password
    And user click button login3
    Then got massage email or password wrong2

  Scenario: user input unvalid email and unvalid password
    Given user on login page 4
    When user input unvalid email and unvalid password
    And user click button login4
    Then got massage email or password wrong3