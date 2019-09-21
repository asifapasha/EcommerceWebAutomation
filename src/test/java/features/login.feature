@login
Feature: Login Functionality

  @Test
    Scenario:  Verify valid user login
    Given User is on Homepage of the application
    When User navigates to login page
    Then Verify user on login page
    When User logs in with "abcdtest@test.com" and "Abcdabcd"
    Then Verify successful login

  @Test
  Scenario Outline: Verify Invalid user login
    Given User is on Homepage of the application
    When User navigates to login page
    Then Verify user on login page
    When User logs in with "<emailId>" and "<password>"
    Then Verify error message for invalid credentials


   Examples:
    | emailId | password |
    |  abcdtest@test.com |   Test0001 |
    |   abc@xyz.com      |   Abcdabcd |
    |   abc@xab.com      | test111    |
















    #  @Test
#   Scenario Outline: Verify error message on invalid user user login
#     Given User is on Homepage of the application
#