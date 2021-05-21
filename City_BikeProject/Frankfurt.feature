Feature: Verify City Bike API and Frankfurt is in Germany 
    
Scenario: Verify that the city Frankfurt is in Germany and that we can return the city's corresponding latitude and longitude
    Given that user is already on the googlemap website
    When user search for Frankfurt in Germany
    And user click search icon
    Then user can confirm the location is in Germany
    Then user should be able to request for the latitude and longitude of Frankfurt
    Then user tear down the project 
 
