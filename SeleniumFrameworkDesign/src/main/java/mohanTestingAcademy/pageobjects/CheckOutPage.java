package mohanTestingAcademy.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mohanTestingAcademy.AbstractComponents.AbstractComponent;

public class CheckOutPage extends AbstractComponent {

	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[placeholder = 'Select Country']")
	WebElement countryField;

	@FindBy(xpath = "(//button[contains(@class, 'ta-item')])[2]")
	WebElement countryOption;
	
	By countryResults = By.xpath("//section[contains(@class, 'ta-results')]");

	public void selectCountry(String countryName) {
		Actions act = new Actions(driver);
		act.sendKeys(countryField, countryName).build().perform();
		waitForElementAppear(countryResults);
		countryOption.click();
	}
	
	public ConfirmationPage submitOrder() {
		WebElement submit = driver.findElement(By.cssSelector(".action__submit"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", submit);
		return new ConfirmationPage(driver);
	}
	
	
}
