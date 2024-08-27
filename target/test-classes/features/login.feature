@Sanity
Feature: User Authentication

  Background: 
    Given User clicks on the login link
@reg
  Scenario: Login should be success
    And User enter the username as "ortoni"
    And User enter the password as "pass1234"
    When User click on the login button
    Then Login should be success

  @smoke @reg
  Scenario: Login should fail
    And User enter the username as "Koushik"
    And User enter the password as "passkoush"
    When User click on the login button
    But Login should fail
