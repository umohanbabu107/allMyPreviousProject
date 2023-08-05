package com.restasuredapi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HeadersDemo {
	
	@Test
	public void headersDemo() {
		
		given() 
		
		.when().get("https://www.google.com/")
		
		.then().log().headers();
		
	}

}
