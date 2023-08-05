package TestNG;

public class Claculations {
	public static void main(String[] args) {
		power();
		intToString();
		int a=(int) Math.pow(2, 15);
		System.out.println(a);
	}
	
	public static void power() {
		double value = Math.pow(2, 4);
		int value1 = (int) value;
		System.out.println(value1);
	}
	
	public static void intToString() {
		int a = 1668762;
		String num = Integer.toString(a);
		for(int i=0; i<num.length(); i++) {
			System.out.println(num.charAt(i));
		}
	}

}
