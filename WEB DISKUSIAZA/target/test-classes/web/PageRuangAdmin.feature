Feature: user on page ruang admin

  Scenario: User membuat ruang
    Given user on home page
    When user klik buat ruang
    And user input nama ruang
    And user input deskripsi
    Then user sukses buat ruang
    And user berada di page ruang admin
