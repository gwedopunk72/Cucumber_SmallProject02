Feature: Test cases for login features

  Scenario: [TC01] Create Account With Empty Email
    Given user open the web page
    When User click Sign In
    Then User click create account

  Scenario:  [TC02] Create Account With Valid Email
    Given User input valid email
    Then User click login btn

  Scenario: [TC03] Create Account With Valid Personal Information
    Given User input all personal data
    Then  User click register button

  Scenario: [TC04] Test Sign In Account With Empty Email
    Given User input password
    Then User login

  Scenario: [TC05] Sign In Account With Empty Password
    Given User input email for login
    When  User input empty pass
    Then  User select login

  Scenario: [TC06] Sign In Account With Valid Data
    Given I input valid password
    When  I Select login
    Then  I close browser

