package seleniumBasics;
 
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Drivers for selinium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//DesiredCapabilities cp = new DesiredCapabilities();
		//cp.setCapability(ChromeOptions.CAPABILITY, options);
		//options.merge(cp);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	// Store all the links in a List
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert s = new SoftAssert();
		
	for(WebElement link : links) {
		String url = link.getAttribute("href");
		// Using openConnection() method get all the response codes of above links
		// openConnection() method belongs to URL Class, so first we have to create a object of that url class
		HttpURLConnection connc = (HttpURLConnection)new URL(url).openConnection();
		connc.setRequestMethod("HEAD");
		connc.connect();
		int respCode = connc.getResponseCode();
		System.out.println(respCode);
		s.assertTrue(respCode<400, link.getText()+" is broken");
 		
		//System.out.println(url);
	}
	s.assertAll();
	driver.close();
	}

}
