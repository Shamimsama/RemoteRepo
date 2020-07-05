Feature: Facebook Test

Background:
Given open browser
|chrome|
|firefox|
|safari|
And nevigate to URl
@smoke
Scenario: valid credential

When user type userId and password
And user click on login button
Then user should see his profile page
And close the browser

@reg
Scenario Outline: invalid credential

When user type <userId> and <password>
And user click on login button
Then user should not see his profile page
And close the browser

Examples: 
|userId|password|
|"user1"|"1234"|
|"user2"|"1235"|


