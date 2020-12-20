package httpMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetExample1 {
	public static void main(String[] args) {
     RestAssured.baseURI="https://reqres.in";
     Response response = RestAssured.given().header("Content-Type","application/json").when().get("/api/unknown/2");
     int code = response.getStatusCode();		 
	System.out.println(code);
	String body = response.getBody().asString();
	System.out.println(body);
	}
}
