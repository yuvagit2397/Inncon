package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Seleniumnew\\API_Revision\\src\\test\\java\\features\\PutIssue.feature",
glue="stepDef")

public class TestRun {
	

}
