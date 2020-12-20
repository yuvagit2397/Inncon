package api_Automation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POST_Example {
	public static void main(String[] args) {
		//https://reqres.in/api/users

		RestAssured.baseURI="https://reqres.in";
		Response post = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
				"		    \"name\": \"morpheus\",\r\n" + 
				"		    \"job\": \"leader\"\r\n" + 
				"		}").when().post("/api/users");
		
		
		
		int sc = post.getStatusCode();
		System.out.println(sc);
		String postBdy = post.getBody().asString();
		System.out.println(postBdy);
		
		/*{
		    "name": "morpheus",
		    "job": "leader"
		}*/
	}

}
