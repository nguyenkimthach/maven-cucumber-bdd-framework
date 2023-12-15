@Register_Login_Customer
Feature: Register and Login

@register_login
  Scenario: Register to system and login	
    Given Open register page
    When Input to first name textbox
    And Input to last name textbox
    And Input to Email textbox
    And Input to Password textbox
    And Input to ConfirmPassword textbox
    And Click to Regiter button
    Then Verify register success message is diplayed
    When Click to Continue button
   	And Open to login Page
    And Submit valid infor to login form
    And Click to Login button
		Then Home page is displayed

@Update_Customer
  Scenario Outline: Update Customer info
  #link
  Given Open "My account" page
  
  #Radio
  When Click to "Male" radio button
  
  #Textbox
  And Input to "FirstName" textbox with value "<FirstName>"
  And Input to "LastName" textbox with value "<LastName>"
  
  #Dropdown
  And Select "DateOfBirthDay" dropdown with value "<Day>"
  And Select "DateOfBirthMonth" dropdown with value "<Month>"
  And Select "DateOfBirthYear" dropdown with value "<Year>"
  
  #Textbox
  And Input to "Company" textbox  with value "<CompanyName>"
  And Input to "Email" textbox  with value "<Email>"
  
  #Button
  And Click to "Save" button
  
  #Message
  Then Updated message is displayed with value "The customer info has been updated successfully."
  
  #Textbox
  And The valid text is displayed at "FirstName" with value "<FirstName>"	
  And The valid text is displayed at "LastName" with value "<LastName>"
  
  #Dropdown	
  And The valid text dropdown is displayed at "DateOfBirthDay" with value "<Day>"	
  And The valid text dropdown is displayed at "DateOfBirthMonth" with value "<Month>"	
  And The valid text dropdown is displayed at "DateOfBirthYear" with value "<Year>"	
  
  #Textbox
  And The valid text is displayed at "Email" with value "<Email>"	
  And The valid text is displayed at "Company" with value "<CompanyName>"	
  	
  Examples:
  |FirstName	|LastName	|Day|Month|Year|Email|CompanyName|
  |John				|Witch		|10	|May	|1998|email|ComFan.Colt|
  
  
 @Regex
  Scenario: Regex
	When I input first Account ID 
	And I input second Account ID 
	And I input third Account ID 
	And I transfer to "<Amount>" USD 
	And I withdraw to "<Amount>" USD

	
	