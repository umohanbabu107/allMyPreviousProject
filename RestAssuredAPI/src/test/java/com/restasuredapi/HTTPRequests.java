package com.restasuredapi;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class HTTPRequests {
	
	public static int id;
	@Test(priority=1)
	public void getUsers() {
		
	/*
	 * given() keyword or method is used to set the pre conditions like content type, set cookies, add auth, add params, set headers into etc....
	   
	 * when() keyword/method is used to send the type of request like get, post, put, delete 
	 
	 * then() keyword/method is used to validate the results like status code, extract response, extract headless cookies and response body...
	 
	 */
		given()
		
		.when().get("https://reqres.in/api/users/2")
		
		.then().statusCode(200)
//			   .body("page", equalTo(2))
		   .log().all();
		
	}
	
	@Test(priority=2)
	public void createUser() {
		HashMap<String, String> data = new HashMap();
		data.put("name","Mohan");
		data.put("jOb", "Trainer");
		
		 id = given().contentType("application/json")
		        .body(data)
		 
		 
		 .when().post("https://reqres.in/api/users")
		 		.jsonPath().getInt("id");
		 
		/* .then().statusCode(201) 
		 		.log().all(); */
		 
	}
	
	@Test(priority=3, dependsOnMethods= {"createUser"})
	public void updateUser() {
		HashMap<String, String> data = new HashMap();
		data.put("name","Mohan1");
		data.put("jOb", "Trainer1");
		
		given().contentType("application/json")
				.body(data)
		
		.when().put("https://reqres.in/api/users/"+id)
		
		.then().statusCode(200)
			   .log().all();
		
	}
	
	@Test(priority=4)
	public void deleteUser() {
		given()
		
		.when().delete("https://reqres.in/api/users/"+id)
		
		.then().statusCode(204)
			   .log().all(); 
	}

}
