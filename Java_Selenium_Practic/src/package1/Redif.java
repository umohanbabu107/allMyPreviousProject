package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redif {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromeDriver\\chromedriver_win32 (111)\\chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();
	driver.findElement(By.xpath("(//input[contains(@name, 'name')])[1]")).sendKeys("Mohan");
	
}
}
 