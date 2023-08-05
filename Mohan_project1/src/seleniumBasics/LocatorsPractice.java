package seleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers for selinium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		FindElementByXpath(driver);
		driver.close();	
	}
	
	public static void FindElementByXpath(WebDriver driver) throws InterruptedException {
		// Below ones are kind of absolute Xpaths
		System.out.println(driver.findElement(By.xpath("//div/a/button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//div/button[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//div/button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//div/button[2]")).getText());
		//Relative Xpaths
		System.out.println(driver.findElement(By.xpath("//*[@id='radio-btn-example']/fieldset/legend")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@class='left-align']/fieldset/label[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@class='left-align']/fieldset/label[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@class='left-align']/fieldset/label[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id='select-class-example']/fieldset/legend")).getText());
		driver.findElement(By.cssSelector("input[id='autocomplete']")).sendKeys("Hello");
		Thread.sleep(5000);

	}

}
