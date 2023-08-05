package chromedriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverClass {
	
	public static String driverPath() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Java_Selenium_Practic\\src\\chromedriver\\driver.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String driverPath = pro.getProperty("chrome111");
		
		return driverPath;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(driverPath());
	}

}
