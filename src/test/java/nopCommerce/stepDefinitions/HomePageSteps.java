package nopCommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.UserHomePageObject;

public class HomePageSteps {
	WebDriver driver;
	UserHomePageObject userHomePage;
	
	public HomePageSteps(){
		driver = Hooks.openAndQuitBrowser();
		userHomePage = PageGeneratorManage.getUserHomePage(driver);
	}
	
	@Given("^Open register page$")
	public void openRegisterPage() {
	   userHomePage.clickToRegisterLink();
	}
	
	@When("^Open to login Page$")
	public void openToLoginPage() {
		  userHomePage.openLoginPage();
	}
	
	@Then("^Home page is displayed$")
	public void homePageIsDisplayed() {
	    Assert.assertTrue("home page is not displayed",userHomePage.isMyAccountLinkDisplayed());
	}
}
