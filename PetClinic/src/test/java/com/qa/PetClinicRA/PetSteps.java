package com.qa.PetClinicRA;

import org.junit.Ignore;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PetSteps {

	private Response response;
	private RequestSpecification request;
	public JSONObject owner = new JSONObject();
	
	JSONArray petArray = new JSONArray();

	JSONArray visitArray = new JSONArray();

	@Test
	@Ignore
	public void test() {
		JSONArray petArray = new JSONArray();

		JSONArray visitArray = new JSONArray();

		RestAssured.baseURI = "http://10.0.10.10:9966/petclinic/api/owners";

		Map<String, Object> emptyPet = new HashMap<>();

		Map<String, Object> visitOne = new HashMap<>();

		visitOne.put("date", "yyyy/MM/dd");
		visitOne.put("description", "string");
		visitOne.put("id", 0);
		visitOne.put("pet", emptyPet);
		visitArray.add(visitOne);
	}
	
	@Test
	@Ignore
	public void testOne() {
		Map<String, Object> petOne = new HashMap<>();

		Map<String, Object> petType = new HashMap<>();
		
		Map<String, Object> emptyOwner = new HashMap<>();

		petType.put("id", 0);

		petType.put("name", "String");

		petOne.put("birthDate", "2018-07-27T09:02:40.767Z");
		petOne.put("id", 0);
		petOne.put("name", "String");
		petOne.put("owner", emptyOwner);
		petOne.put("type", petType); // needs nested type TODO
		petOne.put("visits", visitArray); // needs nested type TODO

		petArray.add(petOne);
	}
	
	@Test
	@Ignore
	public void testTwo() {
		JSONObject ownerOne = new JSONObject();

		ownerOne.put("address", "Manchester");
		ownerOne.put("city", "This is a test");
		ownerOne.put("firstName", "ANTHIA");
		ownerOne.put("id", 10);
		ownerOne.put("lastName", "String");
		ownerOne.put("pets", petArray);
		ownerOne.put("telephone", "1234567891");


		given().contentType(ContentType.JSON).body(ownerOne).when().post("/").then().statusCode(201);

		System.out.println(ownerOne.toString());
	}
	
	@Test
	@Ignore
	public void seeAllOwner() {
		request = given().contentType(ContentType.JSON);
		response = request.get("http://10.0.10.10:9966/petclinic/api/owners");
		System.out.println("response: " + response.prettyPrint());
	}
	
	@Test
	@Ignore
	public void selectOwnerByLastName() {
		request = given().contentType(ContentType.JSON);
		response = request.get("http://10.0.10.10:9966/petclinic/api/owners/*/lastname/oguns");
		System.out.println("response: " + response.prettyPrint());
	}
	
	@Test
	@Ignore
	public void selectOwnerByID() {
		request = given().contentType(ContentType.JSON);
		response = request.get("http://10.0.10.10:9966/petclinic/api/owners/1");
		System.out.println("response: " + response.prettyPrint());
	}
	
	@Test
	@Ignore
	public void deleteOwner() {
		request = given().contentType(ContentType.JSON);
		response = request.delete("http://10.0.10.10:9966/petclinic/api/owners/27");
	}
	
	
	
	
}
