package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManage;
import pageUIs.nopCommerce.user.UserLoginPageUI;

public class UserLoginPageObject extends BasePage {
	private WebDriver driver;

	public UserLoginPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public UserHomePageObject clickToLoginButton() {
		waitForElementClickable(UserLoginPageUI.LOGIN_BUTTON);
		clickToElement(UserLoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManage.getUserHomePage(driver);
	}

	public void inPutToEmailTextbox(String emailAddress) {
		waitForElementVisible(UserLoginPageUI.EMAIL_TEXTBOX);
		senkeyToElement(UserLoginPageUI.EMAIL_TEXTBOX, emailAddress);
	}

	public void inPutToPasswordTextbox(String password) {
		waitForElementVisible(UserLoginPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(UserLoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public String getErrorMessageAtEmailTextbox() {
		waitForElementVisible(UserLoginPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(UserLoginPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getErrorMessageUnsuccessful() {
		waitForElementVisible(UserLoginPageUI.UNSUCCESSFUL_ERROR_MESSAGE);
		return getElementText(UserLoginPageUI.UNSUCCESSFUL_ERROR_MESSAGE);
	}

	public UserHomePageObject loginAsUser(String emailAddress, String password) {
		inPutToEmailTextbox(emailAddress);
		inPutToPasswordTextbox(password);
		clickToLoginButton();
		return PageGeneratorManage.getUserHomePage(driver);
	}

}
