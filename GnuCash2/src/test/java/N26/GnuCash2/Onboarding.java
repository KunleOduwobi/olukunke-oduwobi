package N26.GnuCash2;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import N26.GnuCash2.Helper;
import N26.GnuCash2.OnboardingPageObjects;
import io.appium.java_client.android.AndroidElement;

public class Onboarding extends Helper {

	OnboardingPageObjects elements = new OnboardingPageObjects();

	private String HomeDir = System.getProperty("user.dir");

	@Parameters({ "app-session", "android-version", "TestMode", "app-version" })
	@Test(groups = { "Onboarding.onboarding" })
	public void onboarding(Boolean appSession, String androidVersion, String TestMode, String AppVersion)
			throws InterruptedException {

		// Configure Logger
		Logger logger = Logger.getLogger("Onboarding.onboarding");
		PropertyConfigurator.configure(HomeDir + "/log4j.properties");
		logger.info("Test Case: " + TestMode);

		CustomWaitForElement(elements.getWelcomeId(), 10);

		// Verify Welcome Slide
		assertEquals(GetTextXpathWithText("Welcome to GnuCash"), "Welcome to GnuCash");
		logger.info("1st Slide Title validated: " + GetTextXpathWithText("Welcome to GnuCash"));

		assertEquals(GetTextId(elements.getNextBtnId()), "NEXT");
		logger.info("Next button found");

		// Click Next button
		try {
			ClickId(elements.getNextBtnId());
			logger.info("Next button clicked");
		} catch (Exception e) {
			logger.error("Unable to click next button");
		}

		// Verify Default Currency Slide
		CustomWaitForElementClass(elements.getCurrencyClass(), 5);
		assertEquals(GetTextId(elements.getWelcomeId()), "Default Currency");
		logger.info("2nd Slide Title validated: " + GetTextXpathWithText("Default Currency"));

		// List displayed currencies
		List<AndroidElement> Currencies = ElementsClass(elements.getCurrencyClass());
		for (AndroidElement androidElement : Currencies) {
			logger.info("Currency listed: " + androidElement.getAttribute("text"));
		}

		// Select Euro currency
		Currencies.get(1).click();
		logger.info("Euro currency selected");

		// Validate Page Buttons
		assertEquals(GetTextId(elements.getBackBtnId()), "BACK");
		logger.info("Back button found");
		assertEquals(GetTextId(elements.getNextBtnId()), "NEXT");
		logger.info("Next button found");

		// Click Next button
		try {
			ClickId(elements.getNextBtnId());
			logger.info("Next button clicked");
		} catch (Exception e) {
			logger.error("Unable to click next button");
		}

		// Verify Account Setup Slide
		CustomWaitForElementClass(elements.getCurrencyClass(), 5);
		assertEquals(GetTextId(elements.getWelcomeId()), "Account Setup");
		logger.info("3rd Slide Title validated: " + GetTextXpathWithText("Account Setup"));

		// List displayed account options
		List<AndroidElement> Accounts = ElementsClass(elements.getCurrencyClass());
		for (AndroidElement androidElement : Accounts) {
			logger.info("Account options listed: " + androidElement.getAttribute("text"));
		}

		// Select Default Account
		Accounts.get(0).click();
		logger.info("'Create default accounts' option selected");

		// Validate Page Buttons
		assertEquals(GetTextId(elements.getBackBtnId()), "BACK");
		logger.info("Back button found");
		assertEquals(GetTextId(elements.getNextBtnId()), "NEXT");
		logger.info("Next button found");

		// Click Next button
		try {
			ClickId(elements.getNextBtnId());
			logger.info("Next button clicked");
		} catch (Exception e) {
			logger.error("Unable to click next button");
		}

		// Verify Feedback Options Slide
		CustomWaitForElementClass(elements.getCurrencyClass(), 5);
		assertEquals(GetTextId(elements.getWelcomeId()), "Feedback Options");
		logger.info("4th Slide Title validated: " + GetTextXpathWithText("Feedback Options"));

		// List displayed feedback options
		List<AndroidElement> Feedbacks = ElementsClass(elements.getCurrencyClass());
		for (AndroidElement androidElement : Feedbacks) {
			logger.info("Feedback options listed: " + androidElement.getAttribute("text"));
		}

		// Select Disable Crash reports
		Feedbacks.get(1).click();
		logger.info("'Disable crash reports' option selected");

		// Validate Page Buttons
		assertEquals(GetTextId(elements.getBackBtnId()), "BACK");
		logger.info("Back button found");
		assertEquals(GetTextId(elements.getNextBtnId()), "NEXT");
		logger.info("Next button found");

		// Click Next button
		try {
			ClickId(elements.getNextBtnId());
			logger.info("Next button clicked");
		} catch (Exception e) {
			logger.error("Unable to click next button");
		}

		// Validate Review Page Contents
		CustomWaitForElement(elements.getText2Ids(), 5);
		assertEquals(GetTextId(elements.getWelcomeId()), "Review");
		logger.info("5th Slide Title validated: " + GetTextXpathWithText("Review"));

		// Validate Review Content
		List<AndroidElement> Review = ElementsId(elements.getText2Ids());

		assertEquals(Review.get(0).getAttribute("text"), "EUR");
		logger.info("Default Currency validated: " + Review.get(0).getAttribute("text"));

		assertEquals(Review.get(1).getAttribute("text"), "Create default accounts");
		logger.info("Account Setup validated: " + Review.get(1).getAttribute("text"));

		assertEquals(Review.get(2).getAttribute("text"), "Disable crash reports");
		logger.info("Feedback Options validated: " + Review.get(2).getAttribute("text"));

		// Validate Page Buttons
		assertEquals(GetTextId(elements.getBackBtnId()), "BACK");
		logger.info("Back button found");
		assertEquals(GetTextId(elements.getNextBtnId()), "DONE");
		logger.info("Done button found");

		// Click Done button
		try {
			ClickId(elements.getNextBtnId());
			logger.info("Done  button clicked");
		} catch (Exception e) {
			logger.error("Unable to click done button");
		}

		// Verify New App Version Alert is displayed
		CustomWaitForElement(elements.getAlertTitleId(), 5);

		assertEquals(String.valueOf(GetTextId(elements.getAlertTitleId()).contains("What's New")), "true");
		logger.info("Alert title validated: " + GetTextId(elements.getAlertTitleId()));

		// Dismiss Alert
		assertEquals(GetTextId(elements.getDismissBtnId()), "DISMISS");
		logger.info("Dismiss button found");

		try {
			ClickId(elements.getDismissBtnId());
			logger.info("Dismiss button clicked");
		} catch (Exception e) {
			logger.error("Unable to click Dismiss button");
		}

		Thread.sleep(5000);
		logger.info("Test case completed!");

	}

}

