package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManage;
import pageUIs.nopCommerce.user.UserRegisterPageUI;

public class UserRegisterPageObject extends BasePage {
	WebDriver driver;

	public UserRegisterPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void clickToRegisterButton() {
		waitForElementClickable(UserRegisterPageUI.REGISTER_BUTTON);
		clickToElement(UserRegisterPageUI.REGISTER_BUTTON);
	}

	public String getErrorMessageAtFirstnameTextbox() {
		waitForElementVisible(UserRegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtLastnameTextbox() {
		waitForElementVisible(UserRegisterPageUI.LAST_NAME_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.LAST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtEmailTextbox() {
		waitForElementVisible(UserRegisterPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getErrorMessageAtPasswordTextbox() {
		waitForElementVisible(UserRegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.PASSWORD_ERROR_MESSAGE);
	}

	public String getErrorMessageAtConfirmPasswordTextbox() {
		waitForElementVisible(UserRegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
	}

	public void inPutToFirstnameTextbox(String firstname) {
		waitForElementVisible(UserRegisterPageUI.FIRST_NAME_TEXTBOX);
		senkeyToElement(UserRegisterPageUI.FIRST_NAME_TEXTBOX, firstname);
	}

	public void inPutToLastnameTextbox(String lastname) {
		waitForElementVisible(UserRegisterPageUI.LAST_NAME_TEXTBOX);
		senkeyToElement(UserRegisterPageUI.LAST_NAME_TEXTBOX, lastname);
	}

	public void inPutToEmailTextbox(String emailAddress) {
		waitForElementVisible(UserRegisterPageUI.EMAIL_NAME_TEXTBOX);
		senkeyToElement(UserRegisterPageUI.EMAIL_NAME_TEXTBOX, emailAddress);
	}

	public void inPutToPasswordTextbox(String password) {
		waitForElementVisible(UserRegisterPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(UserRegisterPageUI.PASSWORD_TEXTBOX, password);
	}

	public void inPutToConfirmPasswordTextbox(String confirmPassword) {
		waitForElementVisible(UserRegisterPageUI.CONFIRM_PASSWORD);
		senkeyToElement(UserRegisterPageUI.CONFIRM_PASSWORD, confirmPassword);
	}

	public String getRegisterSuccessMessage() {
		waitForElementVisible(UserRegisterPageUI.REGISTER_SUCCESS_MESSAGE);
		return getElementText(UserRegisterPageUI.REGISTER_SUCCESS_MESSAGE);
	}

	public UserHomePageObject clickToContinueButton() {
		waitForElementClickable(UserRegisterPageUI.CONTINUE_BUTTON);
		clickToElement(UserRegisterPageUI.CONTINUE_BUTTON);
		return PageGeneratorManage.getUserHomePage(driver);
	}

	public String getErrorExistingEmailMessage() {
		waitForElementVisible(UserRegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
		return getElementText(UserRegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
	}

}
