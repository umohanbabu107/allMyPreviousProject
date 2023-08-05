package interviewPrograms;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num to reverse: ");
		int num = sc.nextInt();
		int temp = num;
		System.out.println(num);

	
		int reverse = 0; int remainder;
		while(num !=0){
			// 234
			remainder = num%10; // 4;3;
			reverse = reverse*10 + remainder ; // 0+4; 
			num = num/10; // 23
		}

		System.out.println("Reversed num is : " + String.valueOf(reverse));

	}

}
