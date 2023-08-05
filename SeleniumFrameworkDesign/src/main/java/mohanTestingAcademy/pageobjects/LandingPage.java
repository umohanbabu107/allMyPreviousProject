  package mohanTestingAcademy.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mohanTestingAcademy.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// This is one method to Store web element
	// WebElement usermail = driver.findElement(By.id("userEmail"));

	// PageFactory is the another method to assign WebElements 
	@FindBy(id = "userEmail")
	WebElement userEmail;

	@FindBy(id = "userPassword")
	WebElement passwordEle;

	@FindBy(id = "login")
	WebElement submit;
	
	
	@FindBy(css="[class*='flyInOut']")
	WebElement errorToast;

	public ProductCatalogPage loginApplication(String email, String password) {
		userEmail.sendKeys(email);
		passwordEle.sendKeys(password);
		submit.click();
		ProductCatalogPage productCatalog = new ProductCatalogPage(driver);
		return productCatalog;

	}
	
	
	public String getErrorMessage() {
		waitForElementAppear(errorToast);
		String errorMessage = errorToast.getText();
		return errorMessage;
	}
}
