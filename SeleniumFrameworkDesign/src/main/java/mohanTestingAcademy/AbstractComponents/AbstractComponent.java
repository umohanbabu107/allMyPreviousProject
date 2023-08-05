package mohanTestingAcademy.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mohanTestingAcademy.pageobjects.CartProductsPage;

public class AbstractComponent {
	// We can call it as utilities class
	
	/*
	 * In this class we will create all the reusable code in the form of methods.
	 * These methods are independent of product
	 */
	WebDriver driver;

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "[routerlink*='cart']")
	WebElement cartButton;

	@FindBy(css = "[routerlink*='myorders']")
	WebElement ordersButton;

	public void waitForElementAppear(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}

	public void waitForElementAppear(WebElement findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}

	public void waitForElementDisappear(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}

	public CartProductsPage goToCartPage() {
		cartButton.click();
		CartProductsPage cartProds = new CartProductsPage(driver);
		return cartProds;
	}

	public void gotToOrdersPage() {
		ordersButton.click();
	}

}
