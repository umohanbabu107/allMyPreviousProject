package TestNG;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass {
	@Test
	public void test1() {
		parentMethod();
		Class3 obj = new Class3(3);
		System.out.println(obj.increment());
		System.out.println(obj.decrement());
		System.out.println((obj.multiplyTwo()));
		System.out.println(obj.multiplyThree());
	}
}
