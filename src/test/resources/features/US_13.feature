Feature: Contact list feature
  User Story: As a user I should be able to view the contact list

  Scenario Outline:
    Given "<user>" is log in and user is on the dashboard page
    When User clicks the contact module
    Then Verify the contact names in the list
    Examples:
      | user    |
      | user27  |
      | user57  |
      | user87  |
      | user117 |