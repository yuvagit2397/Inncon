package stepDef;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import api_Automation.Output;
import api_Automation.PayLod;
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

public class createIssue {
	RequestSpecification reqspec;
	Response response;

	@Given("^Add the JIRA to create API payload$")
	public void add_the_JIRA_to_create_API_payload() throws Throwable {
		PreemptiveBasicAuthScheme scheme = new PreemptiveBasicAuthScheme();
		scheme.setUserName("senthilsj1305@gmail.com");
		scheme.setPassword("Jczsa5cq8x3mddCKOvgmF35E");

		reqspec = new RequestSpecBuilder().setBaseUri("https://senthilautomation123.atlassian.net")
				.setContentType(ContentType.JSON).setAuth(scheme).build();

	}

	@When("^user should call the JIRA create issue API with post request$")
	public void user_should_call_the_JIRA_create_issue_API_with_post_request() throws Throwable {
		reqspec = RestAssured.given().log().all().spec(reqspec).body(PayLod.createIssue("List options not clicable"));
		response = reqspec.when().post("/rest/api/2/issue");
	}

	@Then("^user should verify responsecode should be (\\d+)$")
	public void user_should_verify_responsecode_should_be(int statusCode) throws Throwable {
		Assert.assertEquals("verify status code", statusCode, response.getStatusCode());
	}

	@Then("^user should verify responsebody self should contain \"([^\"]*)\"$")
	public void user_should_verify_responsebody_self_should_contain(String selfName) throws Throwable {
		Output responseBdy = response.as(Output.class);
		org.junit.Assert.assertTrue("verified in self senthilautomation is present",
				responseBdy.getSelf().contains(selfName));
	}

	
	
	
	@When("^user should call the JIRA get issue API with get request$")
	public void user_should_call_the_JIRA_get_issue_API_with_post_request() throws Throwable {
		response = RestAssured.given().log().all().spec(reqspec).when().get("/rest/api/2/search");
	}

	@Then("^user should verify getresponsecode should be (\\d+)$")
	public void user_should_verify_getresponsecode_should_be(int statuscode) throws Throwable {
		Assert.assertEquals("verify  get status code", statuscode, response.getStatusCode());
	}

	@Then("^user should verify responsebody total should be (\\d+)$")
	public void user_should_verify_responsebody_total_should_be(int total) throws Throwable {
		String responseBdy = response.getBody().asString();
		JSONParser p = new JSONParser();
		Object o = p.parse(responseBdy);
		JSONObject j = (JSONObject) o;
		Object object = j.get("total");
		String valueOf = String.valueOf(object);
		int t = Integer.parseInt(valueOf);
		Assert.assertEquals("verified total", total, t);
	}

}
