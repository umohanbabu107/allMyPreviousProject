package interviewPrograms;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numer: ");
		int num1 = sc.nextInt();
		System.out.println("Factorial of " + num1 + " is : " + factorial(num1));

	}

	// Factorial of a number
	public static int factorial(int num) {
		int fact = 1;
		for (int i = num; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}
}
