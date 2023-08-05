package TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngBasics1 {
	@BeforeSuite
	public void bfSuite() {
		System.out.println("This will execute before the SUite");
	}
	
	@BeforeMethod
	public void bfMethod() {
		System.out.println("This will execute before every TestngBasics1 menthods");
	}
	@Test
	public void testCase1() {
		System.out.println("Hello");
	}
	
	@Test
	public void testCase2() {
		System.out.println("Bye");
	}
	
}
