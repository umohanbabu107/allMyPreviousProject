package basicJava;

public class Methods {
	
	static int a1 = 1;
	int b1 = 2;
	
	// Creating Static Method
	 public static void m1() {
		int a = 20; int b=30;
		System.out.println(a+b);
		Methods obj = new Methods();
		
		System.out.println(a1+obj.b1);
	}
	
	// Creating not static method
	
	public void m2() {
		int a = 10; int b = 40;
		System.out.println(a*b);
		System.out.println(a1+b1); // We can access non static variable into non static method directly
	}
	
	
	public static void main(String[] args) {
		m1();
		
		Methods obj = new Methods();
		obj.m2();
		m1();
		
	}

}
