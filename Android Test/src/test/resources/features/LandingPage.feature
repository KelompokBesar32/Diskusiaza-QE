@landing
Feature: User on landing page

  Scenario: User open profile page
    Given user login with email ii@gmail.com and password 123
    And user on landing page
    When user click profile
    Then user on Profile page

  Scenario: User open explore page
    Given user login with email ii@gmail.com and password 123
    And user on landing page
    When user click explore
    Then user on explore page

  Scenario: User open trending page
    Given user login with email ii@gmail.com and password 123
    And user on landing page
    When user click trending
    Then user on trending page

  Scenario: User create thread
    Given user login with email ii@gmail.com and password 123
    And user on landing page
    When user click plus icon
    And user type judul apa
    And user type isi aja
    And user click kirimkan button
    Then user succes send thread


