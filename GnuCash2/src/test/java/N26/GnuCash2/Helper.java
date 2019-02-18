package N26.GnuCash2;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Helper extends SetUp {

	// public Helper() {
	//
	// }

	// WebDriver driver;

	// Helper test
	public void HelperTest() {
		System.out.println("Methods Helper Test Successful!");
	}

	// CHECK IF ELEMENT IS PRESENT
	public boolean isElementPresent(String element) {

		try {
			getDriver().findElement(By.id(element));
			return true;

		} catch (NoSuchElementException e) {

			return false;
		}

	}

	// GET TEXT ATTRIBUTE
	// By Xpath
	public String GetTextXpath(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).getAttribute("text");
	}

	// Xpath Text Attribute
	public String GetTextXpathWithText(String text) {
		return getDriver().findElement(By.xpath("//*[@text=\"" + text + "\"]")).getAttribute("text");
	}

	// By Element
	public String GetTextElement(WebElement element) {
		return element.getAttribute("text");
	}

	// By Id
	public String GetTextId(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("text");
	}

	// GET VALUE ATTRIBUTE
	// By id
	public String GetValueId(String element) {
		return getDriver().findElement(By.id(element)).getAttribute("value");
	}

	// CLICK
	// By Id
	public void ClickId(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	// By xpath
	public void ClickXpath(String xpathString) {
		getDriver().findElement(By.xpath(xpathString)).click();
	}

	// By xpath with text
	public void ClickXpathWithText(String text) {
		getDriver().findElement(By.xpath("//*[@text=\"" + text + "\"]")).click();
	}

	// By ClassName
	public void ClickClass(String element, int i) {
		getDriver().findElements(By.className(element)).get(i);
	}

	// By Element
	public void ClickElement(WebElement element) {
		element.click();
	}

	// SEND KEYS
	// By xpath
	public void SendKeysXpath(String xpath, String keys) {
		getDriver().findElement(By.xpath(xpath)).sendKeys(keys);
	}

	// By Id
	public void SendKeysId(String id, String keys) {
		getDriver().findElement(By.id(id)).sendKeys(keys);
	}

	// By class
	public void SendKeysClass(String element, String keys) {
		getDriver().findElement(By.className(element)).sendKeys(keys);
	}

	// By Element
	public void SendKeysElement(WebElement element, String keys) {
		element.sendKeys(keys);
	}

	// SEND KEY EVENT
	// Enter
	public void SendEnterKey() {
		getDriver().pressKeyCode(AndroidKeyCode.ENTER);
	}

	public void SendBackKey() {
		getDriver().pressKeyCode(AndroidKeyCode.BACK);
	}

	public void SendZeroKey() {
		getDriver().pressKeyCode(AndroidKeyCode.KEYCODE_0);
	}

	public void SendOneKey() {
		getDriver().pressKeyCode(AndroidKeyCode.KEYCODE_1);
	}

	public void SendTwoKey() {
		getDriver().pressKeyCode(AndroidKeyCode.KEYCODE_2);
	}

	public void SendThreeKey() {
		getDriver().pressKeyCode(AndroidKeyCode.KEYCODE_3);
	}

	public void SendFourKey() {
		getDriver().pressKeyCode(AndroidKeyCode.KEYCODE_4);
	}

	public void SendFiveKey() {
		getDriver().pressKeyCode(AndroidKeyCode.KEYCODE_5);
	}

	public void SendSixKey() {
		getDriver().pressKeyCode(AndroidKeyCode.KEYCODE_6);
	}

	public void SendSevenKey() {
		getDriver().pressKeyCode(AndroidKeyCode.KEYCODE_7);
	}

	public void SendEightKey() {
		getDriver().pressKeyCode(AndroidKeyCode.KEYCODE_8);
	}

	public void SendNineKey() {
		getDriver().pressKeyCode(AndroidKeyCode.KEYCODE_9);
	}

	// Send PIN
	public void sendPIN() {
		SendTwoKey();
		SendTwoKey();
		SendFourKey();
		SendSixKey();
	}

	// Home
	public void SendHomeKey() {
		// getDriver().pressKeyCode(AndroidKeyCode.HOME);
		getDriver().pressKeyCode(3);

	}

	// SCROLL TO
	public void ScrollAndClick(String location) {
		getDriver().scrollTo(location).click();
	}

	// SWIPE
	// Up xpath
	public void SwipeUpXPath(String location, int duration) {
		MobileElement abc = (MobileElement) driver.findElement(By.xpath(location));
		abc.swipe(SwipeElementDirection.UP, duration);
	}

	// Up Class
	public void SwipeUpClass(String location, int duration) {
		MobileElement abc = (MobileElement) driver.findElement(By.className(location));
		abc.swipe(SwipeElementDirection.UP, duration);
	}

	// Up Id
	public void SwipeUpId(String location, int duration) {
		MobileElement abc = (MobileElement) driver.findElement(By.id(location));
		abc.swipe(SwipeElementDirection.UP, duration);
	}

	// Left
	public void SwipeLeft(String location, int duration) {
		MobileElement abc = (MobileElement) driver.findElement(By.id(location));
		abc.swipe(SwipeElementDirection.LEFT, duration);
	}

	// Right
	public void SwipeRight(String location, int duration) {
		MobileElement abc = (MobileElement) driver.findElement(By.id(location));
		abc.swipe(SwipeElementDirection.RIGHT, duration);
	}


	// Screenshot
	public void screenshot() throws IOException {
		File srcFile = getDriver().getScreenshotAs(OutputType.FILE);
		String filename = UUID.randomUUID().toString();
		File targetFile = new File(
				"/Users/olukunle/Documents/workspace/GnuCash⁩/GnuCash2⁩/test-output/screenshots/" + filename + ".jpg");
		FileUtils.copyFile(srcFile, targetFile);
	}

	// Wait for element
	public void waitForElement(String element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element)));
	}

	// Custom wait for element
	public void CustomWaitForElement(String element, int secs) {
		WebDriverWait wait = new WebDriverWait(getDriver(), secs);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element)));
	}

	public void waitForElementClass(String element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(element)));
	}

	public void CustomWaitForElementClass(String element, int secs) {
		WebDriverWait wait = new WebDriverWait(getDriver(), secs);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(element)));
	}

	// Size of Element
	public int ElementSizeId(String element) {
		return getDriver().findElements(By.id(element)).size();
	}

	// GET STRING LENGTH
	public int GetStringLengthId(String element) {
		return getDriver().findElement(By.id(element)).getAttribute("text").length();

	}

	// Clear Text
	// id
	public void ClearText(String element) {
		getDriver().findElement(By.id(element)).clear();
	}

	// xpath
	public void ClearTextXpath(String element) {
		getDriver().findElement(By.xpath(element)).clear();
	}

	// ASSERT
	// Assert element
	public void assertElement(String element, String Message) {
		Boolean iselementpresent = getDriver().findElements(By.id(element)).size() != 0;
		Assert.assertTrue(iselementpresent, Message + " is not present on screen");
		System.out.println(Message + " is present on screen.");
	}

	// FIND ELEMENTS
	// Classname
	public List<AndroidElement> ElementsClass(String element) {
		List<AndroidElement> Al = getDriver().findElementsByClassName(element);
		return Al;

	}

	// ID
	public List<AndroidElement> ElementsId(String element) {
		List<AndroidElement> list = getDriver().findElementsById(element);
		return list;
	}

	// XPATH
	public List<AndroidElement> ElementsXpath(String element) {
		List<AndroidElement> list = getDriver().findElementsByXPath(element);
		return list;
	}

	// Xpath Text Attribute
	public List<AndroidElement> ElementsXpathByText(String text) {
		List<AndroidElement> list = getDriver().findElements(By.xpath("//*[@text=\"" + text + "\"]"));
		return list;
	}


}
