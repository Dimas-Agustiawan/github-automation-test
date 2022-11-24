Feature: Logout
 Scenario Outline: User tidak ada interaksi selama 60 menit
    Given User logout
    When User login dengan <email> dan <password>
    And User tidak melakukan aktivitas selama 60 menit
    Then Akun akan logout otomatis
    Examples:
      | email | password |
      | dimasagustiawan30@gmail.com | Kuningan09081999 |

 Scenario Outline: User melakukan logout akun github
   Given User logout
   When User login dengan <email> dan <password>
   And User image akun github
   And Klik dropdown logout
   Then Menampilkan halaman dashboard
   Examples:
     | email | password |
     | dimasagustiawan30@gmail.com | Kuningan09081999 |