package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	public static String properties() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\properties\\Webdriver.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		return browserName;
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(properties());
	}

}
