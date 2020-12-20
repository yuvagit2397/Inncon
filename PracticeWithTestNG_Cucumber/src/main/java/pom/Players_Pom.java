package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestRun.TestRun;

public class Players_Pom {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//div[@class='navigation__menu-wrapper']/nav/ul/child::li[4]")
	public static WebElement player;
	
	@FindBy(xpath="//div[@class='page-content__inner']/section/ul/li/following::figcaption/h1")
	public static List<WebElement> firstName;
	
	@FindBy(xpath="//a[contains(@href,'players/men')]")
	public static WebElement menPlayersLink;
	
	@FindBy(xpath="//div[@class='page-content__inner']/section[1]/ul/li")
	public static List<WebElement> gradeAPlus ;

	@FindBy(xpath="//div[@class='page-content__inner']/section[2]/ul/li")
	public static List<WebElement> gradeA ;
	
	@FindBy(xpath="//div[@class='page-content__inner']/section[3]/ul/li")
	public static List<WebElement> gradeB ;
	
	
	public static List<WebElement> getGradeAPlus() {
		return gradeAPlus;
	}

	public static List<WebElement> getGradeA() {
		return gradeA;
	}

	public static List<WebElement> getGradeB() {
		return gradeB;
	}
	
	public static WebElement getMenPlayersLink() {
		return menPlayersLink;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getPlayer() {
		return player;
	}

	public static List<WebElement> getFirstName() {
		return firstName;
	}

	
	public Players_Pom(WebDriver pdriver) {
		this.driver=pdriver;
		PageFactory.initElements(driver, this);
	}
}
