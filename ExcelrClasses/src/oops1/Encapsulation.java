package oops1;

public class Encapsulation {
	
	private String name;
	private int age;
	// Set the values to the private variables using set method
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name1) {
		this.name = name1;
	}
	
	public void setAge(int age1) {
		this.age = age1;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.age);
		System.out.println(obj.name);
		obj.setAge(26);
		obj.setName("Mohan");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		
	}

}
