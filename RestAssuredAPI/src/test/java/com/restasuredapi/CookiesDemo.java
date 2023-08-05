package com.restasuredapi;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.apache.http.protocol.ResponseServer;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesDemo {
	
	@Test(priority=0)
	public void cookies() {
		given()
		
		.when().get("https://www.google.com/")
		
		.then().log().cookies();
	}
	
	@Test(priority=1)
	public void getCookies() {
		Response res = given()
		
		.when().get("https://www.google.com/");
		
		Map<String, String> all_cookies = res.getCookies();
		
		for(Map.Entry m : all_cookies.entrySet()) {
			System.out.println(m.getKey()+ " : " + m.getValue());
		}
	}

}
