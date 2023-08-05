package mohanTestingAcedamy.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import mohanTestingAcademy.TestComponents.BaseTest;
import mohanTestingAcademy.TestComponents.Retry;
import mohanTestingAcademy.pageobjects.CartProductsPage;
import mohanTestingAcademy.pageobjects.ProductCatalogPage;

public class ErrorValidationsTest extends BaseTest {
	
	@Test(groups="ErrorHandling", retryAnalyzer=Retry.class)
	public void logInErrorValidation() {
		landingPage.loginApplication("uohanbabu123@gmail.com", "Mohan@107");
		String expectedText = landingPage.getErrorMessage();
		System.out.println(expectedText);
		Assert.assertEquals("Incorrect email  password.", expectedText); // Removed or in Incorrect email  password. to fail thi test intentionally
	}
	
	@Test
	public void orderErrorValidation() {
		
		String productName = "ZARA COAT 3";
		ProductCatalogPage productCatalog = landingPage.loginApplication("umohanbabu123@gmail.com", "Mohan@107"); 
		List<WebElement> products = productCatalog.getProductsList();
		productCatalog.addProductToCart(productName);
	
		CartProductsPage cartProds = productCatalog.goToCartPage();;
		boolean match = cartProds.checkCartProducts("ZARA COAT 3");
		Assert.assertTrue(match);
	}

}
