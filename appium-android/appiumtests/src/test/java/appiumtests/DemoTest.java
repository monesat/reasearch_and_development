package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class DemoTest {
	
	static AppiumDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy S20+ 5G");
		cap.setCapability("uuid", "R5CN307MEJR");
		cap.setCapability("automationName", "UIAutomator2");
		cap.setCapability("newCommandTimeout", "3000");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, cap);
		System.out.println("Application started...");
		System.out.println(driver.getPageSource());
		
		for (int i=0; i<1000; i++)
		{
			driver.findElement(By.id("calc_keypad_btn_01")).click();
			driver.findElement(By.id("calc_keypad_btn_clear")).click();
			TimeUnit.SECONDS.sleep(2);
		}
	}

}
