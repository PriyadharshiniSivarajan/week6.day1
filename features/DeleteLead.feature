Feature: To delete the lead id 

Background: 
	Given Load leaftaps link 'http://leaftaps.com/opentaps/' 
	
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
	Given Give the phone number '99'
	When Click on findLeads button

	Then Get the first leadId
	When Click the first leadid
	Then View Lead should be displayed
	When Click on delete button
	Then My Lead should be displayed
	When Click on findLeads Link1
	Then FindLead page is displayed
	Given Give input id
	When Click on find button
	Then Get the records
	
	
	
	