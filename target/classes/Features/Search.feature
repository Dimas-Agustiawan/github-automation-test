Feature: Search
 Scenario Outline: Cari repository yang telah dibuat
    Given Cari repository
    When User login <email> dan <password>
    And User mengetikan <nama repository>
    And User menekan tombol enter
    Then Menemukan link menuju ke dalam <nama repository>
   Examples:
     | email | password | nama repository |
     | dimasagustiawan30@gmail.com | Kuningan09081999 | Dimas-Agustiawan/peminjaman-buku |