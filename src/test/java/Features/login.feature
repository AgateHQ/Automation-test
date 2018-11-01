Feature: Successfull login through Popbitch First use

 
Scenario: Testcase 147 Login from Premium article in popbitch
Given I am a registered user , I open the browser
And I navigate to popbitch.com 
When I click on the Stories Menu
And I click on the Premium Story
And I Click on Login to Agate from the Pop Bitch First use notice
Then I verify that the Login Button Navigates me to the login page



Scenario: Testcase 147 Successfull login from First use notice with Correct email and correct password
And I Login with correct Details
Then I verify that I am navigated to the full article 


