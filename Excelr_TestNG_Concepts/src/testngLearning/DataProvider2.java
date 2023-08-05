package testngLearning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	@DataProvider
	public Object[][] getData2(){
		// Create Object using Object[][] class 
		Object[][] data1 = new Object[3][2]; 
		//create data to iterate through the test case
		data1[0][0] = 1;
		data1[0][1] = 2;
		
		data1[1][0] = 3;
		data1[1][1] = 4;
		
		data1[2][0] = 5;
		data1[2][1] = 6;
		
		return data1;
		
	}
	
	@Test(dataProvider = "getData2")
	public void testCase1(int a, int b) {
		int c = a + b;
		System.out.println("Sum of two numbers is "+c);
	}

}
