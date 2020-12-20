package api_Automation;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_Chaining {
public static void main(String[] args) throws ParseException {
	RestAssured.baseURI="https://reqres.in";
	//https://reqres.in/api/users
	Response post = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
			"    \"name\": \"senthil\",\r\n" + 
			"    \"job\": \"leader\"\r\n" + 
			"}").when().post("/api/users");
	
	int sc = post.getStatusCode();
	System.out.println(sc);
	String postBdy = post.getBody().asString();
	System.out.println(postBdy);
	
	JSONParser p=new JSONParser();
	Object o = p.parse(postBdy);
	
	JSONObject jo=(JSONObject) o;
	String name = (String) jo.get("name");
	
	
	Response put = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
			"    \"name\": \""+name+"\",\r\n" + 
			"    \"job\": \"Manager\"\r\n" + 
			"}").when().put("/api/users");
	System.out.println(put.getBody().asString());
	
	
	Response update = RestAssured.given().header("Content-Type","application/json").body(
			PayLod.updateUser(name, "leader")).when().put("/api/users");
	System.out.println(update.getBody().asString());
	
	
	
}
}
