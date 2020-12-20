package stepDef;

import serialzationWithJira1.Fields1;
/*import serializtionInJira.Fields;
import serializtionInJira.Issuetype;
import serializtionInJira.Project;
import serializtionInJira.Sample_Jira;*/
import serialzationWithJira1.MainClass;

public class PayLoad {
	
	/*public  static Sample_Jira createIssue(String issue,String description,String summary) {
		Project project=new Project();
		project.setKey("FAC");
		
		Issuetype issuetype=new Issuetype();
		issuetype.setName(issue);
		
		Fields fields=new Fields();
		fields.setDescription(description);
		fields.setSummary(summary);
		fields.setIssuetype(issuetype);
		fields.setProject(project);
		
		Sample_Jira sample=new Sample_Jira();
		sample.setFields(fields);
		return sample;
	
	}*/
	
	public static MainClass updateIssue(String description,String summary) {
		Fields1 fields=new Fields1();
		fields.setDescription(description);
		fields.setSummary(summary);
		MainClass sample=new MainClass();
		sample.setFields(fields);
		return sample;
}

}
