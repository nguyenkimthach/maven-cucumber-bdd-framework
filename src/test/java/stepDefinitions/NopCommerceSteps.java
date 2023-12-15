package stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommerceSteps {
	WebDriver driver;

	@Before("@parameter")
	public void openFacebookApplication() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After("@parameter")
	public void closeApplication() {
		driver.quit();
	}

	// @Given("^Open nopcommerce application$")
	// public void openFacebookApplication() {
	// WebDriverManager.firefoxdriver().setup();
	// driver = new FirefoxDriver();
	// driver.get("https://demo.nopcommerce.com/login");
	// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	// }

	@When("^Input to Username textbox$")
	public void inputToUsernameTextbox() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("automation@gmail.com");
	}

	@When("^Input to Password textbox$")
	public void inputToPasswordTextbox() {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("123456");
	}

	@When("^Input to Username textbox with \"([^\"]*)\"$")
	public void inputToUsernameTextboxWith(String email) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);
	}

	@When("^Input to Password textbox with \"([^\"]*)\"$")
	public void inputToPasswordTextboxWith(String password) {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("^Input to Username textbox with \"([^\"]*)\" and Password textbox with \"([^\"]*)\"$")
	public void inputToUsernameWithAndPasswordWith(String email, String password) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);

		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("Click to Submit button")
	public void clickToSubmitButton() {
		driver.findElement(By.cssSelector("button.login-button")).click();
	}

	// @After
	// public void closeApplication() {
	// driver.quit();
	// }

	@When("^Input to Username and Password$")
	public void inputToUsernameAndPassword(DataTable table) {
		// List<Map<String, String>> customer = table.asMaps(String.class, String.class);
		// driver.findElement(By.id("Email")).clear();
		// driver.findElement(By.id("Email")).sendKeys(customer.get(0).get("Username"));
		// driver.findElement(By.id("Password")).clear();
		// driver.findElement(By.id("Password")).sendKeys(customer.get(0).get("Password"));

		for (Map<String, String> loginInfor : table.asMaps(String.class, String.class)) {
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Email")).sendKeys(loginInfor.get("Username"));
			driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("Password")).sendKeys(loginInfor.get("Password"));
		}
	}
}
