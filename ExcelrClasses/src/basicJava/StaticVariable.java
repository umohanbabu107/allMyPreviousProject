package basicJava;

public class StaticVariable {
	static int staticNum1 = 20;
	static int staticNum2 = 30;
	public static int publicNum1 = 40;
	public static int publicNum2 = 50;
	
	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		System.out.println(staticNum1 + staticNum2+publicNum1);
	}

}
