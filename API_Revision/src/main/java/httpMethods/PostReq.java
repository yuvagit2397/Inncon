package httpMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostReq {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";
		Response post = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}").when().post("/api/users");
		String asString = post.getBody().asString();
		System.out.println(asString);
		int statusCode = post.getStatusCode();
		System.out.println(statusCode);
	}
}
