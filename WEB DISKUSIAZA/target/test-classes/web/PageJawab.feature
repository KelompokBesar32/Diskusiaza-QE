Feature: user on page jawaban

  Scenario: User menjawab pertanyaan
    Given user on page jawaban
    When user memilih pertanyaan
    And user klik jawab button
    And user menulis jawaban
    And user klik kirim button
    Then user sukses menjawab pertanyaan
