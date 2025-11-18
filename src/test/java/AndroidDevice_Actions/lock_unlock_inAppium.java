package AndroidDevice_Actions;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtils.AppiumDriverInitialization;

public class lock_unlock_inAppium {
	
	
	@Test
	public void testAndroidDevicesAction() throws InterruptedException {
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		
		Thread.sleep(4000);
		
		//lock my device.
		((AndroidDriver)driver).lockDevice();
		
		Thread.sleep(2000);
		
		//unlock my device
		((AndroidDriver)driver).unlockDevice();  // this command will not work with real device.
		
		Thread.sleep(2000);
		
		
		
		//this will rotate my mobile into landscape view
		
		((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
		
		Thread.sleep(2000);
		
		//this will rotate my mobile into portrait view
		((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
		
	}

}
