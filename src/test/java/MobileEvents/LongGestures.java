package MobileEvents;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtils.AppiumDriverInitialization;


public class LongGestures {
	
	@Test
	public void testLongGesture() {

		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		WebElement eleViews = driver.findElement(AppiumBy.accessibilityId("Views"));

		eleViews.click();
		
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		WebElement longClickElement = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
		
		// Java
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) longClickElement).getId()));


	}

}
