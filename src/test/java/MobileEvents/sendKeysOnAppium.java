package MobileEvents;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtils.AppiumDriverInitialization;
import projectUtils.coreFunctions;

public class sendKeysOnAppium {
	
	@Test
	public void testSendkeys() {
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		WebElement eleViews = driver.findElement(AppiumBy.accessibilityId("Views"));

		// clicks on views element
		eleViews.click();

		// capture the element of entire list

		WebElement scrollList = driver.findElement(AppiumBy.id("android:id/list"));

		coreFunctions.scrollInAppiumWithUserCount(driver, scrollList, 2);

		// clicks on text field link
		driver.findElement(AppiumBy.accessibilityId("TextFields")).click();

		driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).sendKeys("Appium is webbase library");
	}

}
