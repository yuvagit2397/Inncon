package stepDef;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateDefinition {
				RequestSpecification res;
				Response response;
				int statusCode;
		@Given("add the jira to create APi")
		public void add_the_jira_to_create_a_pi() {
			PreemptiveBasicAuthScheme p=new PreemptiveBasicAuthScheme();
			p.setUserName("senthilsj1305@gmail.com");
			p.setPassword("Jczsa5cq8x3mddCKOvgmF35E");
			res=new RequestSpecBuilder().setBaseUri("https://senthilautomation123.atlassian.net").
			setContentType(ContentType.JSON).setAuth(p).build();
			
		}	



		@When("user should call jira create api")
		public void user_should_call_jira_create_api() {
			
			res=RestAssured.given().log().all().spec(res).body(PayLoad.
					updateIssue("new update", "new update"));
			response=res.when().put("/rest/api/2/issue/FAC-21");
					
			
			
		}
		@When("update the issue")
		public void update_the_issue() {
			 statusCode = response.getStatusCode();
		}
		@Then("user validating the status code")
		public void user_validating_the_status_code() {
			int expected=204;
			Assert.assertEquals(expected, statusCode);
			}



}
