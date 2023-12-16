package nopCommerce.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManage;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.UserLoginPageObject;

public class LoginPageSteps {
	WebDriver driver;
	UserLoginPageObject userLoginPage;
	TestContext testContext;

	public LoginPageSteps(TestContext testContext) {
		driver = Hooks.openAndQuitBrowser();
		this.testContext = testContext;
		userLoginPage = PageGeneratorManage.getUserLoginPage(driver);
	}

	@When("^Submit valid infor to login form$")
	public void submitValidInforToLoginForm() {
		userLoginPage.inPutToEmailTextbox((String)testContext.getDataContext().getContext(Context.EMAIL));
		userLoginPage.inPutToPasswordTextbox((String)testContext.getDataContext().getContext(Context.PASSWORD));
	}

	@When("^Click to Login button$")
	public void clickToLoginButton() {
		userLoginPage.clickToLoginButton();
	}
}
