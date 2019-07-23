Feature: End to end scenarios related to placing orders
	@Orders @One
	Scenario: Verify whether the user is able to place orders successfully
	Given I login to the application
	When I add a product to the cart and checkout
	And I place an order
	Then I should see that the order is successfully placed
	