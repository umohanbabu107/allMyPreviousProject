b package basicJava;

import java.util.*;

public class ToCharArray {
	public static void main(String[] args) {
		String name = "malayalam";
		char[] chars = name.toCharArray();
		
		for(int i=0; i<chars.length ; i++ ) {
			System.out.println(chars[i]);
		}
		
		HashSet<Character> chars1 = new HashSet<Character>();
		
		for(char char1 : chars) {
			chars1.add(char1);
		}
		System.out.println(chars1);
	}

}
