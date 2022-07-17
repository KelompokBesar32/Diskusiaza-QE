@profil
Feature: As a user on profil page

  Scenario: User get data profile
    Given user login and success auth using token
    When user set get profile endpoints
    And user send get profile endpoints
    Then user get profile respon code 200
    And user get valid data profile



