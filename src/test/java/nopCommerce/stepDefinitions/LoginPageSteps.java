package nopCommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManage;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.UserLoginPageObject;

public class LoginPageSteps {
	WebDriver driver;
	UserLoginPageObject userLoginPage;

	public LoginPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		userLoginPage = PageGeneratorManage.getUserLoginPage(driver);
	}

	@When("^Submit valid infor to login form$")
	public void submitValidInforToLoginForm() {
		userLoginPage.inPutToEmailTextbox(RegisterPageSteps.emailAddress);
		userLoginPage.inPutToPasswordTextbox(RegisterPageSteps.password);
	}

	@When("^Click to Login button$")
	public void clickToLoginButton() {
		userLoginPage.clickToLoginButton();
	}
}
