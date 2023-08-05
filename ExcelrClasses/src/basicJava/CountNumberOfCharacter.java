package basicJava;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CountNumberOfCharacter {
	public static void main(String[] args) {
		countChars();
		String name = "Malayalam";
		//ArrayList<Character> chars = new ArrayList<Character>();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		HashSet<Character> hs = new HashSet<Character>();
		for (int i = 0; i < name.length(); i++) {
			hs.add(name.charAt(i));
		}

		ArrayList<Character> chars = new ArrayList<Character>(hs);
		System.out.println(chars);

		for (int j = 0; j < chars.size(); j++) {
			int count = 0;
			for (int k = 0; k < name.length(); k++) {
				if (chars.get(j) == name.charAt(k)) {
					count++;
				}
			}
			hm.put(chars.get(j), count);
		}
		System.out.println(hm);
	}
// Char count without collections
	public static void countChars() {
		String text = "Malayalam";
		String dummy = "";
		for(int i=0; i<text.length(); i++) {
			String sChar = Character.toString((text.charAt(i)));
			//String sChar = ""+(text.charAt(i));
			if(!(dummy.contains(sChar))) {
				dummy = dummy+sChar;
			}
		}
		for(int j=0; j<dummy.length(); j++) {
			
			int count = 0;
			for(int k =0; k<text.length();k++) {
				if(dummy.charAt(j)==text.charAt(k)) {
					count++;
				}
			}
			System.out.println(dummy.charAt(j)+" count is "+count);
		}
	}
}
