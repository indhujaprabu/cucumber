Feature: Test leafTaps Login functionality
# this is the first senario
Scenario: Test with positive credential
Given open the chrome browser
And load the application url 
And Enter the username as Demosalesmanager
And Enter Password as crmsfa
When click on login button
Then Homepage should be used