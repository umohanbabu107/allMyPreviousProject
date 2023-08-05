package basicJava;

public class NonStaticVariable {
	public int a = 10; public int b=60;
	
	public static void main(String[] args) {
		NonStaticVariable obj = new NonStaticVariable();
		System.out.println(obj.a+obj.b);
	}

}
