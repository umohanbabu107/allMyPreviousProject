package basicJava;

import java.util.Arrays;
import java.util.List;

public class SplitMethod {
	
	public static void main(String[] args) {
		String a = "Mohan QA Java and Selenium Classes";
		String b = "ExcelR Solution Bangalore";
		String c = "Manas QA Java and Selenium abc CLasses xyz BTM Layout 123";
		
		reverseString();
		// Print each name from the above strings
		
		String[] arr = a.split(" ");
		List arr1 = Arrays.asList(arr);
		System.out.println(arr1);
		System.out.println(arr.length);
		for (String name : arr) {
			System.out.println(name);
		}
		for (int i = arr.length - 1; i > 0; i--) {
			System.out.print(arr[i] + " ");
		}

		String[] names = c.split(" ");
		for (String name2 : names) {
			if (name2.length() == 3) {
				System.out.println(name2);
			}
		}
	}
	// Reverse string
		public static void reverseString() {
			String d = "Mohan";
			String rev = "";
			String[] chars = d.split("");
			System.out.println(d.charAt(4));
			for(int i=chars.length-1; i>=0;i--){
				rev = rev+chars[i];
		}
			System.out.println(rev);
	}
}
