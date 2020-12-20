package tRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Seleniumnew\\API\\src\\test\\java\\feautres\\API_auto.feature",
glue="stepDef",dryRun=false,plugin= {"html:target/cucumberReports/extent.html",
		"json:target/cucumberReports/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestR {

}
