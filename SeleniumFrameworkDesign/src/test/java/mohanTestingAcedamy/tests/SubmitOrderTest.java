package mohanTestingAcedamy.tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mohanTestingAcademy.TestComponents.BaseTest;
import mohanTestingAcademy.pageobjects.CartProductsPage;
import mohanTestingAcademy.pageobjects.CheckOutPage;
import mohanTestingAcademy.pageobjects.ConfirmationPage;
import mohanTestingAcademy.pageobjects.OrdersPage;
import mohanTestingAcademy.pageobjects.ProductCatalogPage;

public class SubmitOrderTest extends BaseTest {
	
	String productName = "ZARA COAT 3";

	@Test(dataProvider = "getData", groups = {"PurchaseOrder"})
	public void submitOrder(String email, String password, String productName) throws IOException, InterruptedException{
		
		
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		/*Create abstract component object for accessing all the reusable methods like
		Waits */
		// AbstractComponent abstractComponent = new AbstractComponent(driver);

		/*For this we have created a Page object with Action methods and we have used
		them here */
		
		/* We have created ProductCatalog page object for finding the prodcuts from the
		website */
		ProductCatalogPage productCatalog = landingPage.loginApplication(email, password); 
		List<WebElement> products = productCatalog.getProductsList();
		productCatalog.addProductToCart(productName);
	
		CartProductsPage cartProds = productCatalog.goToCartPage();;
		boolean match = cartProds.checkCartProducts(productName);
		Assert.assertTrue(match);
		
		CheckOutPage checkOutPage = cartProds.checkOut();
		checkOutPage.selectCountry("India");
		
		ConfirmationPage confirmationPage = checkOutPage.submitOrder();
		String confirmMessage = confirmationPage.confirmOrder();
		System.out.println(confirmMessage);
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		
	}
	
	@Test(dataProvider = "getDataHashMap", groups = {"PurchaseOrder1"})
	public void submitOrder1(HashMap<String,String> input) throws IOException, InterruptedException{
		
		String productName = input.get("product");
	
		ProductCatalogPage productCatalog = landingPage.loginApplication(input.get("email"), input.get("password")); 
		List<WebElement> products = productCatalog.getProductsList();
		productCatalog.addProductToCart(productName);
	
		CartProductsPage cartProds = productCatalog.goToCartPage();;
		boolean match = cartProds.checkCartProducts(productName);
		Assert.assertTrue(match);
		
		CheckOutPage checkOutPage = cartProds.checkOut();
		checkOutPage.selectCountry("India");
		
		ConfirmationPage confirmationPage = checkOutPage.submitOrder();
		String confirmMessage = confirmationPage.confirmOrder();
		System.out.println(confirmMessage);
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	}
	
	@Test(dataProvider = "getDataJson", groups = {"PurchaseOrder2"})
	public void submitOrder2(HashMap<String,String> input) throws IOException, InterruptedException{
		
		String productName = input.get("product");
	
		ProductCatalogPage productCatalog = landingPage.loginApplication(input.get("email"), input.get("password")); 
		List<WebElement> products = productCatalog.getProductsList();
		productCatalog.addProductToCart(productName);
	
		CartProductsPage cartProds = productCatalog.goToCartPage();;
		boolean match = cartProds.checkCartProducts(productName);
		Assert.assertTrue(match);
		
		CheckOutPage checkOutPage = cartProds.checkOut();
		checkOutPage.selectCountry("India");
		
		ConfirmationPage confirmationPage = checkOutPage.submitOrder();
		String confirmMessage = confirmationPage.confirmOrder();
		System.out.println(confirmMessage);
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	}
	
	@Test(dependsOnMethods="submitOrder")
	public void orderHistoryTest() {
		ProductCatalogPage productCatalog = landingPage.loginApplication("umohanbabu123@gmail.com", "Mohan@107");
		OrdersPage ordersPage = new OrdersPage(driver);
		ordersPage.gotToOrdersPage();
		boolean match = ordersPage.verifyOrderDisplay(productName);
		Assert.assertTrue(match);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {{"umohanbabu123@gmail.com", "Mohan@107", "ZARA COAT 3"},{"anshika@gmail.com", "Iamking@000", "ADIDAS ORIGINAL"}};
	}
	
	// Data provide using HashMap 
	@DataProvider
	public Object[][] getDataHashMap(){
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("email", "umohanbabu123@gmail.com");
		map1.put("password", "Mohan@107");
		map1.put("product", "ZARA COAT 3");
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("email", "anshika@gmail.com");
		map2.put("password", "Iamking@000");
		map2.put("product", "ADIDAS ORIGINAL");
		
		return new Object[][] {{map1}, {map2}};
	}
	
	@DataProvider
	public Object[][] getDataJson() throws IOException {
		List<HashMap<String, String>> data = getJsonDataToHashMap(System.getProperty("user.dir")+"\\src\\test\\java\\mohanTestingAcademy\\data\\PurchaseOrder.json");
		
		return new Object[][] {{data.get(0)}, {data.get(1)}}; 
	}
	
}

