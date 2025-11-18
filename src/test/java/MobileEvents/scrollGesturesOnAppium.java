package MobileEvents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtils.AppiumDriverInitialization;
import projectUtils.coreFunctions;

public class scrollGesturesOnAppium {
	
	@Test
	public void testScrollGestures() {

		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();

		
		WebElement eleViews = driver.findElement(AppiumBy.accessibilityId("Views"));

		// clicks on views element
		eleViews.click();

		// capture the element of entire list
		WebElement scrollList = driver.findElement(AppiumBy.id("android:id/list"));

		
		coreFunctions.scrollInAppiumWithUserCount(driver, scrollList, 2);
//		// Java
//		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of("elementId",
//				((RemoteWebElement) scrollList).getId(), "direction", "down", "percent", 1.0));

	}

}
