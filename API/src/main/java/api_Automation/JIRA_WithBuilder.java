package api_Automation;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class JIRA_WithBuilder {
public static void main(String[] args) {
	PreemptiveBasicAuthScheme scheme=new PreemptiveBasicAuthScheme();
	scheme.setUserName("senthilsj1305@gmail.com");
	scheme.setPassword("Jczsa5cq8x3mddCKOvgmF35E");
	
	RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://senthilautomation123.atlassian.net")
			.setContentType(ContentType.JSON).setAuth(scheme).build();
	
	ResponseSpecification reqPost = new ResponseSpecBuilder().expectStatusCode(201).
			expectContentType(ContentType.JSON).build();
	
	ResponseSpecification reqPut = new ResponseSpecBuilder().expectStatusCode(204).
	expectContentType(ContentType.JSON).build();
	
	/*Output o = RestAssured.given().log().all().spec(req).body(PayLod.createIssue()).when()
	.post("/rest/api/2/issue").then().log().all().spec(reqPost).extract().response().as(Output.class);
	System.out.println(o.getId());
	System.out.println(o.getKey());
	System.out.println(o.getSelf());*/
	
	Response response = RestAssured.given().log().all().spec(req).body(PayLod.updateIssue()).when().
	put("rest/api/2/issue/FAC-8").then().log().all().statusCode(204).extract().response();
}
}
