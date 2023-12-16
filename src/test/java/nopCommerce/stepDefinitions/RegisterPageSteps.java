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
	TestContext testContext;

	public RegisterPageSteps(TestContext testContext) {
		driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		userRegisterPage = PageGeneratorManage.getUserRegisterPage(driver);
		testContext.getDataContext().setContext(Context.EMAIL, DataHelper.getDataHelper().getEmailAddress()) ;
		testContext.getDataContext().setContext(Context.PASSWORD, "123456") ;
		System.out.println((String)testContext.getDataContext().getContext(Context.EMAIL));
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
		userRegisterPage.inPutToEmailTextbox((String)testContext.getDataContext().getContext(Context.EMAIL));
	}

	@When("^Input to Password textbox$")
	public void inputToPasswordTextbox() {
		userRegisterPage.inPutToPasswordTextbox((String)testContext.getDataContext().getContext(Context.PASSWORD));
	}

	@When("^Input to ConfirmPassword textbox$")
	public void inputToConfirmPasswordTextbox() {
		userRegisterPage.inPutToConfirmPasswordTextbox((String)testContext.getDataContext().getContext(Context.PASSWORD));
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
