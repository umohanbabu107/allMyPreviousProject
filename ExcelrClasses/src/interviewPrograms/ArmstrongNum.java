package interviewPrograms;

import java.util.Scanner;
// Sum of digits of powers is equal to same number than it is a Armstrong number;
public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int num = sc.nextInt();
		String num1 = String.valueOf(num);
		int power = num1.length();
		int temp = num;

		double count = 0;
		int remainder;
		while (num != 0) {
			remainder = num % 10; 
			count = count + Math.pow(remainder, power); 
			num = num / 10;
		}

		if(count == temp) {
			System.out.println("This number is an Armstrong number");
		}else {
			System.out.println("This number is not an Armstrong number");
		}
	}

}
 