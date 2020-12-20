Feature: working with GET issues 
Scenario: get all the fields in GET request
Given add the JIRA to create API payload
When user should call the GET issue with GET request
Then user should verify response code 200
And user should get body verify the issue type