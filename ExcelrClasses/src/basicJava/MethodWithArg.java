package basicJava;

public class MethodWithArg {
	
	public static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void multiplication(int num1, int num2) {
		System.out.println(num1*num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(20, 25);
		add(40,50);
		add(50,69);
		
		MethodWithArg obj = new MethodWithArg();
		obj.multiplication(5, 6);
	}

}
