@dataTable
Feature: Facebook login page
	@datatable_step
	Scenario Outline: create new Customer with email <Username>
		Given Open nopcommerce application
		When Input to Username and Password
			|Username		| Password |
			| automationtest01@gmail.com | 123456		| 
			| automationtest02@gmail.com | 123456		| 
			| automationtest03@gmail.com | 123456		| 
			#|<Username>	|<Password>| 
		And Click to Submit button 
		And Close application
	
	Examples:
	|Username 								|Password	|
	|automationtest@gmail.com	|123456		|


	@datatable_scenario
	Scenario Outline: Data Table in Scenario
	Given Open nopcommerce application
	When Input to Username textbox with "<Username>"
	And Input to Password textbox with "<Password>"
	And Click to Submit button 
	And Close application
	
	Examples:
	| Username								 | Password |
	| automationtest@gmail.com | 123456		| 	
	| automationtest@gmail.com | 123456		| 
	| automationtest@gmail.com | 123456		| 
	| automationtest@gmail.com | 123456		| 
 