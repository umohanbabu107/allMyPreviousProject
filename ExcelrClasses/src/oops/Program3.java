package oops;

public class Program3 {
	
	// Assending order

	public static void main(String[] args) {
		
		reverse();
		
		int[] nums = { 1, 5, 0, 3, 4, 7 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}

			}
		}
		System.out.print("Sorted array: ");
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k]+ " ");
		}
	}
	
	// Reverse array
	public static void reverse() {
		int[] nums1 = { 1, 5, 0, 3, 4, 7 };
		System.out.println("Reverse array is: ");
		for (int i = nums1.length-1; i>=0; i--) {
			System.out.print(nums1[i]+ " ");
			
		}
	}

}
