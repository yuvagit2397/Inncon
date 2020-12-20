package httpMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRec1 {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in";
		Response response = RestAssured.given().header("Content-Type","application/json").when().get("/api/users/2");
	    String resBody = response.getBody().asString();
	    int statusCode = response.getStatusCode();
	    System.out.println(statusCode);
	    System.out.println(resBody);
	
	}
}
