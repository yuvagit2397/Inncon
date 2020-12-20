package httpMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostExample1 {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/api/register";
	Response post = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
			"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
			"    \"password\": \"pistol\"\r\n" + 
			"}").when().post("/api/register");
	String asString = post.getBody().asString();
	System.out.println(asString);
	int statusCode = post.getStatusCode();
	System.out.println(statusCode);
	
}
}
