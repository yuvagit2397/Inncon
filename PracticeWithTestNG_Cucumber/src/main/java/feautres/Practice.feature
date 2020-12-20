Feature: Automating BCCI Website

@matches
Scenario: validating International module
Given user is on the BCCI page 
When user select International module
And user selects fixtures
Then user verifying teams venue and all

@players
Scenario: verifying the players with Grade Wise
Given user selecting players module and select Men
When user get the players name
Then user verify the players with Grade