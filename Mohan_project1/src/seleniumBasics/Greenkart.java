package seleniumBasics;
import java.util.Arrays;
import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Drivers for selinium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		//Implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Explicit wait
		//WebDriverWait w = new WebDriverWait(driver,5);		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		String[] requiredPro = { "Cucumber", "Brinjal", "Mushroom"};
		List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		for (int i = 0; i < productNames.size(); i++) {
			String actualProName = productNames.get(i).getText();
			String[] actualProName2 = actualProName.split(" -");
			String actualProName3 = actualProName2[0];
			List requiredPro2 = Arrays.asList(requiredPro);
			if (requiredPro2.contains(actualProName3)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==requiredPro.length)
					break;
			}

		}
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		// Thread.sleep(2000);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Place Order']")));
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		// Thread.sleep(2000);
		
		WebElement webElement = driver.findElement(By.xpath("//div//div//div//div//select"));
		Select countryDropdown = new Select(webElement);
		countryDropdown.selectByValue("India");
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.close();
		
	}

}
