package N26.GnuCash2;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SetUp {
	public Boolean userSession;
	public static String HomeDir = System.getProperty("user.dir");;
	private static String sdkPath;
	private static String adbPath;
	private static String emulatorPath;
	private String EmulatorName = "Nexus5X";
	private AppiumDriverLocalService service;
	private AppiumServiceBuilder builder;
	// public Boolean EmulatorState;
	// SetUp appiumServer = new SetUp();

	// Get Emulator Path
	static {
		if (System.getenv("ANDROID_HOME") != null) {
			sdkPath = System.getenv("ANDROID_HOME");
		} else {
			sdkPath = System.getenv("HOME") + "/Library/Android/sdk";
		}
		adbPath = sdkPath + "/platform-tools" + File.separator + "adb";
		emulatorPath = sdkPath + "/tools" + File.separator + "emulator";
	}

	public static AndroidDriver driver;

	public static AndroidDriver getDriver() {
		return driver;
	}

	@BeforeSuite
	@Parameters({ "port-number" })
	public void PreSetUp(int port) throws IOException {

		File dir = new File(HomeDir + "/test-output/screenshots/");
		cleanDirectory(dir);

	}

	@BeforeTest
	@Parameters({ "app-session", "android-version", "port-number", "app-name", "deviceId" })
	// Launch app and accept app session
	public void setUp(Boolean appSession, String androidVersion, String PortNumber, String AppName, String DeviceId)
			throws MalformedURLException, InterruptedException {

		// Pass app session parameter
		userSession = appSession;
		File app = new File(HomeDir + "/apps/" + AppName);
		// server.startServer();

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("appPackage", "org.gnucash.android");
		// caps.setCapability("appActivity", ".ui.wizard.FirstRunWizardActivity");
		if (!appSession) {
			caps.setCapability("appWaitActivity", ".ui.wizard.FirstRunWizardActivity");
		}

		caps.setCapability("deviceName", DeviceId);
		caps.setCapability("udid", DeviceId);
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		caps.setCapability("platformVersion", androidVersion);
		
		// Use uiautomator 2 framework for Android 7 & up
		if (Float.parseFloat(androidVersion) > 6) {
			caps.setCapability("automationName", "uiautomator2");
		}
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "130");
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		// Use app session
		if (userSession) {
			caps.setCapability("noReset", true);
			caps.setCapability("fullReset", false);
		}

		driver = new AndroidDriver(new URL("http://127.0.0.1:" + PortNumber + "/wd/hub"), caps);

		// Configure Logger
		Logger logger = Logger.getLogger("SetUp");
		PropertyConfigurator.configure(HomeDir + "/log4j.properties");

		logger.info("App launched");

	}

	@AfterTest
	@Parameters({ "TestMode" })
	// Close App
	public void shutDown(String TestMode) throws IOException, InterruptedException {
		screenshot(HomeDir + "/test-output/screenshots/", TestMode);

		Thread.sleep(3000);
		driver.quit();
		Logger logger = Logger.getLogger("SetUp");
		PropertyConfigurator.configure(HomeDir + "/log4j.properties");

		logger.info("App Closed");

	}

	@AfterSuite
	@Parameters({ "port-number" })
	// Close Emulator
	public void afterSuite(int port) {
		Logger logger = Logger.getLogger("SetUp");
		PropertyConfigurator.configure(HomeDir + "/log4j.properties");

	}

	// Take Screenshot
	public void screenshot(String path_screenshot, String testMode) throws IOException {
		File srcFile = getDriver().getScreenshotAs(OutputType.FILE);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String filename = testMode + "_" + dateFormat.format(date).toString();
		File targetFile = new File(path_screenshot + filename + ".jpg");
		FileUtils.copyFile(srcFile, targetFile);
		Logger logger = Logger.getLogger("SetUp");
		PropertyConfigurator.configure(HomeDir + "/log4j.properties");
		logger.info("Screenshot taken");
	}

	// Clean Directory
	public static void cleanDirectory(File directory) throws IOException {
		FileUtils.cleanDirectory(directory);

	}


}

