Feature: Valet Parking
  I Want To Know cost valet Parking

Scenario: Calculate valet parking cost for half an hour
     When I Park my car the valet parking lot for 30 minutes
     Then I Will have to pay $12s