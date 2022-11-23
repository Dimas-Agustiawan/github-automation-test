Feature: Search
 Scenario Outline: Cari repository yang telah dibuat
    Given Cari repository
    When User mengetikan <nama repository>
    And User menekan tombol enter
    Then Menemukan link menuju ke dalam repository
   Examples:
     | nama repository |
     | Dimas-Agustiawan/peminjaman-buku |