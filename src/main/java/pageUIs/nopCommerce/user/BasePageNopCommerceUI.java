package pageUIs.nopCommerce.user;

public class BasePageNopCommerceUI {
	public static final String ADDRESS_LINK = "xpath=//div[contains(@class,'account-navigation')]//a[text()='Addresses']";
	public static final String CUSTOMER_INFOR_LINK = "xpath=//div[contains(@class,'account-navigation')]//a[text()='Customer info']";
	public static final String REWARD_POINT_LINK = "xpath=//div[contains(@class,'account-navigation')]//a[text()='Reward points']";
	public static final String MY_PRODUCT_REVIEW_LINK = "xpath=//div[contains(@class,'account-navigation')]//a[text()='My product reviews']";
	public static final String USER_LOGOUT_LINK = "css=a[class='ico-logout']";
	public static final String ADMIN_LOGOUT_LINK = "xpath=//a[text() ='Logout']";

	// Pattern object
	public static final String DYNAMIC_PAGE_AT_MY_ACCOUNT_AREA = "xpath=//div[contains(@class,'account-navigation')]//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX_BY_ID = "xpath=//input[@id='%s']";
	public static final String DYNAMIC_BUTTON_BY_TEXT = "xpath=//button[text()='%s']";
	public static final String DYNAMIC_LINK_BY_TEXT = "xpath=//a[text()='%s']";
	public static final String DYNAMIC_DROPDOWN_BY_NAME= "xpath=//select[@name='%s']";
	public static final String DYNAMIC_ITEM_DROPDOWN_BY_NAME_AND_TEXT = "xpath=//select[@name='%s']/option[text()='%s' and @selected]";
	public static final String DYNAMIC_RADIO_BUTTON_BY_LABEL = "xpath=//label[text()='%s']/preceding-sibling::input";
	public static final String DYNAMIC_CHECKBOX_BY_LABEL = "xpath=//label[contains(text(),'%s')]/following-sibling::input";
	public static final String DYNAMIC_MESSAGE_BY_TEXT = "xpath=//*[text()='%s']";
}
