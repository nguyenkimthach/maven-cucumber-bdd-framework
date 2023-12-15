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
