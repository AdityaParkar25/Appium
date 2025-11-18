package AndroidDevice_Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtils.AppiumDriverInitialization;

public class AndroidSpecific_Commands {
	
	@Test
	public void testAndroidSpecificCommands() throws InterruptedException{
		
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		
		Thread.sleep(5000);
		
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("left", 100, "top", 100,
				"width", 200, "height", 200, "endX", 523, "endY", 1387, "direction", "Down", "percent", 0.75));
		
		Thread.sleep(4000);
		
		WebElement internetArrow = driver.findElements(AppiumBy.id("com.android.systemui:id/chevron")).get(0);
		internetArrow.click();
		
		
		Thread.sleep(4000);
		//ON --> OFF Wifi
		((AndroidDriver)driver).toggleWifi();
		
		Thread.sleep(4000);
		
		//OFF ---> ON Wifi
		((AndroidDriver)driver).toggleWifi();
		
		
//		Thread.sleep(4000);
//		
//		
//		//ON --> OFF MobileData
//		((AndroidDriver)driver).toggleData();
//		
//		
//		//OFF --> ON MobileData
//		((AndroidDriver)driver).toggleData();
		
		
	}

}
