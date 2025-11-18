// 4) Write automation script to open APIDemos application on Mobile device Goto view and perform drag and drop functionality.

package SA_Assignments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import projectUtils.AppiumDriverInitialization;

public class DragAndDrop {

	@Test
	public void performDragAndDrop() throws InterruptedException {

		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		WebElement eleViews = driver.findElement(AppiumBy.accessibilityId("Views"));

		eleViews.click();

		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

		WebElement longClickElement = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

		// Java
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) longClickElement).getId(), "endX", 581, "endY", 1018));

		Thread.sleep(5000);

	}

}

