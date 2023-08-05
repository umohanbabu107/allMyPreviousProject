package oops;

import basicJava.StaticVariable;

// Test class
public class Constructors2 {
	public static void main(String[] args) {
		Constructors1 obj = new Constructors1(1990, "BMW");
		System.out.println(obj.modelYear);
		System.out.println(obj.modelName);
		
	}
	
	public static void method4() {
		System.out.println(StaticVariable.publicNum1+StaticVariable.publicNum2);
		
	}

}
