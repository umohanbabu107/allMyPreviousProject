package interviewPrograms;

import java.util.Scanner;

public class SwapNums1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int a = sc.nextInt();
		System.out.println("Enter a num: ");
		int b = sc.nextInt();
		
		a = a + b; // 110
		b = a - b; // 110 - 60 = 50
		a = a - b; // 110 - 50 = 60
		System.out.println(a);
		System.out.println(b);
	}

}
