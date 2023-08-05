package package1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TakeScreeshot {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromeDriver\\chromedriver_win32 (111)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		File file = sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\hp\\eclipse-workspace\\Java_Selenium_Practic\\screenshots\\Google.png"));
		
		driver.findElement(By.xpath("//a[contains(text(), 'Images')]")).click();
		TakesScreenshot sc1 = (TakesScreenshot) driver;
		File file1 = sc1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1, new File("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\Java_Selenium_Practic\\\\screenshots\\\\Images.png"));
		
		driver.findElement(By.xpath("//div[@class=\"gb_o\"]")).click();
		
		TakesScreenshot sc2 = (TakesScreenshot) driver;
		File file2 = sc2.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file2, new File("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\Java_Selenium_Practic\\\\screenshots\\\\Appmenu.png"));
		
		
		driver.close();
		

	}

}
