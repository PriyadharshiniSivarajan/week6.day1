Feature: Creating a lead id 
Background: 
	Given Load the createLead 'http://leaftaps.com/opentaps/control/main' 
	
Scenario: To test positive credential 
	And Give the username 'demosalesmanager' 
	And Give the password 'crmsfa' 
	When Click on the login button 
	Then Homepage page is displayed 
	When Click on CRMSFA link 
	Then Leads page  is displayed 
	When Click on createlead link 
	Then Createlead page is displayed 
	Given Give the company 'testleaf' 
	And Give the first name 'priya' 
	And Give the last name 'S' 
	And Give the phone no '99' 
	When Click on the submit button 
	Then Leadcreated page is displayed 
	
Scenario Outline: To give multiple outputs 
	And Give the username <uname> 
	And Give the password <pswd> 
	When Click on the login button 
	Then Homepage page is displayed 
	When Click on CRMSFA link 
	Then Leads page  is displayed 
	When Click on createlead link 
	Then Createlead page is displayed 
	Given Give the company <cmpname> 
	And Give the first name <fname> 
	And Give the last name <lname> 
	And Give the phone no <phno> 
	When Click on the submit button 
	Then Leadcreated page is displayed 
	
	Examples: 
		|uname|pswd|cmpname|fname|lname|phno|
		|'demosalesmanager'|'crmsfa'|'TestLeaf'|'Hari'|'R'|'99'|
		|'demosalesmanager'|'crmsfa'|'TestLeaf'|'Sheriba'|'T'|'99'|