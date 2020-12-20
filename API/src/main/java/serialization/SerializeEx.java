package serialization;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SerializeEx {
	
	// Create the issue in JIRA
	
public static void main(String[] args) {
	RestAssured.baseURI="https://senthilautomation123.atlassian.net";
	
	Project project=new Project();
	project.setKey("FAC");
	
	Issuetype issuetype=new Issuetype();
	issuetype.setName("Bug");
	
	Fields fields=new Fields();
	fields.setDescription("drpdown not clickable");
	fields.setSummary("drpdown not clickable");
	fields.setIssuetype(issuetype);
	fields.setProject(project);
	
	Sample sample=new Sample();
	sample.setFields(fields);
	
	Response post = RestAssured.given().header("Content-Type", "application/json").auth().preemptive()
	.basic("senthilsj1305@gmail.com", "Jczsa5cq8x3mddCKOvgmF35E").body(sample).when().post("/rest/api/2/issue");
	System.out.println(post.getStatusCode());
	System.out.println(post.getBody().asString());
	
	
	//TO Update the issue
	
	// when().put("rest/api/2/issue/Bugid")
	
	//To delete the issue
	
	//basic().when().delete(""rest/api/2/issue/Bugid"")
	
}

}
