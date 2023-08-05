package seleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.http.ConnectionFailedException;
import org.openqa.selenium.chrome.ChromeDriver;

public class seliniumWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Invoking browser
// Chrome - ChromeDriver > It has some Methods > We can use them 
// Firefox - FirefoxDriver > It has some Methods > We can use them
// Edge - EdgeDriver > It has some Methods > We can use them
// Safari - SafariDriver > It has some Methods > We can use them
// ChromeDriver driver = new ChromeDriver(); // this driver is only for Chrome browser, it won't work on other browsers
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Drivers for selinium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}

}
