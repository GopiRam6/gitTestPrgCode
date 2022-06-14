Feature:	To validate login functionality of facebook
Background:
Given The user should launch the chrome browser
When The user should type the url
And The user should maxmize the window

Scenario:	validate with invalid username and invalid password
And The user should type the invalid username and invalid passwords
			#1D List --->Without Header
			|gopi|gopi@123|kavi|kavi@123|
And The user should click the login button
And The user should get the title of the incredential page
Then The user should navigate to incorrect credential page

 

Scenario Outline: validate with invalid username and valid password
And The user should type the invalid username"<user>" and valid password "<pass>"
And The user should click the login button
And The user should get the current url of the incredential page
Then The user should navigate to incorrect credential page 

Examples:
|user|pass|
|ram|ram@123|
|siva|siva@123|
|sar|sar@123|