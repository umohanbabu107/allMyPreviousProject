package basicJava;

public class Swapping {
	public static void main(String[] args) {
		// Swap two sentences
		String name1 = "I am Mohan";
		String name2 = "I am Ungati";
		
		String dummy = "Dummy";
		dummy=name1;
		name1=name2;
		name2=dummy;
		
		System.out.println(name1);
		System.out.println(name2);
		
		// Swap two numbers
		int a=10;
		int b=20;
		
		int temp = 1;
		
		temp = a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
	}

}
