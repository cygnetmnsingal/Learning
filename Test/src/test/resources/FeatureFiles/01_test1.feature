Feature: Maven Cucumber 
	@t2
	Scenario: open page to test maven tutorial
	Given user is on page
	Then Get the title
	
	@t1
	Scenario: open page to test maven tutorial
	Given user is on page
	Then Get the title and verify it
	
	@test
	Scenario: Login Hr Portal
	Given user is on page of Hr Portal
	And login 