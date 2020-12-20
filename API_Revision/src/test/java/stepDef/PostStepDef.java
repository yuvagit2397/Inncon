package stepDef;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostStepDef {
	RequestSpecification reqspec;
	Response res;

		@Given("add the JIRA to creat payload")
		public void add_the_jira_to_creat_payload() {
			PreemptiveBasicAuthScheme scheme=new PreemptiveBasicAuthScheme();
			scheme.setUserName("senthilsj1305@gmail.com");
			scheme.setPassword("Jczsa5cq8x3mddCKOvgmF35E");
			
			reqspec=new RequestSpecBuilder().setBaseUri("https://senthilautomation123.atlassian.net")
			.setContentType(ContentType.JSON).setAuth(scheme).build();
			
		}



		@When("user should call the JIRA create issue using post request")
		public void user_should_call_the_jira_create_issue_using_post_request() {
			
			//reqspec=RestAssured.given().log().all().spec(reqspec).body(PayLoad.
				//	createIssue("Bug", "Quantity not increase when adding item",
					//		"item does not increaing"));
			res=reqspec.when().post("/rest/api/2/issue/");
			
		}
		
		@Then("user should verify the statuscode {int}")
		public void user_should_verify_the_statuscode(int code) {
			 //statusCode = res.getStatusCode();
			org.junit.Assert.assertEquals("Assert verified ",code, res.getStatusCode());
		}
		
		
		@Then("user should verify key contains {string}")
		public void user_should_verify_key_contains(String prokey) throws ParseException {
			String body = res.getBody().asString();
			JSONParser parser=new JSONParser();
			Object p = parser.parse(body);
			JSONObject o=(JSONObject) p;
			String key = (String)o.get("key");
			boolean contains = key.contains(prokey);
			Assert.assertEquals("key assert verified",true, contains);
		}



}
