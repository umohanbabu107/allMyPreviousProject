package JavaPrograms;

public class StringCaseChange {
	public static void main(String[] args) {
		stringCaseChange();
		dictionaryOrder();

	}

	public static void stringCaseChange() {
		String s1 = "hello";
		String s2 = "java";
		char c1 = s1.toUpperCase().charAt(0);
		char c2 = s2.toUpperCase().charAt(0);

		String new_s1 = s1.replace(s1.charAt(0), c1);
		String new_s2 = s2.replace(s2.charAt(0), c2);

		System.out.println(new_s1 + " " + new_s2);
		System.out.println('H' + 0);
		System.out.println('W' + 0);
	}

	public static void dictionaryOrder() {
		String name = "Wello Horld";
		String[] words = name.split(" ");
		int num1 = words[0].charAt(0) + 1;
		int num2 = words[1].charAt(0) + 1;

		if (num1 < num2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
 }
