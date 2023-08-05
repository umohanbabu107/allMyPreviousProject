 package basicJava;

public class StringsPracticeProblem {
	
	public static void main(String[] args) {
		String a = "abcd";
		String b = "xyz";
		String c = "abcd xyz klmn 1234 4567";
		
		//Req:5 7th position in a c variable should be y or z and k should be available in the either 10th or 11th positions
		
		if((((((c.charAt(7) == ('y'))) || ((c.charAt(7) == ('z')))) && ((('k') == c.charAt(9)) || (('k') == c.charAt(10)))))) {
			System.out.println("Pass");
		}
		else {
				System.out.println("Fail");
			}
			
		}
	}


