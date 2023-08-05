package mohanTestingAcademy.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mohanTestingAcademy.AbstractComponents.AbstractComponent;

public class CartProductsPage extends AbstractComponent {
	WebDriver driver;

	public CartProductsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".cartSection h3")
	List<WebElement> cartProducts;

	@FindBy(css = ".totalRow button")
	WebElement checkout;

	public Boolean checkCartProducts(String cartProd) {
		Boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(cartProd));
		return match;

	}

	public CheckOutPage checkOut() {
		waitForElementAppear(checkout);
		checkout.click();
		CheckOutPage placeOrder = new CheckOutPage(driver);
		return placeOrder;
	}

}
