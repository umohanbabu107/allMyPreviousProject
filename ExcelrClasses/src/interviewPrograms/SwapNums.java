package interviewPrograms;

public class SwapNums {

	public static void main(String[] args) {
		
		swap1();
		swap2();

	}

	// Write a programme to swap 2 numbers using 3rd variable

	public static void swap1() {
		int a = 10;
		int b = 40;
		int temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println(a);
		System.out.println(b);
	}
	
	
	// Write a programme to swap 2 numbers without using 3rd variable
	
	public static void swap2() {
		int a = 50; int b=60;
		a = a+b; // 110
		b = a-b; // 110 - 60 = 50
		a = a-b; // 110 - 50 = 60
		System.out.println(a);
		System.out.println(b);
	}
}
