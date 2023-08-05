package seleniumBasics;
import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class HandlingDrodowns2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Drivers for selinium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// latestDropdown(driver);
		// dynamicDropdown(driver);
		autosuggestiveDropdown(driver);
		driver.close();
	}

	// This method is to work on latest dropdown
	public static void latestDropdown(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		// We wnat to click 4 times to select 4 audults
		Thread.sleep(2000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}
	
	// Handling dynamic dropdown

	static void dynamicDropdown(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='VTZ']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getText());
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='VGA'])[2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());
	}
	
	// Handling auto suggestive drop down 

	static void autosuggestiveDropdown(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		ArrayList<WebElement> options = (ArrayList<WebElement>) driver
				.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		System.out.println(options);
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("autosuggest")).getText());
	}

}
