package TestNG;

public class Class4 {
	static int a;
	
	public Class4(int a) {
		this.a = a;
	}
	// Reusable or Utilities for multiplication
	public static int multiplyTwo() {
		a = a * 2;
		return a;
	}
	
	public static int multiplyThree() {
		a = a * 3;
		return a;
	}
}
