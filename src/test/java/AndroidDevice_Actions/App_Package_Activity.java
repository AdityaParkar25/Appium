package AndroidDevice_Actions;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtils.AppiumDriverInitialization;

public class App_Package_Activity {
	
	
	@Test
	public void testPackageActivityCommands() throws InterruptedException {
		
		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		
		// below command would return current package/URL of apps
		String currentPackage = ((AndroidDriver)driver).getCurrentPackage();
		System.out.println("Current Package: "+currentPackage);
		
		// below command would return app state - FOREGROUND or BACKGROUND
		System.out.println("Current state of app: "+ ((AndroidDriver)driver).queryAppState(currentPackage));
		
		
		// this will terminate app process in manager
		((AndroidDriver)driver).terminateApp(currentPackage);
		Thread.sleep(2000);
		System.out.println("Current state of app: "+ ((AndroidDriver)driver).queryAppState(currentPackage));
		
	}

}
