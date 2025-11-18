package projectUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class coreFunctions {

	public static String takeScreenShot(AppiumDriver driver, String screenshotName) {
		TakesScreenshot ts = (TakesScreenshot) driver; // appium driver object
		File src = ts.getScreenshotAs(OutputType.FILE);

		String timeStamp = new SimpleDateFormat("yyyyMMDD_HHmmss").format(new Date());
		String destPath = System.getProperty("user.dir") + "/screenShot/" + screenshotName + "_" + timeStamp + ".png";

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
	
	
	public static void scrollInAppiumWithUserCount(AppiumDriver driver, WebElement area, int count) {

		for (int i = 0; i <= count; i++) {
			((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of("elementId",
					((RemoteWebElement) area).getId(), "direction", "down", "percent", 1.0));
		}
	}

	public static void scrollDown(AppiumDriver driver, WebElement area) {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "down", "percent", 1.0));
	}

	public static void scrollUp(AppiumDriver driver, WebElement area) {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "up", "percent", 1.0));
	}

	public static void scrollLeft(AppiumDriver driver, WebElement area) {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "left", "percent", 1.0));
	}

	public static void scrollRight(AppiumDriver driver, WebElement area) {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) area).getId(), "direction", "right", "percent", 1.0));
	}

}
