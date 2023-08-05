package basicJava;

public class MethodOverloading1 {
	
	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public static void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(20, 30);
		add(60, 40, 100);
		add(20, 30, 50);
		
	}

}
