package AppiumClasses.AppiumClasses;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Base {
	
	@Test
	public void Configuration() throws MalformedURLException {
		
		//This is Local server port url. We will use this parameter while creating the AndroidDriver object. 
		URL url = new URL("http://127.0.0.1:4723");
		
		// Using UiAutomator2Options, we will configure app.
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 5 API 31");
		options.setApp(System.getProperty("user.dir")+"AppiumClasses/resources/ApiDemos-debug.apk");
		
		
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();
	}

}
