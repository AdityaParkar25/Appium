package projectUtils;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppiumDriverInitialization {
	
	public static AppiumDriver appiumdriver;
	
	public static AppiumDriver createAppiumDriver() {
		
		UiAutomator2Options auto = new UiAutomator2Options();
		String apkPath = System.getProperty("user.dir" + "//src/test//resources//ApiDemos-debug.apk");
		auto.setCapability("appium:app", "A:\\StarAgile\\MODULES\\WebDriver\\Aditya_SeleniumWorkspace\\AppiumTest\\src\\test\\resources\\ApiDemos-debug.apk");

		try {
			URL url = new URL("http://127.0.0.1:4723/");
			//appiumdriver = new AppiumDriver(url, auto);
			appiumdriver = new AndroidDriver(url, auto);
			System.out.println("Session ID: " + appiumdriver.getSessionId());

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return appiumdriver;
	}

}

