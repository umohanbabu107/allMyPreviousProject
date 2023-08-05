package basicJava;

public class Loops {
	public static void main(String[] args) {
		// for loop
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		// Nested for loop
		
		for(int j = 0; j<3; j++) {
			for(int k = 0; k<3; k++) {
				for(int l=0; l<3;l++) {
					System.out.println(j +"--"+k+"--"+l);
				}
			}
		}
		
		// While loop
		
		int n=0;
		while(n<5) {
			System.out.println("n is "+n);
			n++;
		}
	}

}
