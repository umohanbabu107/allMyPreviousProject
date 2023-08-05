package mohanTestingAcademy.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mohanTestingAcademy.AbstractComponents.AbstractComponent;

public class OrdersPage extends AbstractComponent {
	WebDriver driver;

	public OrdersPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="tr td:nth-child(3)")
	List<WebElement> ordersList;
	
	public Boolean verifyOrderDisplay(String productName) {
		Boolean match = ordersList.stream().anyMatch(product->product.getText().equalsIgnoreCase(productName));
		return match;
	}

}
