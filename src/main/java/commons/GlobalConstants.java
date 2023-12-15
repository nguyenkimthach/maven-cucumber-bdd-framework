package commons;

import java.io.File;

import lombok.Getter;

@Getter
public class GlobalConstants {
	private static GlobalConstants globalInstance;

	private GlobalConstants() {

	}

	public static synchronized GlobalConstants getGlobalConstants() {
		if (globalInstance == null) {
			globalInstance = new GlobalConstants();
		}
		return globalInstance;
	}

	private final String portalDevUrl = "https://demo.nopcommerce.com/";
	private final String adminDevUrl = "https://admin-demo.nopcommerce.com/";
	private final String portalTestingUrl = "https://demo.nopcommerce.com/";
	private final String adminTestingUrl = "https://admin-demo.nopcommerce.com/";

	private final String projectPath = System.getProperty("user.dir");
	private final String osName = System.getProperty("os.name");
	private final String javaVersion = System.getProperty("java.version");

	private final String uploadFile = projectPath + File.separator + "uploadFiles" + File.separator;
	private final String downloadFile = projectPath + File.separator + "downloadFiles";
	private final String browserLogPath = projectPath + File.separator + "browserLogs" + File.separator + "FirefoxLog.log";
	private final String dragDropHtml5 = projectPath + File.separator + "dragDropHTML5";
	private final String autoItScript = projectPath + File.separator + "autoIT";
	private final String reportingScreenshort = projectPath + File.separator + "ReportNGImages" + File.separator;
	private final String extentv2Path = projectPath + File.separator + "extentV2" + File.separator;

	private final String browserUserName = "kimthchnguyn_qk3uht";
	private final String browserAutomateKey = "LMn5UjkKqfz7suKbcyiG";
	private final String browserStackUrl = "https://" + browserUserName + ":" + browserAutomateKey + "@hub-cloud.browserstack.com/wd/hub";

	private final String saucelabUserName = "oauth-nguyenkimthach.a-5c552";
	private final String saucelabAutomateKey = "d983a248-d490-4eed-a8f1-da95825e218d";
	private final String saucelabUrl = "https://" + saucelabUserName + ":" + saucelabAutomateKey + "@ondemand.us-west-1.saucelabs.com:443/wd/hub";

	private final String lambdaUserName = "nguyenkimthach.a";
	private final String lambdaAutomateKey = "NEnHOnba7txOAdLZOQyoIDsiVvC9m6f5cpREE88AnTaVhnp1J3";
	private final String lambdaUrl = "https://" + lambdaUserName + ":" + lambdaAutomateKey + "@hub.lambdatest.com/wd/hub";

	private final String crossbrowserApiKey = "MKqlYqvpsPAiVT5gmVR4kgyuOIq8jwtP";
	private final String crossbrowserUrl = "https://eu-desktop-hub.bitbar.com/wd/hub";

	private final long shortTimeOut = 5;
	private final long longTimeOut = 30;
	private final long retryTestFail = 3;
}
