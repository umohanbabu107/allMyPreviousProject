package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReusableMethods {
	public WebDriver driver;
	public void launchApp(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\chromeDriver\\chromedriver_win32 (111)\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void tearDown() {
		driver.close();
	}

}
