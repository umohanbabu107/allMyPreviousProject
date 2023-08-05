package mohanTestingAcademy.stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mohanTestingAcademy.TestComponents.BaseTest;
import mohanTestingAcademy.pageobjects.CartProductsPage;
import mohanTestingAcademy.pageobjects.CheckOutPage;
import mohanTestingAcademy.pageobjects.ConfirmationPage;
import mohanTestingAcademy.pageobjects.LandingPage;
import mohanTestingAcademy.pageobjects.ProductCatalogPage;

public class StepdefinitionImplementation extends BaseTest {
	public LandingPage landingPage;
	public ProductCatalogPage productCatalog;
	public ConfirmationPage confirmationPage;
	
	@Given("I landed on Ecommerce page")
	public void i_landed_on_Ecommerce_Page() throws IOException {
		
		landingPage = launchApplication();
		
	}
	
	@Given("^Logged in with username (.+) and password (.+)$")
	public void logged_in_with_username_and_password(String username, String password) {
		productCatalog = landingPage.loginApplication(username, password);
	}
	
	@When("^I add product (.+) to cart$")
	public void i_add_product_to_cart(String productName) {
		List<WebElement> products = productCatalog.getProductsList();
		// WebElement ele = productCatalog.getProductByName(productName);
		productCatalog.addProductToCart(productName);
		
		
	}
	
	// @And("^Checkout product (.+) and submit the order$")
	@When("^Checkout product (.+) and submit the order$")
	public void checkout_product_and_submit_the_order(String productName) {
		
		CartProductsPage cartProds = productCatalog.goToCartPage();;
		boolean match = cartProds.checkCartProducts(productName);
		Assert.assertTrue(match);
		
		CheckOutPage checkOutPage = cartProds.checkOut();
		checkOutPage.selectCountry("India");
		confirmationPage = checkOutPage.submitOrder();
		
	}
	
	@Then("{string} message is displayed on Confirmation page")
	public void confirmation_Message(String string) {
		String confirmMessage = confirmationPage.confirmOrder(); 
		Assert.assertTrue(confirmMessage.equalsIgnoreCase(string));
	}

	
	

}
