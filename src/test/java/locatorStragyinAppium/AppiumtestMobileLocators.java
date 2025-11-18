package locatorStragyinAppium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtils.AppiumDriverInitialization;

public class AppiumtestMobileLocators {
	
	
	@Test
	public void testLocatorWithIDandName() throws InterruptedException {
		
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		
		// List<WebElement> element4 = driver.findElements(AppiumBy.className("android.widget.TextView"));
		WebElement ele4 = driver.findElements(AppiumBy.className("android.widget.TextView")).get(5);
		String element4 = ele4.getText();
		System.out.println("element4: "+ element4);
		ele4.click();
		
		Thread.sleep(4000);
		driver.navigate().back();
		
		WebElement ele5 = driver.findElements(AppiumBy.id("android:id/text1")).get(2);
		String element5 = ele5.getText();
		System.out.println("element5: "+ element5);
		ele5.click();
		
		
	}

}
