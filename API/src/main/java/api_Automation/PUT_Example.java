package api_Automation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PUT_Example {
public static void main(String[] args) {
	//https://reqres.in/api/users/2
	RestAssured.baseURI="https://reqres.in";
	Response post = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
			"    \"name\": \"paanai\",\r\n" + 
			"    \"job\": \"zion resident\"\r\n" + 
			"}").when().put("/api/users/2");
	int sc = post.getStatusCode();
	System.out.println(sc);
	String putBdy = post.getBody().asString();
	System.out.println(putBdy);
}
}
