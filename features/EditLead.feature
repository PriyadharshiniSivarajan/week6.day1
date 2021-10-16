Feature: To excecute edit lead
Background: 
Given Load the leaftaps url
Scenario: Test single scenario



And Enter the username 'demosalesmanager'
And Enter the password 'crmsfa'
When click on login button
Then Go to homepage page
When click on CRMSFA 
Then Go to LeadsPage page
When click on leads
Then Go to leadsmain page
When click on findleads
Then Go to findleads page
When click on phno
Given enter the phno '99'
When click on findleads 
When click on firstLeadid
Then Go to editlead page
When click on editbutton
Then Go to editleadId page
Given Add value to cmpname 'TCS'
When click on submitbutton
Then changed leadpage displayed


Scenario Outline: Test multiple inputs

And Enter the username <username>
And Enter the password <pswd>
When click on login button
Then Go to homepage page
When click on CRMSFA 
Then Go to LeadsPage page
When click on leads
Then Go to leadsmain page
When click on findleads
Then Go to findleads page
When click on phno
Given enter the phno <phno>
When click on findleads 
When click on firstLeadid
Then Go to editlead page
When click on editbutton
Then Go to editleadId page
Given Add value to cmpname <cmpname>
When click on submitbutton
Then changed leadpage displayed
Examples:
|username|pswd|phno|cmpname|
|'demosalesmanager'|'crmsfa'|'99'|'TCS'|
|'demosalesmanager'|'crmsfa'|'988'|'IBM'|