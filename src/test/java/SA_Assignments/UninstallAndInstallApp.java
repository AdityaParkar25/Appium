// 3. a) Uninstall the app (any sample app)
//    b) Install the app using command

package SA_Assignments;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtils.AppiumDriverInitialization;

public class UninstallAndInstallApp {

	@Test
	public void testApplicationState() throws InterruptedException {

		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();

		// below command would return current package/URL of apps
		String currentPackage = ((AndroidDriver) driver).getCurrentPackage();
		System.out.println("CURRENT Package: " + currentPackage);
		System.out.println();

		// a) Uninstall the app (any sample app)
		System.out.println("a) Uninstall the app (any sample app)");
		((AndroidDriver) driver).removeApp(currentPackage);
		System.out.println("CURRENT state of Application: " + ((AndroidDriver) driver).queryAppState(currentPackage));
		System.out.println();

		// b) Install the app using command
		System.out.println("b) Install the app using command");
		((AndroidDriver) driver).installApp("A:\\StarAgile\\MODULES\\WebDriver\\Aditya_SeleniumWorkspace\\AppiumTest\\src\\test\\resources\\ApiDemos-debug.apk");
		((AndroidDriver) driver).activateApp(currentPackage);
		System.out.println("Is the Application installed: " + ((AndroidDriver) driver).isAppInstalled(currentPackage));
		System.out.println("CURRENT state of Application: " + ((AndroidDriver) driver).queryAppState(currentPackage));
		System.out.println();

	}

}

