package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestRun.TestRun;

public class BCCI_International_pom {
	public static WebDriver driver;

	@FindBy(xpath = "//div[@class='navigation__menu-wrapper']/nav/ul/li[1]")
	public static WebElement international;

	@FindBy(xpath = "//div[@class='navigation__menu-wrapper']/nav/ul/li[1]/div[2]/div/ul/li[1]")
	public static WebElement fixtures;

	@FindBy(xpath = "//div[@class='js-list']/h3/strong")
	public static List<WebElement> months;

	public static WebDriver getDriver() {
		return driver;
	}

	public static WebElement getInternational() {
		return international;
	}

	public static WebElement getFixtures() {
		return fixtures;
	}

	public static List<WebElement> getMonths() {
		return months;
	}

	public BCCI_International_pom(WebDriver sdriver) {
		this.driver = sdriver;
		PageFactory.initElements(driver, this);
	}

}
