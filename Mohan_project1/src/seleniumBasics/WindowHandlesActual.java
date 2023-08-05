package seleniumBasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesActual {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Drivers for selinium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> footer = driver.findElements(By.cssSelector("div.navFooterLinkCol.navAccessibility"));
		for(int i=0; i<footer.size(); i++) {
			if(footer.get(i).findElement(By.xpath("//div[@class = 'navFooterColHead']")).getText() == "Get to Know Us") {
				List<WebElement> Links = footer.get(i).findElements(By.tagName("a"));
				for(int j=0;j<Links.size();j++) {
					Links.get(j);
				}
			}
			
			
		}
		
		
	}

}
