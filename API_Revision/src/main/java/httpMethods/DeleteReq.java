package httpMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteReq {
	public static void main(String[] args) {
		// https://reqres.in/api/users/2
		RestAssured.baseURI = "https://reqres.in";
		Response delete = RestAssured.given().header("Content-Type", "application/json").when().delete("/api/users/2");
		System.out.println(delete.getStatusCode());
		
	}
}
