package oops1;

// Multilevel inheritance

class GrandParents{
	public void lands() {
		System.out.println("Lands");
	}
}

class Parents1 extends GrandParents{
	public void gold() {
		System.out.println("Gold");
	}
}


public class Children extends Parents1 {

	public static void main(String[] args) {
		
	}

}
