Feature: Search
 Scenario Outline: Cari repository yang telah dibuat
    Given Cari repository
    When User login <email> dan <password>
    And User mengetikan <nama repository>
    And User menekan tombol enter
    Then Menemukan <nama repository> yang dicari
   Examples:
     | email | password | nama repository |
     | dimasagustiawan30@gmail.com | Kuningan09081999 | Dimas-Agustiawan/peminjaman-buku |