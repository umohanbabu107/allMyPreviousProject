package oops;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8,9,10};
		
		int[] ages = {23, 45, 121, 63, 44, 50, 21, 39, 45};
		int sum = 0;
		for(int num : ages) {
			sum = sum + num;
		}
		
		double avgAge = (double) sum/ages.length;
		
		System.out.println(sum);
		System.out.println(avgAge);
		

	}

}
