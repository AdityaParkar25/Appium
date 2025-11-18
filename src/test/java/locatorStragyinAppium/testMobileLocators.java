package locatorStragyinAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class testMobileLocators {

	@Test
	public void testMobile() {

		UiAutomator2Options auto = new UiAutomator2Options();
		String apkPath = System.getProperty("user.dir" + "//src/test//resources//ApiDemos-debug.apk");
		auto.setCapability("appium:app", apkPath);

		try {
			URL url = new URL("http://127.0.0.1:4723/");
			AppiumDriver ap = new AppiumDriver(url, auto);
			System.out.println("Session ID " + ap.getSessionId());

			WebElement ele1 = ap.findElement(AppiumBy.accessibilityId("Access'ibility"));
			String firstElementName = ele1.getText();
			System.out.println(firstElementName);
			ele1.click();

			Thread.sleep(2000);

			ap.navigate().back();

			WebElement ele2 = ap.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Animation\")"));
			String secondElementName = ele2.getText();
			System.out.println(secondElementName);
			ele2.click();

			Thread.sleep(2000);

			ap.navigate().back();
			
			WebElement ele3 = ap.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"App\"]"));
			String thirdElementName = ele3.getText();
			System.out.println(thirdElementName);
			ele3.click();

			Thread.sleep(2000);

			ap.navigate().back();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
