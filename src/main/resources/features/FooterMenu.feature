Feature: Test cases for footer menu

  Scenario: [TC17] Check Menu Policies and Legal Notice
    Given Tester login to website
    When  Tester click Policies menu
    Then  Tester click Legal Notice menu

  Scenario: [TC18] Check Menu Terms And Conditions and About Us
    Given Tester click Terms and Condition menu
    When  Tester click about us menu
    Then  Tester click secure payment menu

  Scenario: [TC19] Check Feature to Change Language
    Given Tester select language menu
    Then  Tester Select language Indonesia

  Scenario: [TC20] Test Logout Feature
    Given Tester select account menu btn
    Then  Tester select logout button