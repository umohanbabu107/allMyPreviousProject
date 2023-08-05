package seleniumBasics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles1 {

	public WindowHandles1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='https://about.google/?hl=en-US']")
	static WebElement about;

	@FindBy(xpath="//a[@href='https://careers.google.com/']")
	static WebElement careers;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://www.google.com/travel/");
		
		driver.findElement(By.xpath("//a[@href='https://about.google/?hl=en-US']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator itr = handles.iterator();
		String parentId = (String) itr.next();
		String childId = (String) itr.next();
		
		driver.switchTo().window(childId);
		driver.findElement(By.xpath("//a[@class = 'cookieBarButton cookieBarConsentButton']")).click();
		
		driver.findElement(By.xpath("//a[@href='https://careers.google.com/']")).click();
		
		
		driver.switchTo().window(parentId);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@href='https://about.google/?hl=en-US']"))));
		
		driver.findElement(By.xpath("//a[@href='https://policies.google.com/privacy?hl=en-US&ved=2ahUKEwjk6dmNpuD9AhWi4tQKHZtYC74Q9eUDegQIAxAC']")).click();
	}
}
