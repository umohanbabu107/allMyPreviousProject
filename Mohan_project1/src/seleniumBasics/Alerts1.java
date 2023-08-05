package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Drivers for selinium\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--remote-allow-origins=*");
		//DesiredCapabilities cp = new DesiredCapabilities();
		//cp.setCapability(ChromeOptions.CAPABILITY, options);
		//options.merge(cp);
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Mohan");
		driver.findElement(By.xpath("//div//fieldset//input[@id='alertbtn']")).click();
		System.out.println("M1");
		// System.out.println(driver.findElement(By.xpath("//div//fieldset//input[@id='alertbtn']")).getText());
		System.out.println("M2");
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("M3");
		driver.close();
	}

}
