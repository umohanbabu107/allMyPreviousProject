 package TestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngBasics2 {
	
	@BeforeClass
	public void bfClass() {
		System.out.println("This will be execute before the first method of TestngBasics2 class");
	}
	
	@Test
	public void testCase3() {
		System.out.println("Hey"); 
	}
	
	@AfterSuite
	public void afSuite() {
		System.out.println("This will be executed after the suite");
	}

}
