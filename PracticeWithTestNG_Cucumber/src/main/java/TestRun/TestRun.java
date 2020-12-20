package TestRun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features="E:\\Seleniumnew\\PracticeWithTestNG_Cucumber\\src\\"
		+ "main\\java\\feautres\\HooksAndBackround.feature",
		glue= {"stepDef","hooks"},tags="@feat")
public class TestRun {
	private TestNGCucumberRunner cucumberRunner;
	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentHtmlReporter reporter;
	public static ExtentTest testcase;
	@BeforeClass(alwaysRun=true)
	public void setUp(){
		cucumberRunner=new TestNGCucumberRunner(this.getClass());
		reports=new ExtentReports();
		reporter=new ExtentHtmlReporter("First_Extent_Report.html");
		reports.attachReporter(reporter);
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver_win32 (2)\\chromedriver.exe");
		/*driver = new ChromeDriver();
		driver.get("https://www.bcci.tv/");
		testcase=reports.createTest("Opening Google");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
	}
	
	@Test(groups="cucumber",description="Runs Cucumber Feature",dataProvider="sample")
	public void feature(CucumberFeatureWrapper featureWrapper){
		cucumberRunner.runCucumber(featureWrapper.getCucumberFeature());
		
	}
	@DataProvider
	public Object[][] sample(){
		return cucumberRunner.provideFeatures();
		
	}
	@AfterClass(alwaysRun=true)
	public void tearDown(){
		cucumberRunner.finish();
		reports.flush();
	}

}
