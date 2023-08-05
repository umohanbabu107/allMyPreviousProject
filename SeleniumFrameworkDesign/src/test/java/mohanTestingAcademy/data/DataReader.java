package mohanTestingAcademy.data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {
	
	public List<HashMap<String,String>> getJsonDataToHashMap() throws IOException {
		// Java has FileUtils to Read Json data 
		String jsonContent = FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\test\\java\\mohanTestingAcademy\\data\\PurchaseOrder.json"), StandardCharsets.UTF_8);
		
		// Jackson plugin will use to convert String data into HashMap. For that we need to add Jackson Dependencies into pom.xml file
		
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
		});
		return data;
	}

}