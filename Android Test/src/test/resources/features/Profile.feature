@profile
Feature: User wanna see profile

  Scenario: As user i wanna look my profile page
    Given user login and go to homepage
    When User tap profile button
    And user tap profile
    Then user can see my profile

  Scenario: As user i wanna update my profile
    Given user login and go to homepage
    When User tap profile bar
    And user click profile button
    And user tap edit profile
    And user update data profile
    And user tap simpan
    Then user see update profile

  Scenario: As user i wanna delete my thread
    Given user login and go to homepage
    When User tap profile bar2
    And user click profile button2
    And user tap titik tiga
    And user tap delete
    Then user success delete thread

  Scenario: As user i wanna edit my thread
    Given user login and go to homepage
    When User tap profile bar3
    And user click profile button3
    And user tap titik tiga2
    And user tap edit thread
    Then user success edit thread