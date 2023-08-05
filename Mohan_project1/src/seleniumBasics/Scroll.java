package seleniumBasics;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers for selinium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Scroll page - To scroll the page we will use JavascriptExecutor method
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(2000);
		
		// To scroll a specific scroll bar in a table, we will use document.querySelector 
		js.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");
		
	}

}
