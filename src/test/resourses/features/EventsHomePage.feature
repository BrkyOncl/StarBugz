@Aigerim
  Feature:Events Home Page verification
    @EventsSmoke
    Scenario: User should be able to see the Events Home Page
      Given User is on the events page
      And User sees Brite logo
      And User sees footer
      When User clicks next button of Events
      Then User is able to see next page of upcoming events

