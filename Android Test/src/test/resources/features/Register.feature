@Regist
Feature: As a user on register page

  Scenario: User input valid data
    Given user open login page
    And user click sign up
    When user input valid nama depan siti
    And user input valid nama belakang mutee
    And user input valid email
    And user input valid password susah
    And user input valid confirm password susah
    And user input valid tanggal lahir
    And user pilih jenis kelamin
    And user klik Daftar button
    Then user sign up to login page

  Scenario: user input email tanpa menggunakan '@'
    Given user open login page
    And user click sign up
    When user input valid nama depan2 siti
    And user input valid nama belakang2 mutee
    And user input email without '@' sitimutewgmail.com
    And user input valid password2 susah
    And user input valid confirm password2 susah
    And user input valid tanggal lahir2
    And user pilih jenis kelamin2
    And user klik Daftar button2
    Then user got message2 'invalid email'

  Scenario: user tidak memasukkan email
    Given user open login page
    And user click sign up
    When user input valid nama depan3 siti
    And user input valid nama belakang3 mutee
    And user input valid password3 susah
    And user input valid confirm password3 susah
    And user input valid tanggal lahir3
    And user pilih jenis kelamin3
    And user klik Daftar button3
    Then user got message3 'email tidak boleh kosong'

  Scenario: user tidak memasukan nama depan
    Given user open login page
    And user click sign up
    When user input valid nama belakang4 mutee
    And user input valid email4 sitimutee@gmail.com
    And user input valid password4 susah
    And user input valid confirm password4 susah
    And user input valid tanggal lahir4
    And user pilih jenis kelamin4
    And user klik Daftar button4
    Then user got message4 'email tidak boleh kosong'

  Scenario: user tidak memasukan password
    Given user open login page
    And user click sign up
    When user input valid nama depan5 siti
    And user input valid nama belakang5 mutee
    And user input valid email5 sitimutee@gmail.com
    And user input valid confirm password5 susah
    And user input valid tanggal lahir5
    And user pilih jenis kelamin5
    And user klik Daftar button5
    Then user got message5 'password tidak boleh kosong'

  Scenario: user tidak memasukan nama belakang
    Given user open login page
    And user click sign up
    When user input valid nama depan6 siti
    And user input valid email6 sitimutee@gmail.com
    And user input valid password6 susah
    And user input valid confirm password6 susah
    And user input valid tanggal lahir6
    And user pilih jenis kelamin6
    And user klik Daftar button6
    Then user got message6 'nama belakang tidak boleh kosong'

  Scenario: user tidak memasukan jenis kelamin
    Given user open login page
    And user click sign up
    When user input valid nama depan7 siti
    And user pilih nama belakang7 mutee
    And user input valid email7 sitimutee@gmail.com
    And user input valid password7 susah
    And user input valid confirm password7 susah
    And user input valid tanggal lahir7
    And user klik Daftar button7
    Then user got message7 'pilih jenis kelamin'

  Scenario: user tidak mengisi confirm password
    Given user open login page
    And user click sign up
    When user input valid nama depan8 siti
    And user pilih nama belakang8 mutee
    And user input valid email8 sitimutee@gmail.com
    And user input valid password8 susah
    And user input valid jenis kelamin8
    And user input valid tanggal lahir8
    And user klik Daftar button8
    Then user got message8 'confirm password perlu diisi'

