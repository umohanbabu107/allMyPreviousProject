package package1;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;


import chromedriver.DriverClass;

public class DropDownHandle extends DriverClass {

	public static void main(String[] args) throws Exception {
		String path = driverPath();
		Logger logger = Logger.getLogger(DropDownHandle.class);
		PropertyConfigurator.configure("C:\\Users\\hp\\eclipse-workspace\\Java_Selenium_Practic\\src\\logs\\AllLogs.logs");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromeDriver\\chromedriver_win32 (111)\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		 logger.debug("Sample debug message");  
	        logger.info("Sample info message");  
	        logger.warn("Sample warn message");  
	        logger.error("Sample error message");  
	        logger.fatal("Sample fatal message");  
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.name("birthday_day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));

		Select selectDate = new Select(date);
		selectDate.selectByIndex(5);

		Select selectMonth = new Select(month); 
		selectMonth.selectByVisibleText("Nov");

		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("1997");

		driver.close();

	}

}
