package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorldPopulation_Day1 {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
//		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromeDriver\\chromedriver_win32 (111)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/world-population/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		int i = 0;
		while(i<6) {
			
			String num = driver.findElement(By.xpath("//div[@class='maincounter-number']")).getText();
			System.out.println("Current world population: "+ num);
			String num1 = driver.findElement(By.xpath("//div[text()=\"Today\"]/parent::div//span[@rel='births_today']")).getText();
			System.out.println("Births today: "+ num1);
			String num2 = driver.findElement(By.xpath("//div[text()=\"Today\"]/parent::div//span[@rel='dth1s_today']")).getText();
			System.out.println("Deaths today: "+ num2 );
			String num3 = driver.findElement(By.xpath("//div[text()='This year']//parent::div//span[@rel='births_this_year']")).getText();
			System.out.println("Births this year: "+ num3);
			String num4 = driver.findElement(By.xpath("//div[text()='This year']//parent::div//span[@rel='dth1s_this_year']")).getText();
			System.out.println("Deaths this year: "+ num4);
			System.out.println("********************************************************************************");
			i++;
		}
		
		driver.close();

	}

}
