package cucumberOptions;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import commons.GlobalConstants;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	// Run for many thread
	private static WebDriver driver;
	private static final Logger log = Logger.getLogger(Hooks.class.getName());

	@Before // synchronized = handle đồng bộ
	public synchronized static WebDriver openAndQuitBrowser() {
		// Run by Maven command line
		String browser = System.getProperty("BROWSER");
		System.out.println("Browser name run by command line = " + browser);

		// Check driver đã được khởi tạo hay chưa?
		if (driver == null) {
			
			// Happy path case
			try {
				// Kiem tra BROWSER = null -> gan = chrome/ firefox (browser default for project)
				if (browser == null) {
					// Get browser name from Environment Variable in OS
					browser = System.getenv("BROWSER");
					if (browser == null) {
						// Set default browser
						browser = "firefox";
					}
				}

				switch (browser) {
				case "chrome":
					WebDriverManager.chromedriver().setup();
					System.setProperty("webdriver.chrome.args", "--disable-logging");
					System.setProperty("webdriver.chrome.silentOutput", "true");
					ChromeOptions options = new ChromeOptions();
					options.setExperimentalOption("useAutomationExtension", false);
					options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
					driver = new ChromeDriver(options);
					break;
				case "h_chrome":
					WebDriverManager.chromedriver().setup();
					ChromeOptions options1 = new ChromeOptions();
					options1.addArguments("--headless");
					options1.addArguments("window-size=1366x768");
					driver = new ChromeDriver(options1);
					break;
				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
					System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, GlobalConstants.getGlobalConstants().getProjectPath() + "\\FirefoxLog.log");
					driver = new FirefoxDriver();
					break;
				case "h_firefox":
					WebDriverManager.firefoxdriver().setup();
					FirefoxOptions options2 = new FirefoxOptions();
					options2.addArguments("--headless");
					options2.addArguments("window-size=1366x768");
					driver = new FirefoxDriver(options2);
					break;
				case "ie":
					WebDriverManager.iedriver().arch32().setup();
					driver = new InternetExplorerDriver();
					break;
				case "coccoc":
					WebDriverManager.chromedriver().driverVersion("115.0.5790.102").setup();
					ChromeOptions options3 = new ChromeOptions();
					if (GlobalConstants.getGlobalConstants().getOsName() == "Windows") {
						options3.setBinary("C:\\Program Files\\CocCoc\\Browser\\Application\\browser.exe");
					} else {
						options3.setBinary("C:\\Program Files\\CocCoc\\Browser\\Application\\browser.exe");
					}
					driver = new ChromeDriver(options3);
					break;
				case "opera":
					WebDriverManager.operadriver().setup();
					driver = new OperaDriver();
					break;
				default:
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					break;
				}
			}
			// Code này luôn luôn được chạy dù pass hay fail
			finally {
				Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
			}

			driver.get(GlobalConstants.getGlobalConstants().getPortalDevUrl());
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			log.info("------------- Started the browser -------------");
		}
		return driver;
	}

	public static void close() {
		try {
			if (driver != null) {
				openAndQuitBrowser().quit();
				log.info("------------- Closed the browser -------------");
			}
		} catch (UnreachableBrowserException e) {
			System.out.println("Can not close the browser");
		}
	}

	private static class BrowserCleanup implements Runnable {
		@Override
		public void run() {
			close();
		}
	}

}
