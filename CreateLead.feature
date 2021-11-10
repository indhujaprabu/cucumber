Feature: Test leafTaps Login functionality
Scenario: Test with positive credential
Given Enter the username as 'Demosalesmanager'
And Enter Password as 'crmsfa'
When click on login button
Then Title should be matching with 'Leaftaps-Testleaf Automation platform'
When click on 'CRMSFA'