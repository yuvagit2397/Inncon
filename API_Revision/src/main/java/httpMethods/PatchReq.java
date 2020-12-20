package httpMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PatchReq {
	public static void main(String[] args) {
			//https://reqres.in
		RestAssured.baseURI="https://reqres.in";
		Response patch = RestAssured.given().headers("Content-Type","application/json").body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}").when().patch("/api/users/2");
		int statusCode = patch.getStatusCode();
		System.out.println(statusCode);
		String asString = patch.getBody().asString();
		System.out.println(asString);
	}
}
