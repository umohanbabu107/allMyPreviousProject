package basicJava;

import java.util.ArrayList;

public class CountNumberOfChars {
	
	public static void main(String[] args) {
		String name = "malayalam";
		
		ArrayList<Character> chars1 = new ArrayList<Character>();
		for(int i=0; i<name.length(); i++) {
			chars1.add(name.charAt(i));
		}
		int count = 1;
		for(int k=0; k<chars1.size(); k++) {
			for(int j=k+1; j<chars1.size(); j++) {
				if(chars1.get(k) == chars1.get(j)) { 
					count++;
					chars1.remove(chars1.get(k));
				}
				System.out.println(chars1.get(k)+ " : " + count);
			}
		}
	}

}
