package basicJava;

public class ConditionalStats {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 6;

		// If condition
		if (a < b) {
			System.out.println("A is less than B");
		}

		// If else codition

		if (a < b) {
			System.out.println("A is less than B");
		} else {
			System.out.println("A is not less than B");
		}
		
		// Switch
		switch (c){
		case 1:
			System.out.println("C value is 1");
			break;
		case 2:
			System.out.println("C value is 2");
			break;
		case 3:
			System.out.println("C value is 3");
			break;
		case 4:
			System.out.println("C value is 4");
			break;
		default :
			System.out.println("C value is out of range");
			break;
				
		}

	}

}
