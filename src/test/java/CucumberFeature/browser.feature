Feature: Login And Registration Page
In order to perfome login And Registration

Background: Launch browser and open link 
	Given We need to launch browser 
	When Browser details and link  
	Then open home page 


 Scenario: SignUp Page 

	Given User navigate to SignUp page 
	When SignUp details   
	Then user successfully Register 
	
 Scenario Outline: Verify Login details 

	Given User navigate to login page 
	When Click on Login button 
	And enter "<username>" and "<password>" 
	Then user should be succesfully Login"<accountname>"
	
Examples:

|   username 	        | password |accountname|
|nirajsinha310@gmail.com|nirajsinha|niraj sinha|
|nirajsinha12@gmail.com|nirajsinha|niraj|
|nirajsinha123@gmail.com|nirajsinha|Niraj|
