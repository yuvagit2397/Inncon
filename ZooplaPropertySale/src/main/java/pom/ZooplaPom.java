package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZooplaPom {
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='search-input-location']")
	public static WebElement searchBox;
	public static WebElement getSearchBox() {
		return searchBox;
	}

	@FindBy(id="search-submit")
	public static WebElement searchBtn;
	public static WebElement getSearchBtn() {
		return searchBtn;
	}
	
	@FindBy(xpath="//button[text()='Save my preferences']")
	public static WebElement preferanceBtn;
	public static WebElement getPreferanceBtn() {
		return preferanceBtn;
	}
	@FindBy(xpath="//div[@data-testid='search-result']/div[1]/div[2]/div/child::div[1]/p[contains(@size,'6')]")
	public static List<WebElement> priceList;
	public static List<WebElement> getPriceList() {
		return priceList;
	}
	
	@FindBy(xpath="//div[@class='ui-agent__text']/h4")
	public static WebElement agentName;
	public static WebElement getAgentName() {
		return agentName;
	}
	
	@FindBy(xpath="//div[@id='content']/div/h1/b[1]")
	public static WebElement verifyName;
	public static WebElement getverifyName() {
		return verifyName;
	}
	public ZooplaPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
