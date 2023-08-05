 package interviewPrograms;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();

		int count = 0;
		int remainder;
		while (num != 0) {
			// 234
			remainder = num % 10; // 4;3;
			count = count + remainder; // 0+4;
			num = num / 10; // 23
		}

		System.out.println("Sum of digits : " + String.valueOf(count));
	}
}
