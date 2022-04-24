Feature: As a user, I should be able to log in.
  Scenario Outline: Verify login with valid credentials
    Given user on the login page
    When user enters username "<username>" and password "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page
    Examples:
      | username | password    |
      | User27   | Userpass123 |
      | User57   | Userpass123 |
      | User87   | Userpass123 |
      | User117  | Userpass123 |