@profil
Feature: As a user on profil page

  Scenario: User get data profile
    Given user get profile endpoints
    When user kirim token
    Then user get response code 200
    And user get valid data profile

  Scenario: User update data profile
    Given user put profile endpoints
    When user input update body
    Then user get valid response code 200
    And user get update data profile

