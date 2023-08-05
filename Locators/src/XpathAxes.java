import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathAxes {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromeDriver\\chromedriver_win32 (111)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//self
		String tataInvestment = driver.findElement(By.xpath("//a[contains(text(), 'Tata Investment')]/self::a")).getText();
		System.out.println(tataInvestment);
		
		//parent
		String text = driver.findElement(By.xpath("//a[contains(text(), 'Tata Investment')]/parent::td")).getText();
		System.out.println(text);
		
		//ancestor - Select all ancestors (parents, grand parent, etc ....)
		String ancestor = driver.findElement(By.xpath("//a[contains(text(), 'Tata Investment')]/ancestor::tr")).getText();
		System.out.println(ancestor);
		
		//descendant - Select all descendants(children, drandchildren etc....)
		List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(), 'Tata Investment')]/ancestor::tr/descendant::*"));
		System.out.println(descendants.size());
		
		// Following - Selects everything after self node
		List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(), 'Tata Investment')]/ancestor::tr/following::tr"));
		System.out.println(following.size());
		
		//following-siblings 
		List<WebElement> followingSiblings = driver.findElements(By.xpath("//a[contains(text(), 'Tata Investment')]/ancestor::tr/following-sibling::tr"));
		System.out.println(followingSiblings.size());
		
		// preceding
		List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(), 'Tata Investment')]/ancestor::tr/preceding::tr"));
		System.out.println(preceding.size());
		
		//preceding-sibling
		List<WebElement> precedingSibling = driver.findElements(By.xpath("//a[contains(text(), 'Tata Investment')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println(precedingSibling.size());
		
		
		
		driver.close();

	}
}
