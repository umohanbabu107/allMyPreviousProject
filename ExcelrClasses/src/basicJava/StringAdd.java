package basicJava;

public class StringAdd {

	public static void main(String[] args) {
		String name1 = "abcde";
		String name2 = "pqr";
		int length = name1.length() + name2.length();
		char[] nameChars = new char[length];
		String name3 = "";
		System.out.println(nameChars.length);
		int j = 0;
		for (int i = 0; i < name1.length(); i++) {
			nameChars[i + j] = name1.charAt(i);
			j++;
		}
		System.out.println(nameChars);
		int l = 1; 
		for (int k = 0; k < name2.length(); k++) {
			nameChars[k + l] = name2.charAt(k);
			l++;
		}
		
		System.out.println(nameChars);

		for (char c : nameChars) {
			name3 = name3 + c;
		}
		System.out.println(name3);
	}
}
