package basicJava;

public class StringAdd1 {
	public static void main(String[] args) {
		String name1 = "abc";
		String name2 = "pqrst";
		String name3 = ""; 
		
		for(int i=0; i<name1.length(); i++) {
			name3 = name3+name1.charAt(i);
			for(int j=i; j<name2.length(); j++) {
				name3 = name3+name2.charAt(j);
				break;
			}
		}
		if(name2.length()>name1.length())
		for(int k=name1.length();k<name2.length();k++) {
			name3 = name3+name2.charAt(k);
		}
		System.out.println(name3);

	}
}
