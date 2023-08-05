package interviewPrograms;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name to reverse: ");
		String name = sc.next();
		System.out.println(name);
		
		String dum = "";
		for(int i=(name.length())-1; i>=0;i--) {
			dum = dum+name.charAt(i);
		}
		
		System.out.println("Reversed name is :" + dum);
		
	}
	
	

}
