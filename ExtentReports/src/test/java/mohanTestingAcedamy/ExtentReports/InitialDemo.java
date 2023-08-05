package mohanTestingAcedamy.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitialDemo {
	
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
		// Java has ExtentSparkReporter, ExtentReports classes to create a Extent reports for test scripts
		// 1. Create reporter object using ExtentSparkReporter class to configure the Extent reports 
		String path = System.getProperty("user.dir")+ "//Reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		// 2. Create a extent object to attache the reporter to the extent object and then we can use that extent object the test scripts
		extent = new ExtentReports();  
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mohan");

	}
	
	@Test
	public void getTitlePass() {
		
		ExtentTest test = extent.createTest("getTitlePass");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		Assert.assertEquals("Google", title);
		driver.close();
		extent.flush();
		
	}
	
	@Test
	public void getTitleFail() {
		ExtentTest test = extent.createTest("getTitleFail");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		Assert.assertEquals("google", title);
		driver.close();
		test.fail("Result did not matched");
		extent.flush();
		
		
	}

}
