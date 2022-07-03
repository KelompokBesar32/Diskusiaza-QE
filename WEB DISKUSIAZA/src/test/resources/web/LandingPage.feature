Feature: User on landing page

  Scenario: User membuka page pertanyaan
    Given user on landing page
    When user klik 'tanya' button
    Then user sukses ke halaman tambah pertanyaan

  Scenario: User membuka tulis jawaban
    Given user on landing page
    When user klik 'tulis' button
    Then user sukses ke halaman tulis

  Scenario: user membuka notifikasi
    Given user on landing page
    When user klik sidebar notifikasi
    Then user sukses ke halaman notifikasi

  Scenario: User membuka search field
    Given user on landing page
    When user klik search field
    Then user on search page

  Scenario: User membuka Explore
    Given user on landing page
    When user klik sidebar explore
    Then user on explore page

  Scenario: User membuka Trending
    Given user on landing page
    When user klik sidebar trending
    Then user on trending page

  Scenario: User membuka message
    Given user on landing page
    When user klik sidebar massage
    Then user on massage page

  Scenario: User membuka Bookmarks
    Given user on landing page
    When user klik sidebar Bookmark
    Then user on bookmarks page

  Scenario: User membuka Jawab
    Given user on landing page
    When user klik sidebar jawab
    Then user on jawab page

  Scenario: User membuka Ruang
    Given user on landing page
    When user klik sidebar ruang
    Then user on ruang page

  Scenario: User membuka Profil
    Given user on landing page
    When user klik sidebar profile
    Then user on Profil Page

  Scenario: User membuat Thread
    Given user on landing page
    When user klik Buat Thread
    Then user on thread page