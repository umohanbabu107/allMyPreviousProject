package seleniumBasics;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import properties.Configuration;

public class Alerts_Frames extends Configuration {
	@Test
	public void frames() throws IOException {
		WebDriver driver = null;
		String browser = properties();
		
		if(browser == "chrome") {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		}
		else if(browser == "firefox")
		{
			
			System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Drivers for selinium\\geckodriver-v0.32.2-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browser == "edge") {
			System.setProperty("webdriver.edge.driver", "C:\\Program Files\\Drivers for selinium\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		
		// We can switch to frame using name, id, index, xpath of that iframe
		// Switch to frame using iframe name
		//driver.switchTo().frame("iframeResult");
		
		// Switch to frame using xpath
		WebElement w = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(w);
		
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(w));*/
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		
		
		// driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		driver.close();
		
	}

}
