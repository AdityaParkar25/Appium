// 1) Write automation script for connecting android device and capture the session Id for connection.

package SA_Assignments;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CaptureSessionID {

	@Test
	public void createAppiumDriver() {

		UiAutomator2Options auto = new UiAutomator2Options();
		auto.setCapability("appium:app",
				"A:\\StarAgile\\MODULES\\WebDriver\\Aditya_SeleniumWorkspace\\AppiumTest\\src\\test\\resources\\ApiDemos-debug.apk");

		try {
			URL url = new URL("http://127.0.0.1:4723/");
			AppiumDriver appiumdriver = new AndroidDriver(url, auto);
			System.out.println("Connection SUCCESSFUL, Session ID: " + appiumdriver.getSessionId());

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}


