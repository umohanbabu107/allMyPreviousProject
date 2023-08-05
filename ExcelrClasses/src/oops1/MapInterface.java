package oops1;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "A");
		hm.put(102, "B");
		hm.put(103, "C");
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+ " : "+ m.getValue());
		}

	}

}
