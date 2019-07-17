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
		
		@Register @Two
		Scenario: Verify whether the user is not allowed to register on skipping the mandatory fields
			Given I launch the application
			And I navigate to account register page
			When I click on Continue button
			Then I should see that the user account is not created
			And I should see an error message informing the user to enter the mandatory fields

		@Register @Three
       Scenario: Verify whether the user is able to register into the application by subscribing to the newsletter
       
        Given I launch the application 
		And I navigate to account register page
		When I provide all the below valid details
     		|FirstName |Pinki                    |
     		|LastName  |PM                       |
    		|Email     |pinkyrajagopal1@gmail.com |
     		|Telephone |1234567890               |
     		|Password  |July2019@                |
		And I select on the privacy policy
        And I subscribe to the newsletter 
		And I click on Continue button
		Then I should see the user account is successfully created
		
		@Register @Four
		Scenario: Verify whether the user is restricted from creating a duplicate account
		
		Given I launch the application 
		And I navigate to account register page
		When I provide all the below duplicate  details
     		|FirstName |Pinki                    |
     		|LastName  |PM                       |
    		|Email     |pinkyrajagopal1@gmail.com |
     		|Telephone |1234567890               |
     		|Password  |July2019@                |
		And I select on the privacy policy 
		And I click on Continue button
       Then I should see the user is restricted from creating a duplicate account
			