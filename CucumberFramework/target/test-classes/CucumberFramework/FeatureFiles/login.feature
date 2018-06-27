Feature: Login into account
	Existing globalpoem user should not be able to login into account using incorrect credentials

Scenario: Login into account with correct details
	Given User navigates to globalpoem websites
	And User clicks on the Content Management button on homepage
	And User enters an invalid username
	And User enters an invalid password
	When User clicks on the login button
	Then User should be taken to the unsuccessful login page
		