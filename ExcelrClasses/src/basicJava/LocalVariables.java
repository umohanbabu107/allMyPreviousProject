package basicJava;

public class LocalVariables {
	public static void main(String[] args) {
		m1();
		m2();
	}
	
	public static void m1() {
		//Creating local variables - Scope of Local variable is under same method. We can re use variable name in the other method. 
		int a = 20; int b = 30;
		System.out.println(a+b);
	}
	
	public static void m2() {
		int a = 40; int b = 50;
		System.out.println(a+b);
	}
}
