Feature: LeafTaps login functionality
Scenario Outline: Test with positive credentials

Given Open the chrome browser
And Load chrome browser <url>
And Enter user name as <username>
And enter password as <password>
When click the login button
Then Homepage should be displayed


Examples:
|url|username|password|
|'demosalesmanager'|'crmsfa'|
|'demo'|'crmsfa'|
|'demosaml'|'crmsfa'|


Scenario: Test with negative credentials

Given Open the chrome browser
And Load chrome browser 'http://leaftaps.com/opentaps/control/main'
And Enter user name as 'demosale'
And enter password as 'crmsfa'
When click the login button
But Error should be displayed

