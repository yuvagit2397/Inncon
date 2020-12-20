package stepDef;

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

public class GetIssuesStepDef {
	RequestSpecification request;
	Response respon;
	@Given("^add the JIRA to create API payload$")
	public void add_the_JIRA_to_create_API_payload() throws Throwable {
		PreemptiveBasicAuthScheme sc=new PreemptiveBasicAuthScheme();
		sc.setUserName("senthilsj1305@gmail.com");
		sc.setPassword("Jczsa5cq8x3mddCKOvgmF35E");
		request = new RequestSpecBuilder().setBaseUri("https://senthilautomation123.atlassian.net").
		setContentType(ContentType.JSON).setAuth(sc).build();
	}

	@When("^user should call the GET issue with GET request$")
	public void user_should_call_the_GET_issue_with_GET_request() throws Throwable {
		request = RestAssured.given().log().all().spec(request);
		respon=request.when().get("/rest/api/2/search");
	}

	@Then("^user should verify response code (\\d+)$")
	public void user_should_verify_response_code(int statuscode) throws Throwable {
		Assert.assertEquals("Status code verified",statuscode, respon.getStatusCode());
	}

	@Then("^user should get body and verify the issue type$")
	public void user_should_get_body_and_verify_the_issue_type() throws Throwable {
		
		}


}
