package resourses;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Configurations {
	public static WebDriver driver;


	public static WebDriver properties() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resourses\\Driver.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					"C:\\Program Files\\Drivers for selinium\\FirefoxDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Program Files\\Drivers for selinium\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		properties();
		driver.get("https://www.myntra.com/");
		// driver.get("https://www.myntra.com/");
		// To perform mouse actions like Hover, Right click, double click, drag and
		// drop, click we will use Actions class

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//div[@class=\"desktop-query\"]/child::input"))).click()
				.keyDown(Keys.SHIFT).sendKeys("computer glasses").build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);

		driver.close();

	}

}
