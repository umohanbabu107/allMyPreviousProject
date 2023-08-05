package testngLearning;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GreenKartTest {
	WebDriver driver;
	@BeforeMethod
	public void driverSetup() {
		System.setProperty("WebDriver.chrome.driver","C:\\Program Files\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void itemsOrder() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] requiredPro = { "Cucumber", "Brinjal", "Mushroom"};
		java.util.List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		for (int i = 0; i < productNames.size(); i++) {
			String actualProName = productNames.get(i).getText();
			String[] actualProName2 = actualProName.split(" -");
			String actualProName3 = actualProName2[0];
			java.util.List<String> requiredPro2 = Arrays.asList(requiredPro);
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
