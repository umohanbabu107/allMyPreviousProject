package seleniumBasics;

//Step1: Import selenium webdriver libraries

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Project_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Step2: Create a path for webdriver
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers for selinium\\chromedriver_win32 (1)\\chromedriver.exe"); //Chrome
		//System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Drivers for selinium\\geckodriver-v0.31.0-win64\\geckodriver.exe"); //Firefox
		System.setProperty("webdriver.edge.driver", "C:\\Program Files\\Drivers for selinium\\edgedriver_win64\\msedgedriver.exe"); // Edge
		
//Step3: Create a driver object
		
		//WebDriver driver = new ChromeDriver(); // For Chrome
		//WebDriver driver = new FirefoxDriver();//For Firefox
		WebDriver driver = new EdgeDriver();
//Step4: Write a code to automate website
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
