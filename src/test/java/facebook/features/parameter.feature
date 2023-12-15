@parameter
Feature: Facebook login page

#Background:
	#Given Open nopcommerce application

	@no_parm
  Scenario: Screnario have no parameter
    When Input to Username textbox 
    And Input to Password textbox 
    And Click to Submit button 
    
	@param_mark
  Scenario: Screnario have parameter
    When Input to Username textbox with "automation@gmail.com"
    And Input to Password textbox with "123456"
    And Click to Submit button 
    
	@multiple_param
  Scenario: Screnario have parameter
    When Input to Username textbox with "automation@gmail.com" and Password textbox with "123456"
    And Click to Submit button 
 
 