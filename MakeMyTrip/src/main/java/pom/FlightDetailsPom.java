package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightDetailsPom {
	public static WebDriver driver;
	
	@FindBy(xpath="//div[@class='splitVw-sctn pull-left']/div/div/label/div/span[1]")
	public static List<WebElement> depFlightRadio;
	public static List<WebElement> getdepFlightRadio() {
		return depFlightRadio;
	}
	
	@FindBy(xpath="//div[@class='splitVw-sctn pull-left']/div/div/label/div/span[2]/span")
	public static List<WebElement> depFlightName;
	public static List<WebElement> getdepFlightName() {
		return depFlightName;
	}

	@FindBy(xpath="//div[@class='splitVw-sctn pull-right']/div/div/label/div/span[1]")
	public static List<WebElement> returnFlightRadio;
	public static List<WebElement> getReturnFlightRadio() {
		return returnFlightRadio;
	}
	
	@FindBy(xpath="//div[@class='splitVw-sctn pull-right']/div/div/label/div/span[2]/span")
	public static List<WebElement> returnFlightName;
	public static List<WebElement> getReturnFlightName() {
		return returnFlightName;
	}

	@FindBy(xpath="//div[@class='splitVw-footer-left']/p/span[2]")
	public static WebElement containerFlightName;
	public static WebElement getContainerFlightName() {
		return containerFlightName;
	}
	
	@FindBy(xpath="//div[@class='splitVw-footer-right']/p/span[2]")
	public static WebElement containerReturnFlightName;
	public static WebElement getContainerReturnFlightName() {
		return containerReturnFlightName;
	}
	
	public FlightDetailsPom(WebDriver fdriver) {
		this.driver=fdriver;
		PageFactory.initElements(driver, this);
	}
}
