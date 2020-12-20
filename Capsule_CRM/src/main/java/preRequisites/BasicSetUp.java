package preRequisites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BasicSetUp {
	public static WebDriver driver;
	public Properties prop;
	
	public Properties getProperty() throws IOException{
		System.out.println("getpropmethod");
		File f=new File("E:\\Seleniumnew\\Capsule_CRM\\"
				+ "src\\main\\java\\preRequisites\\PropertyFile.properties");
		FileInputStream fin=new FileInputStream(f);
		prop=new Properties();
		prop.load(fin);
		return prop;
	}
	
	@BeforeSuite
	public void getbrowser() throws IOException {
		System.out.println("getbrowser method");
		getProperty();
		String brows="chrome";
		String browserprop = prop.getProperty("browser");
		System.out.println(browserprop);
		if (browserprop.equalsIgnoreCase(brows)) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\New folder\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		String url = prop.getProperty("url");
		driver.get("https://yuvagit.capsulecrm.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	
	@AfterSuite
	public void tearDown() {
		//driver.quit();
	}
	
	

}
