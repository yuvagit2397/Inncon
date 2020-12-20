package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
//6071235384024322 03/23 
@CucumberOptions(features = "E:\\Seleniumnew\\CucumberWithTestNG\\src\\main\\java\\testNG\\feature\\sample.feature", glue = {
		"E:\\Seleniumnew\\CucumberWithTestNG\\src\\main\\java\\testNGstepdefinition\\Step.java" })

public class TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	public static WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
	}
}
