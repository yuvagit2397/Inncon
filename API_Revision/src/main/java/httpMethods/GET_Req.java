package httpMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_Req {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in";
	Response response = RestAssured.given().queryParam("page", "2").headers("Content-Type","application/json").when().get("/api/users");
	int statusCode = response.getStatusCode();
	System.out.println(statusCode);
	String jsonBody = response.getBody().asString();
    System.out.println(jsonBody);
}
}
