Feature: user on page pertanyaan

  Scenario: User mengirimkan pertanyaan
    Given user on page pertanyaan
    When user menulis pertanyaan
    And user memilih privasi pertanyaan
    Then user sukses mengirim pertanyaan
