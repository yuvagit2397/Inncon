package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NonStopAndOneStop {
public static WebDriver driver;
	
	@FindBy(xpath="// div[@class='splitVw-sctn pull-left']/div/div/label/div/span[2]/span")
	public static List<WebElement> nonStopDepFlights;
	public static List<WebElement> getNonStopDepFlights() {
		return nonStopDepFlights;
	}
	
	
	@FindBy(xpath="// div[@class='splitVw-sctn pull-right']/div/div/label/div/span[2]/span")
	public static List<WebElement> nonStopRetFlights;
	public static List<WebElement> getNonStopRetFlights() {
		return nonStopRetFlights;
	}
	
	@FindBy(xpath="//span[@data-filtertext='collapsed_stop_nonStop']")
	public static List<WebElement> nonStopCheckBox;
	public static List<WebElement> getNonStopCheckBox() {
		return nonStopCheckBox;
	}
	
	@FindBy(xpath="//label[@for='newGroupFilter_d13050a9-4381-41a6-8dd3-54118b1a401e_oneStop']/span")
	public static WebElement oneStopCheckBox;
	public static WebElement getOneStopCheckBox() {
		return oneStopCheckBox;
	}
	
		
	public NonStopAndOneStop(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
}
