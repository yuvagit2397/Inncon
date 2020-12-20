package singleton;

import org.openqa.selenium.WebDriver;

import TestRun.TestRun;
import pom.BCCI_International_pom;
import pom.Players_Pom;


public class PageObjectManager {
 public static WebDriver driver=TestRun.driver;
 private PageObjectManager() {
	 
 }
 
 private static BCCI_International_pom inter;
 public static BCCI_International_pom getInter(){
	 if(inter==null) {
		 inter=new BCCI_International_pom(driver);
	 }
	 return inter;
 }
 
 private static Players_Pom play;
 public static Players_Pom getPlay() {
	 if (play==null) {
		play=new Players_Pom(driver);
	}
	 return play;
 }
}
