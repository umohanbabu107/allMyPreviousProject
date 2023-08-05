package seleniumBasics;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers for selinium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		// Total links
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Total links in a footer. For this, first we need to create a Footer webelement
		WebElement footer = driver.findElement(By.cssSelector(" div.navFooterVerticalColumn.navAccessibility"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		List<WebElement> footerColumn1 = driver.findElements(By.xpath("//div[@class='navFooterLinkCol navAccessibility']"));
		for (int i=0; i<footerColumn1.size(); i++) {
			String text = footerColumn1.get(i).findElement(By.className("navFooterColHead")).getText();
			System.out.println(text+ " has " + footerColumn1.get(i).findElements(By.tagName("a")).size()+ " links");
		}
 		
	}

}
