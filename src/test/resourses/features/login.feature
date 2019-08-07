Feature: Login to Brite

  @Brite
  Scenario: User is logging in to the website
    Given User is on Brite webpage
    When User types credentials
    And User clicks login button
    Then User is logged in to website