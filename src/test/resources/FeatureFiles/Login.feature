Feature: Login functionality scenarios

    @Login @One
	Scenario: Verify if user is able to loging with valid credentials
		Given I launch the application 
		And I navigate to account login page
		When I login to the application using username "pinkyrajagopal@gmail.com" and password "July2019@"
		Then I should be logged into my account successfully
		
	@Login @Two       
	Scenario: Verify whether the user is not able to login with invalid credentials
		Given I launch the application 
		And I navigate to account login page
		When I login to the application using username "pinkyrajagopa@gmail.com" and password "July2019"
		Then I should not be logged into my account and an error message should be displayed
	
	@Login @Three	
	Scenario: Verify whether the user is not able to login with no credentials
		Given I launch the application 
		And I navigate to account login page
		When I login to the application using username "" and password ""
		Then I should not be logged into my account and an error message should be displayed
		
	@Login @Four	
	Scenario: Verify whether the user is able to reset the forgotten password
		Given I launch the application 
		And I navigate to account login page
		When I reset the forgotten password for "pinkyrajagopal@gmail.com" email
        Then I should get an confirmation message of link being sent to the email address
		
		