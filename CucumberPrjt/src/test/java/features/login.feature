Feature: eSMS Application Login

  Scenario: Login should be successfull
    Given User should navigate to eSMS Application
    And User should enter Employee ID
    And User should enter Password
    When User should click on Sign In button
    Then User should successfully Login to the application
    And User should view welcome icon
