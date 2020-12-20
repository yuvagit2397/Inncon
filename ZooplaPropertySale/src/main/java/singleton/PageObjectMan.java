package singleton;

import org.openqa.selenium.WebDriver;

import pom.ZooplaPom;
import preRequisites.Setup;

public class PageObjectMan extends Setup {
 public static WebDriver driver=Setup.driver;
 
 private static ZooplaPom zoo;
 public static ZooplaPom getZoo() {
	 if (zoo==null) {
		zoo=new ZooplaPom(driver);
	}
	 return zoo;
 }
}
