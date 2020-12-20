package serializtionInJira;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MainJira {
	public static void main(String[] args) {
		RestAssured.baseURI="https://senthilautomation123.atlassian.net";
		
		Project project=new Project();
		project.setKey("FAC");
		
		Issuetype issuetype=new Issuetype();
		issuetype.setName("Bug");
		
		Fields f=new Fields();
		f.setSummary("item does not adding");
		f.setDescription("item does not adding");
		f.setProject(project);
		f.setIssuetype(issuetype);
		
		Sample_Jira sample=new  Sample_Jira();
		sample.setFields(f);
		
		Response post = RestAssured.given().header("Content-Type","application/json").auth().preemptive().
		basic("senthilsj1305@gmail.com", "Jczsa5cq8x3mddCKOvgmF35E").body(sample).when()
		.post("/rest/api/2/issue");
		System.out.println(post.getStatusCode());
		System.out.println(post.getBody().asString());
		
	}

}
