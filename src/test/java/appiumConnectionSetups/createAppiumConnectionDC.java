package appiumConnectionSetups;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class createAppiumConnectionDC {

	@Test
	public void setupAppiumConnection() {

		// String apkPath = System.getProperty("user.dir" +
		// "//src//test//resources//ApiDemos-debug.apk");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:automationName", "uiautomator2");
		dc.setCapability("appium:deviceName", "medium_phone");
		// dc.setCapability("appium:udid","emulator-5554"); // this is optional when u using single emulator
		
		dc.setCapability("appium:app",
				"A:\\StarAgile\\MODULES\\WebDriver\\Aditya_SeleniumWorkspace\\AppiumTest\\src\\test\\resources\\ApiDemos-debug.apk");
		
		// A:\StarAgile\MODULES\WebDriver\Aditya_SeleniumWorkspace\AppiumTest\src\test\resources\ApiDemos-debug.apk
		/// Volumes/Renuka/Professional Stuff
		/// (Restricted)/Session_material/Session_WorkSpaces/Automation_SA2506029/SA2506029_API/AppiumTest/src/test/resources/ApiDemos-debug.apk

		try {
			URL url = new URL("http://127.0.0.1:4723/");
			AppiumDriver ap = new AppiumDriver(url, dc);
			// AppiumDriver ap = new AndroidDriver(url,dc);
			// ((AndroidDriver)ap).installApp(apkPath);
			System.out.println("Session ID " + ap.getSessionId());

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
