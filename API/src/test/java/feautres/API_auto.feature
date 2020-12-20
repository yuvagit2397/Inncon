Feature: JIRA API validation
Scenario: verifying JIRA create issue
    Given Add the JIRA to create API payload
    When user should call the JIRA create issue API with post request
    Then user should verify responsecode should be 201
    And user should verify responsebody self should contain "senthilautomation"
    
Scenario: verifying JIRA get issues
	Given Add the JIRA to create API payload
	When user should call the JIRA get issue API with get request
	Then user should verify getresponsecode should be 200
	And user should verify responsebody total should be 12