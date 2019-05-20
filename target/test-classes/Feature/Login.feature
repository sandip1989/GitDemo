Feature: Application Login 

Scenario: Home page default login
Given user is on netbanking landing page
When User login into application with Username & Password
Then Home page is populated
And Cards are displayed
