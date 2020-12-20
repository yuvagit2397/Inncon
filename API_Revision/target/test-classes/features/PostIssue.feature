Feature: API validation using JIRA

Scenario: verifying the post issue
Given add the JIRA to creat payload
When user should call the JIRA create issue using post request
Then user should verify the statuscode 201
And user should verify key contains "FAC"