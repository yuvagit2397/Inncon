package serialization;

public class Fields {
 
private Project project;
public Project getProject() {
	return project;
}
public void setProject(Project project) {
	this.project = project;
}
public Issuetype getIssuetype() {
	return issuetype;
}
public void setIssuetype(Issuetype issuetype) {
	this.issuetype = issuetype;
}
private Issuetype issuetype;
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
private String summary;
private String description;
}