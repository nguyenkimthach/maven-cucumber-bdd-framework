@login
Feature: Facebook login page

	@no_parm
  Scenario: Screnario have no parameter
    Given Open nopcommerce application
    When Input to Username textbox 
    And Input to Password textbox 
    And Click to Submit button 
    # Then Verify... 
    And Close application
    
	@param_mark
  Scenario: Screnario have parameter
    Given Open nopcommerce application
    When Input to Username textbox with "automation@gmail.com"
    And Input to Password textbox with "123456"
    And Click to Submit button 
    # Then Verify... 
    And Close application
    
	@multiple_param
  Scenario: Screnario have parameter
    Given Open nopcommerce application
    When Input to Username textbox with "automation@gmail.com" and Password textbox with "123456"
    And Click to Submit button 
    # Then Verify... 
    And Close application
    
  @datatable_step
	Scenario Outline: create new Customer with email <Username>
		Given Open nopcommerce application
		When Input to Username and Password
		|Username| Password |
		|<Username>|<Password>| 
		Then Verify submitted infor displayed
		|Username| Addresss |
		|<Username>|<Addresss>| 
		And Click to Submit button
		And Close application

Examples:
Username Password| City |Addresss |Phone |
automationtest@gmail.com|123456|Ha Noi |Le Loi |0987888999|
