package oops;

public class ArrayClass2 {
	public static void main(String[] args) {
		int[] arr = {23, 5, 6,7,23,78,75, 85, 90};
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		for (int num : arr) {
			System.out.print(num+ " ");
		}
		
		String[] s = {"A", "B", "C", "D", "E"};
		for(String name : s) {
			System.out.println(name+ ",");
		}
		
	}

}
