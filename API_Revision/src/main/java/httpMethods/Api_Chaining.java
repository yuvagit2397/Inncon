package httpMethods;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import groovy.json.JsonParser;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Api_Chaining {
	public static void main(String[] args) throws ParseException {
		// https://reqres.in/api/users
		RestAssured.baseURI = "https://reqres.in";
		Response post = RestAssured.given().headers("Content-Type", "application/json")
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}").when()
				.post("/api/users");
		int statusCode = post.getStatusCode();
		String body = post.getBody().asString();

		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(body);
		
		JSONObject jsonObject=(JSONObject) parse;
		
		String name = (String) jsonObject.get("name");
		
		Response put = RestAssured.given().headers("Content-Type", "application/json").body("{\r\n" + 
				"    \"name\": \""+name+"\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}").when().put("/api/users");
		
		int statusCode2 = put.getStatusCode();
		System.out.println(statusCode2);
		String putBody = put.getBody().asString();
		System.out.println(putBody);
		
		

	}
}
