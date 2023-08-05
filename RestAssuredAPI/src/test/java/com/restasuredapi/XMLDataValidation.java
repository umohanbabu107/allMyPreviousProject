package com.restasuredapi;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

// Swagger url : http://restapi.adequateshop.com/swagger/ui/index

// 

public class XMLDataValidation {
	
	@Test
	public void XMLDataValidtion() {
	
		Response res = given().contentType(ContentType.JSON)
	
	.when().get("http://restapi.adequateshop.com/api/Traveler?page=1");
		
		XmlPath xmlobj = new XmlPath(res.asString());
		
		List<String> data = xmlobj.getList("TravelerinformationResponse.travelers.Travelerinformation.name");
		
		boolean status = false;
		
		/*for(String name1 : data) {
			System.out.println(name1);
		}
	*/
		System.out.println(data.size());
		
		for(String name: data) {
			if(name.equals("Developer")) {
				status = true;
				break;
			}
		}
		
		Assert.assertEquals(status, true);
	
	}
}
