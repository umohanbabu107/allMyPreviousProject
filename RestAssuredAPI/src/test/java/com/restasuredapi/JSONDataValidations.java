package com.restasuredapi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

public class JSONDataValidations {

	@Test
	public void dataValidations() {

		Response res = given().contentType(ContentType.JSON)

				.when().get("https://reqres.in/api/users/2");

		Assert.assertEquals(res.statusCode(), 200);

		// String fname = res.jsonPath().get("x.data.first_name").toString();

		JSONObject jo = new JSONObject(res.toString());
		String fname = null;
		for (int i = 0; i < jo.getJSONArray("data").length(); i++) {
			 fname = jo.getJSONArray("data").getJSONObject(i).get("first_name").toString();
			System.out.println(fname);
		}
		boolean status = false;
		if(fname.equals("Janet")) {
			status = true;
		}

	}

}
