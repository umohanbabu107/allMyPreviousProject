package oops1;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {

	public static void main(String[] args) {
		
		ArrayList l = new ArrayList<>();
		
		l.add("Mohan");
		l.add(107);
		l.add(12.33f);
		l.add(true);
		l.add(12.45);
		l.add('M');
		l.remove(2);
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		
		System.out.println(l);

	}

}
