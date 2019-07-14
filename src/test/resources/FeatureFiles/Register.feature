Feature: Registration functionality scenarios
	@Register @One
	Scenario: Verify whether the user is able to register into the application by providing all the details
		Given I launch the application 
		And I navigate to account register page
		When I provide all the below valid details
     		|FirstName |Pinki                    |
     		|LastName  |PM                       |
    		|Email     |pinkyrajagopal@gmail.com |
     		|Telephone |1234567890               |
     		|Password  |July2019@                |
		And I select on the privacy policy
		And I click on Continue button
		Then I should see the user account is successfully created