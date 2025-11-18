package AndroidDevice_Actions;

import java.util.List;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import projectUtils.AppiumDriverInitialization;

public class GetAppPerformanceData {
	
	@Test
	public void getAppPerData() {

		AppiumDriver driver = AppiumDriverInitialization.createAppiumDriver();
		List<String> allPackages = ((AndroidDriver) driver).getSupportedPerformanceDataTypes();

		System.out.println("All Package Name " + allPackages);
		// [cpuinfo, memoryinfo, batteryinfo, networkinfo]
		String currentPackage = ((AndroidDriver) driver).getCurrentPackage();
//		List<List<Object>> cpuInfo = ((AndroidDriver) driver).getPerformanceData(currentPackage, "cpuinfo", 10);
//
//		System.out.println(cpuInfo);

		List<List<Object>> MemoInfo = ((AndroidDriver) driver).getPerformanceData(currentPackage, "memoryinfo", 10);
		System.out.println(MemoInfo);

		List<List<Object>> batteryInfo = ((AndroidDriver) driver).getPerformanceData(currentPackage, "batteryinfo", 10);

		System.out.println(batteryInfo);

		List<List<Object>> networkInfo = ((AndroidDriver) driver).getPerformanceData(currentPackage, "networkinfo", 10);
		System.out.println(networkInfo);
	}

}
