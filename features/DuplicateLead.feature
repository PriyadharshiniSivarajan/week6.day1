Feature: Create Duplicate Lead 

Background: 
	Given Get leafTaps 'http://leaftaps.com/opentaps/' 
	
Scenario: 

	And Give the username 'demosalesmanager'
	And Give the password 'crmsfa'
	When Click on the login button
	Then LeafTaps page is displayed
	When Click on CRMSFA link
	Then Homepage page  is displayed
	When Click on Lead link
	Then Lead page  is displayed
	When Click on findLeads link
	Then FindLead page is displayed
	When Click on phone link
	Then Give the phone number '99'
	When Click on findleadbutton link
	Then FindLead page is displayed
	When Click on firstLead link
	Then ViewLead is displayed
	When Click on duplicateLeadButton link
	Then DuplicateLead id displayed
	When Click on submitButton link
	Then ViewLead page is displayed
	