Feature: Test leafTaps Login functionality
Background:
Given open the chrome browser
And load the application url 'http://leaftaps.com/opentaps'

# this is the first senario
Scenario Outline: Test with positive credential
Given Enter the username as <username>
And Enter Password as <password>
When click on login button
Then Homepage should be used
Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: Test with negative credential

Given Enter the username as 'Demosalesmanager'
And Enter Password as 'crmsfa'
When click on login button
But Error message is displayed