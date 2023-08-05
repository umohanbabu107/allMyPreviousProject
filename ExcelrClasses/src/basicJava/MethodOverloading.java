package basicJava;

public class MethodOverloading {

	public static void launchResult(int rollnumber) {

		System.out.println("Result will open with Rollnumber: " + rollnumber);

	}

	public static void launchResult(String DOB, String lastName) {

		System.out.println("Result will open with DOB and last name: " + DOB + ", " + lastName);

	}

	public static void launchResult(String stuName) {
		System.out.println("Result will open with for: " + stuName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		launchResult(123456);
		launchResult("Mohan");
		launchResult("6th Nov 1996", "Ungati");

	}

}
