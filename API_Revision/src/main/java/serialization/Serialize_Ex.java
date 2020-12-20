package serialization;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Serialize_Ex {
	public static void main(String[] args) {
		//https://reqres.in/api/users
		RestAssured.baseURI="https://reqres.in";
		
		Sample_serialize ss=new Sample_serialize();
		ss.setName("senthil");
		ss.setJob("leader");
		
		Response post = RestAssured.given().header("Content-Type","application/json").
				body(ss).when().post("/api/users");
		int code = post.getStatusCode();
		System.out.println(code);
		String body = post.getBody().asString();
		System.out.println(body);
		
	}

}
