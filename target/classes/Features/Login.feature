Feature: Login
 Scenario Outline: User melakukan login dengan benar
    Given User login ke github
    When User input email <email>
    And User input password <password>
    And User klik button sign in
    Then Menampilkan halaman awal github
   Examples:
     | email | password |
     | dimasagustiawan30@gmail.com | Kuningan09081999 |

  Scenario: User tidak input email dan password
    Given User login ke github
    When User klik button sign in
    Then Menampilkan pesan email harus terisi
    And Menampilkan pesan password harus terisi

 Scenario Outline: User melakukan login dengan salah
    Given User login ke github
    When User input email <email>
    And User input password <password>
    And User klik button sign in
    Then Menampilkan pesan email atau password salah
   Examples:
     | email | password |
     | dimasagustiawan30@gmail.com | Kuningan001999 |