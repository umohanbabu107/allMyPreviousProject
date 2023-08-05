package oops;

import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of an array: ");

		int[] nums = new int[sc.nextInt()];

		for (int i = 0; i < nums.length; i++) {

			nums[i] = sc.nextInt();

		}

		for (int i = 0; i < nums.length; i++) {

			System.out.print(nums[i] + " ");

		}

	}
}
