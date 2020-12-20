package preRequisite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyTripSetup {
	public static WebDriver driver;
	public Properties prop;
	
	public Properties getProperty() throws IOException{
		System.out.println("getpropmethod");
		File f=new File("E:\\Seleniumnew\\MakeMyTrip\\src\\main\\java\\preRequisite\\Property.properties");
		FileInputStream fin=new FileInputStream(f);
		prop=new Properties();
		prop.load(fin);
		return prop;
	}
	
	@BeforeClass
	public void start() throws IOException {
		getProperty();
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\New folder\\chromedriver_win32 (2)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//@AfterClass
	public void end() {
		//driver.quit();
	}
}
