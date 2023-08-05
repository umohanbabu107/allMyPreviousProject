package seleniumBasics;
import java.util.ArrayList;

public class Streams1 {
	public static void main(String[] args) {
		//Filter names starts with A from a list
		
		// filterNames();
		streamFilter();
	}
	
	static void filterNames() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aadya");
		names.add("Mohan");
		names.add("America");
		names.add("Akhil");
		names.add("Ram");
		int count = 0;
		for (String name : names) {
			if (name.startsWith("A")) {
				System.out.println(name);
				count++;
				
			}
			
		}
		System.out.println(count);
	}
	
	static void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aadya");
		names.add("Mohan");
		names.add("America");
		names.add("Akhil");
		names.add("Ram");
		// Filtering using streams
		//1. Create a stream
		names.stream().filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));
		Long a = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(a);
		
	}
	
	

}
