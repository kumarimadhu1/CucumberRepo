Feature: Application Login

@SmokeTest
Scenario: Search for items and validate results
Given User is on Greencart landing page
When User search for Cucumber vegetable
Then "Cucumber" results are displayed

@SeleniumTest
Scenario Outline: Search for items and then move to checkout page
Given User is on Greencart landing page
When User search for <name> vegetable
And Added item to cart
And User proceed to checkout page
Then Verify selected <name> item is displayed on checkout page

Examples:

|name    |
|Brinjal |
|Beetroot|
