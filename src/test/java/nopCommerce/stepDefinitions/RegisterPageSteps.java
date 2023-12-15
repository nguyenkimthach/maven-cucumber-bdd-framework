package nopCommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import utilities.DataHelper;

public class RegisterPageSteps {
	WebDriver driver;
	UserRegisterPageObject userRegisterPage;
	static String emailAddress, password;

	public RegisterPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		userRegisterPage = PageGeneratorManage.getUserRegisterPage(driver);
		emailAddress = DataHelper.getDataHelper().getEmailAddress() ;
		System.out.println(emailAddress);
		password = "123456";
	}
	
	@When("^Input to first name textbox$")
	public void inputToFirstNameTextbox() {
		userRegisterPage.inPutToFirstnameTextbox("Automation");
	}
	
	@When("^Input to last name textbox$")
	public void inputToLastNameTextbox() {
	    userRegisterPage.inPutToLastnameTextbox("Fc");
	}

	@When("^Input to Email textbox$")
	public void inputToEmailTextbox() {
		userRegisterPage.inPutToEmailTextbox(emailAddress);
	}

	@When("^Input to Password textbox$")
	public void inputToPasswordTextbox() {
		userRegisterPage.inPutToPasswordTextbox(password);
	}

	@When("^Input to ConfirmPassword textbox$")
	public void inputToConfirmPasswordTextbox() {
		userRegisterPage.inPutToConfirmPasswordTextbox(password);
	}

	@When("^Click to Regiter button$")
	public void clickToRegiterButton() {
		userRegisterPage.clickToRegisterButton();
	}

	@Then("^Verify register success message is diplayed$")
	public void verifyRegisterSuccessMessage() {
		Assert.assertEquals(userRegisterPage.getRegisterSuccessMessage(), "Your registration completed");
	}

	@When("^Click to Continue button$")
	public void clickToContinueButton() {
		userRegisterPage.clickToContinueButton();
	}
}
