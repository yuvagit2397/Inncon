Feature: updating issues in jira
Scenario: updating added item shown issue
Given add the jira to create APi
When user should call jira create api 
And update the issue 
Then user validating the status code