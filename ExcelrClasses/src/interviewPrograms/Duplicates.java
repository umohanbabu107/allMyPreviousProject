package interviewPrograms;

public class Duplicates {
	
	// Duplicate numbers
	public static void dupNums() {
		int[] nums = {1,1, 2,2,3,3};
		
		System.out.print("\n" + "Duplicate nums: ");
		for(int i = 0; i<nums.length; i++) {
			for(int j=i+1; j< nums.length; j++) {
				if(nums[i] == nums[j]) {
					System.out.print(nums[i] + " ");
				}
			}
		}
		
	}
	
	// Duplicate nums
	
	public static void dupChars() {
		String name = "mmjjkk";
		String dup = "";
		
		for(int i=0; i<name.length(); i++) {
			String c = Character.toString(name.charAt(i));
			if(!(dup.contains(c))){
				
				dup = dup + c;
			}
		}
		System.out.print("Dup chars are: ");
		for(int j=0; j<dup.length(); j++) {
		System.out.print(dup.charAt(j)+ " ");
		}
	}
	
	public static void main(String[] args) {
		dupChars();
		dupNums();
	}

}
