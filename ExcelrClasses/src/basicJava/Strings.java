package basicJava;

public class Strings {
	public static void main(String[] args) {
		String name = "Malayalam";
		String name1 = "Hello there";
		String dummy = "";
		dummy = dummy+"M";
		System.out.println(dummy);

		// String methods
		// 1. .length() method will return int
		System.out.println(name.length());
		
		// 2. .startsWith() method will return boolean value
		System.out.println(name.startsWith("M"));
		
		// 3. .endsWith() method will return boolean value
		System.out.println(name.endsWith("m"));
		
		//4. .toUppercase() .toLowercase() 
		//5. toCharArray() converts the string to new character array
		char[] chars = name.toCharArray();
		System.out.println(chars);
		// 6. split() method will split the string bassed on character given
		String[] splitName1 = name1.split(" ");
		System.out.println(splitName1[0]);
		
		// 7. contains() method
		System.out.println(name1.contains("llo"));
		
		// 8. concat() it will append two strings
		System.out.println(name1.concat(name));
		
		String A = "Mohan";
		String B = "QA";
		String C = "Engg";
		System.out.println(A.concat(B).concat(C));
		
		// 9. 
		System.out.println(!true);
		
		//10. equal and equalIgnoreCase
		String a = "Mohan QA Engg";
		String b = "Mohan qa Engg";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.isEmpty());
		
		// contains method
		System.out.println(a.contains("QA")); 
	
		// charAt method
		System.out.println(a.charAt(0));
		// indexOf
		System.out.println(a.indexOf('A', 8));
		
		// trim method - We are using this function to eliminate starting and ending spaces of the string 
		
		// replace - TO replace old character or Strings with new character or String
		
		String name2 = "Mohan";
		System.out.println(name2.replace('M', 'm'));
		// System.out.println(name2);
		name2.trim();
		
 	}
}
