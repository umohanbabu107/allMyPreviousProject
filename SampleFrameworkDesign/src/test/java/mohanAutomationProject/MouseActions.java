package mohanAutomationProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	WebDriver driver;

	@BeforeMethod
	public void driverInitialize() {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.manage().window().maximize();

	}

	@Test
	public void search() throws InterruptedException {
		driver.get("https://www.myntra.com/");

		// To perform mouse actions like Hover, Right click, double click, drag and drop, click we will use Actions class

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//div[@class=\"desktop-query\"]/child::input"))).click().keyDown(Keys.SHIFT).sendKeys("computer glasses").build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
	}

	@Test(enabled=false)
	public void menu() {
	driver.get("https://www.myntra.com/");
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//nav[@class=\"desktop-navbar\"]/child :: div/child :: div[1]"))).click().build().perform();



	}
	@AfterMethod
	public void tearDown() {

		driver.close();

	}

}
