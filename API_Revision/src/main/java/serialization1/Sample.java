package serialization1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Sample {
public static void main(String[] args) {
	//https://reqres.in/api/login
	RestAssured.baseURI="https://reqres.in";
	
	ReqBodyPojo bodyPojo=new ReqBodyPojo();
	bodyPojo.setEmail("eve.holt@reqres.in");
	bodyPojo.setPassword("cityslicka");
	
	Response post = RestAssured.given().header("Content-Type","application/json").
	body(bodyPojo).when().post("/api/login");
	
	System.out.println(post.getBody().asString());
}
}
