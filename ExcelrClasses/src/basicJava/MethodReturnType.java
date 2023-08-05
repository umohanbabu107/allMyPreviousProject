package basicJava;

public class MethodReturnType {
	
	public static void m1() {
		System.out.println("Method1 is not returning any value.");
	}
	
	public static int m2() {
		int a = 1; int b = 3; int c = a+b;
		return c;
	}
	
	public static String m3(String name) {
		String name1 = name;
		
		return name1; 
	}
	


	public static void main(String[] args) {
	
		m1();
		System.out.println(m2());
		System.out.println(m3("Mohan"));

	}

}
