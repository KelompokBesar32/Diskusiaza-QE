@nyoba
Feature: user on register page

  Scenario: User input valid data
    Given user on register page
    When user input valid nama depan
    And user input valid nama belakang
    And user input valid email
    And user input valid password katasandi
    And user input confirm password katasandi
    And user input valid tanggal lahir
    And user pilih jenis kelamin
    And user klik Daftar button
    Then User on Login Page

  Scenario: user input email tanpa menggunakan '@'
    Given user on register page
    When user input valid nama depan
    And user input valid nama belakang
    And user input email iimail
    And user input valid password katasandi
    And user input confirm password katasandi
    And user input valid tanggal lahir
    And user pilih jenis kelamin
    And user klik Daftar button
    Then user got message2 invalid email

  Scenario: user tidak memasukkan email
    Given user on register page
    When user input valid nama depan3
    And user input valid nama belakang3
    And user input valid password3 katasandi
    And user input confirm password3 katasandi
    And user input valid tanggal lahir3
    And user pilih jenis kelamin3
    And user klik Daftar button3
    Then user got message3 email tidak boleh kosong

  Scenario: user tidak memasukan nama depan
    Given user on register page
    When user input valid nama belakang4
    And user input valid email4
    And user input valid password4 katasandi
    And user input confirm password4 katasandi
    And user input valid tanggal lahir4
    And user pilih jenis kelamin4
    And user klik Daftar button4
    Then user got message4 nama depan tidak boleh kosong

  Scenario: user tidak memasukkan password
    Given user on register page
    When user input valid nama depan5
    And user input valid nama belakang5
    And user input valid email5
    And user input confirm password5 katasandi
    And user input valid tanggal lahir5
    And user pilih jenis kelamin5
    And user klik Daftar button5
    Then user got message5 password tidak boleh kosong

  Scenario: user tidak memasukkan nama belakang
    Given user on register page
    When user input valid nama depan6
    And user input valid email6
    And user input valid password6 katasandi
    And user input confirm password6 katasandi
    And user input valid tanggal lahir6
    And user pilih jenis kelamin6
    And user klik Daftar button6
    Then user got message6 nama belakang tidak boleh kosong

  Scenario: user tidak memasukkan jenis kelamin
    Given user on register page
    When user input valid nama depan7
    And user input nama belakang7
    And user input valid email7
    And user input valid password7 katasandi
    And user input confirm password7 katasandi
    And user input valid tanggal lahir7
    And user klik Daftar button7
    Then user got message7 pilih jenis kelamin

  Scenario: user tidak mengisi confirm password
    Given user on register page
    When user input valid nama depan8
    And user input nama belakang8
    And user input valid email8
    And user input valid password8 katasandi
    And user input jenis kelamin8
    And user input valid tanggal lahir8
    And user klik Daftar button8
    Then user got message8 pusing


