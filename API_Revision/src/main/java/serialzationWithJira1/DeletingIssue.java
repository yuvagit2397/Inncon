package serialzationWithJira1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeletingIssue {
public static void main(String[] args) {
	RestAssured.baseURI="https://senthilautomation123.atlassian.net";
	
	//ensure the issue is already created in jira
	/*Response delete = RestAssured.given().auth().preemptive().
	basic("senthilsj1305@gmail.com", "Jczsa5cq8x3mddCKOvgmF35E").when().delete("/rest/api/2/issue/FAC-20");
	int statusCode = delete.getStatusCode();
	System.out.println(statusCode);
*/
	
	//just for reference
}
}
