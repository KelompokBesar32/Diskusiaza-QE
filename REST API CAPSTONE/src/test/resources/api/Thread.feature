Feature: As a user on category thread

  Scenario: User get thread category
    Given user set get category thread endpoints
    When user send get category thread endpoints
    Then user get respon code 200
    And user receive details category thread

  Scenario: User get all thread
    Given user set get all thread endpoints
    When user send get all thread endpoints
    Then user get response code2 200
    And user receive details all thread

  Scenario: User get thread by id
    Given user set get thread by id endpoints
    When user send get thread by id endpoints
    Then user get response code3 200
    And user receive thread by id