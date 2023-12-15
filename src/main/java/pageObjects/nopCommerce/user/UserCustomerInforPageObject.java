package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.CustomerInforPageUI;

public class UserCustomerInforPageObject extends BasePage {
	private WebDriver driver;

	public UserCustomerInforPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public boolean isCustomerInforPageDisplayed() {
		waitForElementVisible(CustomerInforPageUI.CUSSTOMER_INFOR_HEADER);
		return isElementDisPlayed(CustomerInforPageUI.CUSSTOMER_INFOR_HEADER);
	}

}
