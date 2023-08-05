package TestNG;

public class Class3 extends Class4{
	int a;
	
	public Class3(int a) {
		super(a);
		this.a=a;
	}
// Reusable method or Utilities
	public int increment() {
		a = a+1;
		return a;
	}
// Reusable methods or Utilities
	public int decrement() {
		a= a-1;
		return a;
	}
	
	public static void main(String[] args) {
		Class3 c = new Class3(4);
		System.out.println(c.increment());
		System.out.println(c.decrement());
		System.out.println(multiplyTwo());
		System.out.println(multiplyThree());
	}

}
