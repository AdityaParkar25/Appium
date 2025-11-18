// 2) Write automation script for launching mobile application
// a) test the application current state
// b) send application in background and then again capture the state.

package SA_Assignments;

import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtils.AppiumDriverInitialization;

public class LaunchMobileApplication {

	@Test
	public void testApplicationState() throws InterruptedException {

		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();

		// below command would return current package/URL of apps
		String currentPackage = ((AndroidDriver) driver).getCurrentPackage();
		System.out.println("CURRENT Package: " + currentPackage);
		System.out.println();

		
		//a) test the application current state
		System.out.println("a) test the application current state");
		// below command would return app state - FOREGROUND or BACKGROUND
		System.out.println("CURRENT state of application: " + ((AndroidDriver) driver).queryAppState(currentPackage));
		System.out.println();
		
		
		// b) send application in background and the again capture the state.
		System.out.println("b) send application in background and then again capture the state");
		((AndroidDriver) driver).runAppInBackground(Duration.ofSeconds(-1));   //This will send the app to background indefinitely (until activated again)
		System.out.println("CURRENT state of application: " + ((AndroidDriver) driver).queryAppState(currentPackage));
		System.out.println();
		

	}

}

