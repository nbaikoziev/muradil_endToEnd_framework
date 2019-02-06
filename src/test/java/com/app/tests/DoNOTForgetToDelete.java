package com.app.tests;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DoNOTForgetToDelete {
	@Test
	public void simpleGet() {
		String url = "http://34.223.219.142:1212/ords/hr/employees/";
		with().accept(ContentType.JSON)
		.when().get(url)
		.then().assertThat().statusCode(200)
		.and().contentType(ContentType.JSON)
		.and().body("first_name", Matchers.equalTo("Steven"))
		.and().body("employee_id", Matchers.equalTo(100));
		
		
		
		
	}
}
