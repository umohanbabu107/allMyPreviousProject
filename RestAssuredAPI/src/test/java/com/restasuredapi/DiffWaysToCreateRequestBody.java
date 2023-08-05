package com.restasuredapi;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;


/* Differnt ways to create a post request body
 * 1. Using Hashmap
 * 2. Using org.JSON
 * 3. Using POJO(Page Old Java Object) class
 * 4. Using JSON external libraries
 */


public class DiffWaysToCreateRequestBody {
	public static int id;
	//@Test
	public void createDataUsingHashmap() {
		HashMap data = new HashMap();
		data.put("name", "Mohan");
		data.put("job", "Trainer");
		data.put("phone", "12345");
		String coursesArr[] = {"C", "C++"};
		data.put("courses", coursesArr);
		
		
		given().contentType("application/json")
		       .body(data)
		
		.when().post("https://reqres.in/api/users")
		      
		
		.then().statusCode(201)
		       .body("name", equalTo("Mohan"))
		       .body("job", equalTo("Trainer"))
		       .body("phone", equalTo("12345"))
		       .body("courses[0]", equalTo("C"))
		       .body("courses[1]", equalTo("C++"))
		       .header("Content-Type", "application/json; charset=utf-8")
		       .log().all();
		
	}
	
	//@Test
	public void createPostRequestBodyUsingJsonLibrary() {
		JSONObject data = new JSONObject();
		data.put("name","Mohan2");
		data.put("location", "Hyd");
		data.put("job", "QA");
		
		given().contentType("application/json")
			   .body(data.toString())
		
		.when().post("https://reqres.in/api/users")
		
		.then().statusCode(201)
		       .body("name",equalTo("Mohan2"))
		       .body("location", equalTo("Hyd"))
		       .body("job",equalTo("QA"))
		       .log().all();
	}
	
	@Test
	public void createPostRequestBodyUsingPOJOClass() {
		
		Pojo_PostRequest data = new Pojo_PostRequest();
		data.setName("Mohan3");
		data.setJob("QA");
		data.setLocation("Hyd");
		
		given().contentType("application/json")
		       .body(data)
		       
		.when().post("https://reqres.in/api/users")
		
		.then().statusCode(201)
		       .body("name",equalTo("Mohan3"))
		       .body("location", equalTo("Hyd"))
		       .body("job", equalTo("QA"))
		       .log().all();
		
		
	}
	
	//@Test
	public void createPostRequestBodyUsingExternalJsonFIle() throws FileNotFoundException {
		File f = new File(".\\data.json");
		
		FileReader fr = new FileReader(f);
		
		JSONTokener jt = new JSONTokener(fr);
		
		JSONObject data = new JSONObject(jt);
		
		given().contentType("application/json")
		       .body(data.toString())
		       
		.when().post("https://reqres.in/api/users")
		       
		.then().statusCode(201)
		       .body("name", equalTo("Mohan4"))
		       .body("location", equalTo("Hyd"))
		       .body("job", equalTo("QA"))
		       .log().all();
	}
	

}
