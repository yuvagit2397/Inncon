package serialzationWithJira1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdatingJiraIssue {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://senthilautomation123.atlassian.net";
		Fields1 fields = new Fields1();
		fields.setSummary("Added item shown");
		fields.setDescription("None");
		
		MainClass class1=new MainClass();
		class1.setFields(fields);
		
		 Response put = RestAssured.given().headers("Content-Type","application/json").auth()
		.preemptive().basic("senthilsj1305@gmail.com", "Jczsa5cq8x3mddCKOvgmF35E").body(class1).when().
		put("/rest/api/2/issue/FAC-21");
	System.out.println(put.getBody().asString());
	
	}
}
