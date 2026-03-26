Feature: User Login

  Scenario: Successful Login
    Given the user is on the OrangeHRM login page
    When the user enters valid credentials (username: "Admin", password: "admin123")
    And the user clicks on the Login button
    Then the user should be redirected to the Dashboard page
    And the user should see the Dashboard text