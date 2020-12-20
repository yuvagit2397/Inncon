package api_Automation;

import serialization.Fields;
import serialization.Issuetype;
import serialization.Project;
import serialization.Sample;

public class PayLod {
public static String createUser() {
return"{\r\n" + 
		"    \"name\": \"morpheus\",\r\n" + 
		"    \"job\": \"zion resident\"\r\n" + 
		"}";
}

public static String updateUser(String name,String job) {
	return "{\r\n" + 
			"    \"name\": \""+name+"\",\r\n" + 
			"    \"job\": \""+job+"\"\r\n" + 
			"}";
}

public static Sample createIssue(String issue) {
	Project project=new Project();
	project.setKey("FAC");
	
	Issuetype issuetype=new Issuetype();
	issuetype.setName("Bug");
	
	Fields fields=new Fields();
	fields.setDescription(""+issue+"");
	fields.setSummary(""+issue+"");
	fields.setIssuetype(issuetype);
	fields.setProject(project);
	Sample sample=new Sample();
	sample.setFields(fields);
	return sample;
}

public static Sample updateIssue() {
	Fields fields=new Fields();
	fields.setDescription("txt box does not enable to edit");
	fields.setSummary("txt box does not enable to edit");
	Sample sample=new Sample();
	sample.setFields(fields);
	return sample;
}
}
