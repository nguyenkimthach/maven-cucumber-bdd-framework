package nopCommerce.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import commons.PageGeneratorManage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageObjects.nopCommerce.user.commonPageObject;
import utilities.DataHelper;

public class CommonPageSteps {
	private WebDriver driver;
	commonPageObject commonPage; 
	DataHelper dataFaker;
	String email;

	public CommonPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		commonPage = PageGeneratorManage.getCommonPage(driver);
		dataFaker = DataHelper.getDataHelper();
		email = dataFaker.getEmailAddress();
		System.out.println("change to email: "+ email);
	}
	
	@Given("^Open \"([^\"]*)\" page$")
	public void openPage(String pageName) {
	    commonPage.clickToLinkByText(pageName);
	}

	@When("^Click to \"([^\"]*)\" radio button$")
	public void clickToRadioButton(String radioButtonValue) {
	    commonPage.clickToRadioButtonByLabel(radioButtonValue);
	}

	@When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputToTextboxWithValue(String fieldID, String inputValue) {
	    commonPage.inPutToTextboxByID(fieldID, inputValue);
	}

	@When("^Input to \"([^\"]*)\" textbox  with value \"([^\"]*)\"$")
	public void inputToTextboxWithValue2(String fieldID, String inputValue) {
		if(fieldID.equals("Email")) {
			inputValue = email;
		}
		 commonPage.inPutToTextboxByID(fieldID, inputValue);
	}
	
	@When("^Select \"([^\"]*)\" dropdown with value \"([^\"]*)\"$")
	public void selectDropdownWithValue(String attributeName, String value) {
		commonPage.selectToDropdownByName(attributeName, value);
	}

	@When("^Click to \"([^\"]*)\" button$")
	public void clickToButton(String buttonText) {
		commonPage.clickTobuttonByText(buttonText);
	}

	@Then("^Updated message is displayed with value \"([^\"]*)\"$")
	public void updatedMessageIsDisplayedWithValue(String textMessage) {
		Assert.assertTrue(commonPage.isDynamicMessageDisplayed(textMessage));
	}

	@Then("^The valid text is displayed at \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void theValidTextIsDisplayedAtWithValue(String fieldID, String expectedValue) {
		if(fieldID.equals("Email")) {
			expectedValue = email;
		}
		Assert.assertEquals(commonPage.getTextboxValueByID(fieldID),expectedValue);
	}
	
	@Then("^The valid text dropdown is displayed at \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void theValidTextDropdownIsDisplayedAtWithValue(String attributeName, String value) {
		Assert.assertTrue(commonPage.isItemDropdownByNameDisplayed(attributeName, value));
	}

}
