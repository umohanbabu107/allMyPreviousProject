package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClass {
	public void parentMethod() {
		System.out.println("Hi, this is a Parent Method");
	}
	@BeforeMethod
	public void firstMethod() {
		System.out.println("I will run first");
	}
	
	@AfterMethod
	public void lastMethod() {
		System.out.println("I will run last");
	}

}
