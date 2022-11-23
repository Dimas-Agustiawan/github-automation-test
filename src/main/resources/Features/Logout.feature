Feature: Logout
 Scenario Outline: User tidak ada interaksi selama 30 menit
    Given Buka browser
    When User login dengan <email> dan <password>
    And User tidak melakukan aktivitas selama 30 menit
    Then Akun akan logout otomatis
    Examples:
      | email | password |
      | dimasagustiawan30@gmail.com | Kuningan09081999 |