@Regist
Feature: As a user on register page

  Scenario: User input valid data
    Given user on login page 5
    And user click sign up1
    When user input valid nama depan siti
    And user input valid nama belakang mutee
    And user input valid email sitimutee@gmail.com
    And user input valid password susah
    And user input valid confirm password susah
    And user input valid tanggal lahir
    And user pilih jenis kelamin
    And user klik Daftar button
    Then user sign up to login page
