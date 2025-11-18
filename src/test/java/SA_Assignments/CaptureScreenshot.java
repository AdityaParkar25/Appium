// 5) Write automation script to open APIdemos application and capture the screenshot.

package SA_Assignments;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtils.AppiumDriverInitialization;

public class CaptureScreenshot {

	@Test
	public void Screenshot() throws InterruptedException {

		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();

		takeScreenShot(driver, "Homepage");
		WebElement ele1 = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));


		// Java
		driver.executeScript("mobile: clickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) ele1).getId()));
		
		Thread.sleep(2000);
		takeScreenShot(driver, "Accessibility_Page");
	}

	public static String takeScreenShot(AppiumDriver driver, String screenshotName) {
		TakesScreenshot ts = (TakesScreenshot) driver; // appium driver object
		File src = ts.getScreenshotAs(OutputType.FILE);

		String destPath = System.getProperty("user.dir") + "/screenShot/" + screenshotName + ".png";

		File dest = new File(destPath);
		dest.getParentFile().mkdirs();

		try {
			Files.copy(src.toPath(), dest.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destPath;
	}

}

