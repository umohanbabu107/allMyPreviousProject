package testngLearning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	@DataProvider
	public Object[][] getData() {
		//Initialize an object class 
		Object[][] data = new Object[3][2]; // This represents the data matrix
		// Create first data set
		data[0][0] = "firstusername"; // This is the first element in the first row
		data[0][1] = "firstpassword"; // THis is the second element in the first row
		
		// Create 2nd data set
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		 
		//Create 3rd data set
	    data[2][0] = "thirdusername";
	    data[2][1] = "thirdpassword";
	    return data;
 	}
	
	@Test(dataProvider = "getData")
	public void logIn(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	

}
