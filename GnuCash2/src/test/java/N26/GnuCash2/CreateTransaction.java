package N26.GnuCash2;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import N26.GnuCash2.CreateTransactionPageObject;
import N26.GnuCash2.Helper;
import io.appium.java_client.android.AndroidElement;

public class CreateTransaction extends Helper {

	CreateTransactionPageObject elements = new CreateTransactionPageObject();

	private String HomeDir = System.getProperty("user.dir");

	@Parameters({ "app-session", "android-version", "TestMode", "app-version", "AccountName", "AccountType",
			"AccountDescription" })
	@Test(groups = { "CreateTransactionPageObject.createTransactionPageObject" })
	public void createTransactionPageObject(Boolean appSession, String androidVersion, String TestMode,
			String AppVersion, String AccountName, String AccountType, String AccountDescription)
			throws InterruptedException {

		// Configure Logger
		Logger logger = Logger.getLogger("CreateTransactionPageObject.createTransactionPageObject");
		PropertyConfigurator.configure(HomeDir + "/log4j.properties");
		logger.info("Test Case: " + TestMode);

		try {
			CustomWaitForElement(elements.getCreateTransactionFABId(), 5);
			logger.info("Create New Transaction button found");
		} catch (Exception e) {
			logger.error("Unable to find FAB button");
		}

		// Click FAB button
		try {
			ClickId(elements.getCreateTransactionFABId());
			logger.info("Create New Transaction button clicked");
		} catch (Exception e) {
			logger.error("Unable to click Create New Transaction button");
		}

		// Verify Account Name page is displayed
		CustomWaitForElement(elements.getAccountNamePlaceholderId(), 5);
		assertEquals(GetTextXpathWithText("Create Account"), "Create Account");
		logger.info(GetTextXpathWithText("Create Account") + " found");

		// Enter Account Name
		assertEquals(GetTextId(elements.getAccountNamePlaceholderId()), "Account name");
		logger.info("Account Name place holder validated: " + GetTextId(elements.getAccountNamePlaceholderId()));
		SendKeysId(elements.getAccountNameId(), AccountName);
		logger.info("Account name entered: " + GetTextId(elements.getAccountNameId()));

		// Close Keyboard
		try {
			getDriver().hideKeyboard();
			logger.info("Keyboard hidden");
		} catch (Exception e) {
			logger.info("Keybaord already hidden");
		}

		// Verify Selected Currency is Euro
		List<AndroidElement> SpinnerTexts = ElementsId(elements.getSelectedFieldsId());

		assertEquals(SpinnerTexts.get(0).getAttribute("text"), "EUR - Euro");
		logger.info("Default currency validated: " + SpinnerTexts.get(0).getAttribute("text"));

		// Select Account Type
		try {
			ClickId(elements.getAccountTypeSpinnerId());
			logger.info("Account types listed");
		} catch (Exception e) {
			logger.error("Unable to list account types");
		}

		Thread.sleep(2000);
		List<AndroidElement> AccountTypes = ElementsId(elements.getAccountTypesId());
		try {
			AccountTypes.get(1).click();
			logger.info("Account type selected");
		} catch (Exception e) {
			logger.error("Unable to select an account type");
		}

		// Validate selected account type is now displayed
		List<AndroidElement> SelectedAccountType = ElementsId(elements.getAccountTypesId());
		assertEquals(SelectedAccountType.get(1).getAttribute("text"), AccountType);
		logger.info("Selected account type validated: " + SelectedAccountType.get(1).getAttribute("text"));

		// Enter Account Description
		assertEquals(GetTextId(elements.getAccountDescriptionPlaceholderId()), "Account description");
		logger.info("Decription placeholder validated: " + GetTextId(elements.getAccountDescriptionPlaceholderId()));
		try {
			SendKeysId(elements.getAccountDescriptionId(), AccountDescription);
			logger.info("Account description entered");
		} catch (Exception e) {
			logger.error("Unable to enter account description");
		}

		// Save New Account
		try {
			ClickId(elements.getSaveBtnId());
			logger.info("Save button clicked");
		} catch (Exception e) {
			logger.error("Unable to click save button");
		}

		// Verify New Account is listed
		CustomWaitForElement(elements.getCreateTransactionFABId(), 5);
		logger.info("Created account found: " + GetTextXpathWithText(AccountName));

		Thread.sleep(5000);
		logger.info("Test case completed!");

	}

}

