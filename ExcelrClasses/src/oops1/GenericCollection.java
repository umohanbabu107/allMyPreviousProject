package oops1;

import java.util.ArrayList;

public class GenericCollection {

	public static void main(String[] args) {
		
		ArrayList<String> sList = new ArrayList<String>(); // Generic collection
		
		sList.add("Apple");
		sList.add("Bat");
		sList.add("Cat");
		sList.add("Dog");
		
		System.out.println(sList);
		
		ArrayList<Integer> iList = new ArrayList<Integer>();
		iList.add(1);
		iList.add(2);
		iList.add(3);
		iList.add(4);
		
		System.out.println(iList);
	}

}
