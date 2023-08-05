package oops1;

interface Software{
	public void startDate();
	public void endDate();
	public void fee();
	
}

interface Software1{
	public void subjects();
}

interface Software2 extends Software{
	public void yoga();
}

class School1 implements Software, Software1 { // Multiple interface
	public void startDate() {
		System.out.println("24th June");
	}
	
	public void endDate() {
		System.out.println("24th March");
	}
	
	public void fee() {
		System.out.println("30000");
	}
	
	public void sports() {
		System.out.println("Cricket, Vollyball");
	}

	public void subjects() {
		System.out.println("Commerce, Science");
		
	}

}

class School2 implements Software{
	public void startDate() {
		System.out.println("14th June");
	}
	
	public void endDate() {
		System.out.println("14th March");
	}
	
	public void fee() {
		System.out.println("50000");
	}
}

public class Interfaces{
	public static void main(String[] args) {
		Software s1= new School1();
		s1.startDate(); s1.endDate(); s1.fee();
		
		School1 ss1 = new School1();
		ss1.sports(); ss1.subjects();
		
		
		Software s2 = new School2();
		s2.startDate(); s2.endDate(); s2.fee();
	}
}