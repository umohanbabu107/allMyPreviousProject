package testngLearning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class OGB_Tests{
	WebDriver driver;
	
	@BeforeMethod
	public void driverSetup() {
		System.setProperty("WebDriver.chrome.driver","C:\\Program Files\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//DesiredCapabilities cp = new DesiredCapabilities();
		//cp.setCapability(ChromeOptions.CAPABILITY, options);
		//options.merge(cp);
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(groups= {"SmokeTest"})
	public void gmailPageCheck() {
		driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/&ogbl\"]")).click();
		String expGmailProductName = "Gmail";
		String actGmailProductName = driver.findElement(By.xpath("//span[@class=\"mobile-before-hero-only\"]")).getText();
		System.out.println(actGmailProductName);
		Assert.assertEquals(actGmailProductName, expGmailProductName);
	}
	
	@Test(groups= {"SmokeTest"})
	public void imagesPageCheck() {
		driver.findElement(By.xpath("//a[@href=\"https://www.google.co.in/imghp?hl=en&ogbl\"]")).click();
		String expImagesProductName = "images";
		String actImagesProductName = driver.findElement(By.xpath("//span[@class=\"T8VaVe\"]")).getText();
		System.out.println(actImagesProductName);
		Assert.assertEquals(actImagesProductName, expImagesProductName);
	}
	
	@Test(groups= {"SanityTest"})
	public void selectSearchResult() throws InterruptedException {
		WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		searchBox.sendKeys("Ram charan");
		Thread.sleep(5);
		System.out.println("Mohan");
		ArrayList<WebElement> results = (ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='erkvQe']//li"));
		Thread.sleep(5);
		// results.get(0).click();
		System.out.println(results.size());
		for(WebElement result: results) {
			if(result.getText().contains("Ram Charan")) {
				result.click();
				break;
		}
		}
		}
		//System.out.println(results);
		
	@Test(groups= {"SanityTest"})
	public void enableDarkTheme() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='ayzqOc pHiOh']")).click();
		Thread.sleep(5);
		driver.findElement(By.xpath("//div[@class='y0fQ9c']")).click();
		}
	
	@Test(groups= {"RegTest"})
	public void appMenu() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='gb_e']")).click();
		Thread.sleep(3000);
		List<WebElement> apps = (ArrayList<WebElement>) driver.findElements(By.xpath("//li[@class='j1ei8c']"));
		Thread.sleep(3000);
		int appsCount = apps.size();
		System.out.println("Total apps in the apps munu: "+ appsCount);
		
	}
	
	@AfterMethod(enabled=true)
	public void tearDown() {
		driver.close();
	}
	
	

}
