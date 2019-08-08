@EventsSmoke
  Feature: Brite Events Funstionality

      @rabia
     Scenario: User should be able to see default values on the search box
       Given User is on the events page
       When User sees search box
       And User sees Upcoming button
       And User sees plus icon

    @rabia
    Scenario: User should be able to display and hide the filters(Advanced Searched)
      Given User is on the events page
      When User hover overs to plus icon
      And User clicks on the plus icon
      Then User clicks on the minus icon

    @rabia
      Scenario: User should be able to display Advanced Searched dropdowns
        Given User is on the events page
        When User clicks on plus icon
        Then User sees three drop downs
