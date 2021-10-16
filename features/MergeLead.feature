Feature: To merage two leads 
Background: 
	Given Get the leaptaps 'http://leaftaps.com/opentaps/' 
	
Scenario: 

	Given Get the username1 'DemoSalesManager'
	And  Get the password1 'crmsfa'
	When Click on login link
	Then CRMSFA should be displayed
	When Click on CRMSFA1 link
	Then HomePage should be displayed
	When Click on leads link 
	Then My Leads should be displayed
	When Click on MergeLeads link
	Then MergeLeadspage should be displayed
	When Click on fromLeadWidget link
	Then Switch to windowhandle1
	Then FindLeads should be displayed
	Given Get name in firstName 'jenni'
	When Click on findLeads
	Then get the value of leadid1
	When Click on firstLeadId
	Then Switch to windowhandle0
	Then MergeLeadspage should be displayed
	When Click on ToLeadWidget
	
	When Get windowHandles
	Then Switch to windowHandle2
	Then FindLeads should be displayed
	Given Type the firstName 'sheriba'
	When Click on findLeads
	Given Click on firstLead1
	When Switch to windowHandle3
	Then MergeLeadspage should be displayed
	When Click on mergeLeadbutton link
	Then Accept the alert
	Then ViewLead Should be displayed
	When Click on findLeads Link
	Then FindLeads should be displayed
	Given Enter the leadid
	When Click on findLeads
	Then FindLeads should be displayed
	When Get the value of records
	Then Verify the text matches
	
	
	
	
	
  