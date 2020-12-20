package httpMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutReq {
	public static void main(String[] args) {
    RestAssured.baseURI="https://reqres.in";
    Response put = RestAssured.given().header("Content-Type", "application/json").body("{\r\n" + 
    		"    \"name\": \"paanai\",\r\n" + 
    		"    \"job\": \"zion resident\"\r\n" + 
    		"}").when().put("/api/users/2");
    
    String asString = put.getBody().asString();
    int statusCode = put.getStatusCode();
    System.out.println(asString);
    System.out.println(statusCode);
	}
}
