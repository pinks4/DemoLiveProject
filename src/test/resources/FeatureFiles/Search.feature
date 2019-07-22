Feature: Search functionality scenarios
	
	@Search @One
	Scenario: Verify whether user is able to search a product directly by product name
	Given I launch the application
	When I search for a product "Samsung SyncMaster 941BW"
	Then I should see the product in the search results
	
	@Search @Two
	Scenario: Verify whether user is being informed when the product being searched is not available
	Given I launch the application
	When I search for a product "Apple iPhone"
	Then I should see the message "Your shopping cart is empty!" on the search results page
	