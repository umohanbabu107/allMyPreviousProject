package TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics3 {
	@AfterClass
	public void afClass() {
		System.out.println("This will be executed after last method of TestngBasics3 class");
	}
	
	@AfterMethod
	public void afMethod() {
		System.out.println("This will execute after every TestngBasics3 methods");
	}
	@AfterTest
	public void afTest() {
		System.out.println("This will be executed after the test ");
	}
	
	@Test
	public void testCase4() {
		System.out.println("testCase4");
	}
	
	@BeforeTest
	public void bfTest() {
		System.out.println("This will be executed before test");
	}
	
	@Test
	public void testCase5() {
		System.out.println("testCase5");
	}
	
	@Test
	public void testCase6() {
		System.out.println("testCase6");
	}

}
