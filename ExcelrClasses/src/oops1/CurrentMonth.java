package oops1;
// Method overriding
class Jan {
	public void roi(String month) {
		System.out.println("Rate of Intrest is 7.8%");
	}
}

class Feb extends Jan {
	public void roi(String month) {
		System.out.println("Rate of Intrest is 8.1%");
	}
}

class March extends Feb {
	public void roi(String month) {
		System.out.println("Rate of Intrest is 7.6%");
	}
}

public class CurrentMonth extends March {

	public static void main(String[] args) {
		
		March intrest = new March();
		intrest.roi("March"); 

	}

}
