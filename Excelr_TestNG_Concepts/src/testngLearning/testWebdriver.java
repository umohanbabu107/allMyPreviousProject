package testngLearning;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class testWebdriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		// Firefox driver invoking
		// System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Drivers for selinium\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//DesiredCapabilities cp = new DesiredCapabilities();
		//cp.setCapability(ChromeOptions.CAPABILITY, options);
		//options.merge(cp);
				
		//WebDriver driver = new FirefoxDriver(); 
		WebDriver driver = new ChromeDriver(options);
		
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}

}
