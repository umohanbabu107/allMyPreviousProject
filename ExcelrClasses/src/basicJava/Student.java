package basicJava;

// Constructor without arguments

public class Student {
	
	Student(){
		System.out.println("This is a default constructor");
	}
	
	Student(int a){
		System.out.println("This is a constructor 2: "+ a);
	}
	
	public void method1() {
		System.out.println("This is a method");
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		Student s1 = new Student(24);
		s.method1();
		s1.method1();
		
	}

}
