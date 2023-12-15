package pageObjects.nopCommerce.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManage;
import pageUIs.nopCommerce.admin.AdminLoginPageUI;

public class AdminLoginPageObject extends BasePage {
	private WebDriver driver;

	public AdminLoginPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public AdminDashboardPageObject clickToLoginButton() {
		waitForElementClickable(AdminLoginPageUI.LOGIN_BUTTON);
		clickToElement(AdminLoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManage.getAdminAdminDashboardPage(driver);
	}

	public void inPutToEmailTextbox(String emailAddress) {
		waitForElementVisible(AdminLoginPageUI.EMAIL_TEXTBOX);
		senkeyToElement(AdminLoginPageUI.EMAIL_TEXTBOX, emailAddress);
	}

	public void inPutToPasswordTextbox(String password) {
		waitForElementVisible(AdminLoginPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(AdminLoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public AdminDashboardPageObject loginAsAdmin(String emailAddress, String password) {
		inPutToEmailTextbox(emailAddress);
		inPutToPasswordTextbox(password);
		clickToLoginButton();
		return PageGeneratorManage.getAdminAdminDashboardPage(driver);
	}

}
