@Aigerim
  Feature:Events Home Page verification
    @EventsSmoke
    Scenario: User should be able to see the Events Home Page
      Given User is on the events page
      And User sees Brite logo
      And User sees footer
      When User clicks next button of Events
      Then User is able to see next page of upcoming events

    @EventsSmoke
      Scenario: User should be able to see Calendar
        Given User is on the events page
        And User clicks calendar button
        Then User is able to see calendar

    @EventsSmoke
        Scenario: User should be able to see the Events breakdown
          Given User is on the events page
          And User clicks pivot button
          And User is able to see breakdown of events
          Then User clicks Kanban button
          And User is again on the home page




