Feature: Create Repository
 Scenario Outline: Buat repository dengan benar (public)
    Given User membuat repository
    When User melakukan login dengan <email> dan <password>
    And User input nama repository <nama repository>
    And User mengklik radio button public
    And User mengklik button create repository
    Then Menampilkan halaman setup
    And Access repository public
   Examples:
     | email | password | nama repository |
     | dimasagustiawan30@gmail.com | Kuningan09081999 | percobaan3 |

 Scenario Outline: Buat repository tanpa input nama repository
   Given User membuat repository
   When User melakukan login dengan <email> dan <password>
   And User mengklik radio button public
   And User mengklik button create repository
   Then Menampilkan pesan repository creation failed
  Examples:
    | email | password |
    | dimasagustiawan30@gmail.com | Kuningan09081999 |

 Scenario Outline: Membuat repository yang sudah ada (public)
   Given User membuat repository
   When User melakukan login dengan <email> dan <password>
   And User input nama repository <nama repository>
   And User mengklik radio button public
   And User mengklik button create repository
   Then Menampilkan pesan repository creation failed
  Examples:
    | email | password | nama repository |
    | dimasagustiawan30@gmail.com | Kuningan09081999 | peminjaman-buku |

 Scenario Outline: Membuat repository dengan benar (private)
   Given User membuat repository
   When User melakukan login dengan <email> dan <password>
   And User input nama repository <nama repository>
   And User mengklik radio button private
   And User mengklik button create repository
   Then Menampilkan halaman setup
   And Access repository private
  Examples:
    | email | password | nama repository |
    | dimasagustiawan30@gmail.com | Kuningan09081999 | private2 |

 Scenario Outline: Membuat repository yang sudah ada (private)
   Given User membuat repository
   When User melakukan login dengan <email> dan <password>
   And User input nama repository <nama repository>
   And User mengklik radio button private
   And User mengklik button create repository
   Then Menampilkan pesan repository creation failed
  Examples:
    | email | password | nama repository |
    | dimasagustiawan30@gmail.com | Kuningan09081999 | private2 |