package pageObjects.nopCommerce.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.nopCommerce.user.BasePageNopCommerceUI;

public class commonPageObject extends BasePage {
	private WebDriver driver;

	public commonPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
		public void openPageAtMyAccountByPageName(String pageName) {
			waitForElementClickable(BasePageNopCommerceUI.DYNAMIC_PAGE_AT_MY_ACCOUNT_AREA, pageName);
			clickToElement(BasePageNopCommerceUI.DYNAMIC_PAGE_AT_MY_ACCOUNT_AREA, pageName);
		}

		/**
		 * Enter to dynamic textbox by id
		 * 
		 * @author ThachNK
		 * @param textBoxID
		 * @param value
		 */
		public void inPutToTextboxByID(String textBoxID, String value) {
			waitForElementVisible(BasePageNopCommerceUI.DYNAMIC_TEXTBOX_BY_ID, textBoxID);
			senkeyToElement(BasePageNopCommerceUI.DYNAMIC_TEXTBOX_BY_ID, value, textBoxID);
		}
		
		/**
		 * Click to dynamic button by text
		 * 
		 * @author ThachNk
		 * @param buttonText
		 */
		public void clickTobuttonByText(String buttonText) {
			waitForElementClickable(BasePageNopCommerceUI.DYNAMIC_BUTTON_BY_TEXT, buttonText);
			clickToElement(BasePageNopCommerceUI.DYNAMIC_BUTTON_BY_TEXT, buttonText);
		}

		/**
		 * Click to dynamic link by text
		 * 
		 * @author ThachNk
		 * @param linkText
		 */
		public void clickToLinkByText(String linkText) {
			waitForElementClickable(BasePageNopCommerceUI.DYNAMIC_LINK_BY_TEXT, linkText);
			clickToElement(BasePageNopCommerceUI.DYNAMIC_LINK_BY_TEXT, linkText);
		}
		
		/**
		 * Select item in dropdown by name atribute
		 * 
		 * @author ThachNk
		 * @param dropdownAtributeName
		 * @param itemValue
		 */
		public void selectToDropdownByName(String dropdownAtributeName, String itemValue) {
			waitForElementClickable(BasePageNopCommerceUI.DYNAMIC_DROPDOWN_BY_NAME, dropdownAtributeName);
			selectItemInDefaultDropDown(BasePageNopCommerceUI.DYNAMIC_DROPDOWN_BY_NAME, itemValue, dropdownAtributeName);
		}

		/**
		 * Verify item in dropdown by name atribute is displayed
		 * 
		 * @author ThachNk
		 * @param dropdownAtributeName
		 * @param itemValue
		 */
		public boolean isItemDropdownByNameDisplayed(String dropdownAtributeName, String itemValue) {
			waitForElementVisible(BasePageNopCommerceUI.DYNAMIC_ITEM_DROPDOWN_BY_NAME_AND_TEXT, dropdownAtributeName, itemValue);
			return isElementDisPlayed(BasePageNopCommerceUI.DYNAMIC_ITEM_DROPDOWN_BY_NAME_AND_TEXT, dropdownAtributeName, itemValue);
		}

		/**
		 * Click To dynamic radio button by label name
		 * 
		 * @author ThachNk
		 * @param checkBoxLabelname
		 */
		public void clickToRadioButtonByLabel(String checkBoxLabelname) {
			waitForElementClickable(BasePageNopCommerceUI.DYNAMIC_RADIO_BUTTON_BY_LABEL, checkBoxLabelname);
			checkToDefaultCheckboxOrRadio(BasePageNopCommerceUI.DYNAMIC_RADIO_BUTTON_BY_LABEL, checkBoxLabelname);
		}

		/**
		 * Click To dynamic checkbox by label name
		 * 
		 * @author ThachNk
		 * @param checkBoxLabelname
		 */
		public void clickToCheckboxByLabel(String checkBoxLabelname) {
			waitForElementClickable(BasePageNopCommerceUI.DYNAMIC_CHECKBOX_BY_LABEL, checkBoxLabelname);
			checkToDefaultCheckboxOrRadio(BasePageNopCommerceUI.DYNAMIC_CHECKBOX_BY_LABEL, checkBoxLabelname);
		}
		
		/**
		 * Get value in textbox by textboxID
		 * 
		 * @author ThachNk
		 * @param textboxID
		 * @return
		 */
		public String getTextboxValueByID(String textboxID) {
			waitForElementVisible(BasePageNopCommerceUI.DYNAMIC_TEXTBOX_BY_ID, textboxID);
			return getElementAttribute(BasePageNopCommerceUI.DYNAMIC_TEXTBOX_BY_ID, "value", textboxID);
		}

		/**
		 * Verify message displayed by text
		 * 
		 * @author ThachNk
		 * @param messageText
		 * @return
		 */
		public boolean isDynamicMessageDisplayed(String messageText) {
			waitForElementVisible(BasePageNopCommerceUI.DYNAMIC_MESSAGE_BY_TEXT, messageText);
			return isElementDisPlayed(BasePageNopCommerceUI.DYNAMIC_MESSAGE_BY_TEXT, messageText);
		}
}
