package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSteps {
	WebDriver driver;

	@Given("Open nopcommerce application")
	public void openFacebookApplication() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("Input to Username textbox")
	public void inputToUsernameTextbox() {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("automation@gmail.com");
	}

	@When("Input to Password textbox")
	public void inputToPasswordTextbox() {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("123456");
	}

	@When("Input to Username textbox with {string}")
	public void inputToUsernameTextboxWith(String email) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);
	}

	@When("Input to Password textbox with {string}")
	public void inputToPasswordTextboxWith(String password) {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("Input to Username textbox with {string} and Password textbox with {string}")
	public void inputToUsernameTextboxWithAndPasswordTextboxWith(String email, String password) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("Click to Submit button")
	public void clickToSubmitButton() {
		driver.findElement(By.cssSelector("button.login-button")).click();
	}

	@And("Close application")
	public void closeApplication() {
		driver.quit();
	}
}
