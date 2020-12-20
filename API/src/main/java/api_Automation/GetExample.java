package api_Automation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetExample {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in";
	//https://reqres.in/api/users?page=2
	Response rp = RestAssured.given().queryParam("page", "2").header("Content-Type","application/json").when().get("/api/users");
	int statusCode = rp.getStatusCode();
	System.out.println(statusCode);
	String body = rp.getBody().asString();
	System.out.println(body);
}
}
