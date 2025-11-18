package appiumConnectionSetups;

import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class createAppiumConnectionwithUIAutomator {

	@Test
	public void createAppiumConnectionUiAutomator2() {
		UiAutomator2Options auto = new UiAutomator2Options();
		String apkPath = System.getProperty("user.dir" + "//src/test//resources//ApiDemos-debug.apk");
		auto.setCapability("appium:app", apkPath);

		try {
			URL url = new URL("http://127.0.0.1:4723/");
			AppiumDriver ap = new AppiumDriver(url, auto);
			System.out.println("Session ID " + ap.getSessionId());

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
