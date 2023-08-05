package basicJava;

public class Access1 {
	
	// Creating Variables with the Access Specifier
	// Static variables - We can access with Classname.variablename in out side the class and outside the package
	public static int a = 10; //Public modifier -  We can access public modifier in the Project level, in same class directly, in different class Classname.variable name
	protected static int b = 20; // Protected modifier- We can access same class and same package, outside the package using in heritance
	private static int c = 30; // Private modifier -  We can access in same class only
	static int d = 40; // Default modifier - We can access same class directly and in other classes using classname.variable name
	
	//Non-Static variables : We can access only by creating a object for that class and obj.variables name
	public int n1 = 100;
	protected int n2 = 200;
	private int n3 = 300;
	int n4 = 400;
	
	public static void main(String[] args) { 
		System.out.println(a+b+c+d);
		
		Access1 obj = new Access1();
		System.out.println(obj.n1+obj.n2+obj.n3+obj.n4);
		
		
	}

}
