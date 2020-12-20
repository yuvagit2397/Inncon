package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {
	public static WebDriver driver;
	
	@FindBy(xpath="//label[@for='fromCity']")
	public static WebElement fromCity;
	public static WebElement getFromCity() {
		return fromCity;
	}
	
	@FindBy(xpath="//label[@for='fromCity']/following::div/descendant::input")
	public static WebElement fromCityBox;
	public static WebElement getFromCityBox() {
		return fromCityBox;
	}
	
	@FindBy(xpath="//label[@for='toCity']")
	public static WebElement toCity;
	public static WebElement getToCity() {
		return toCity;
	}
	
	@FindBy(xpath="//label[@for='toCity']/following::div/descendant::input")
	public static WebElement toCityBox;
	public static WebElement getToCityBox() {
		return toCityBox;
	}
	
	@FindBy(xpath="//label[@for='departure']")
	public static WebElement departure;
	public static WebElement getDeparture() {
		return departure;
	}
	
	//@FindBy(xpath="//div[@class='DayPicker-Month'][1]/div[3]/div[2]/div[@class='DayPicker-Day DayPicker-Day--today']")
	@FindBy(xpath="//div[@class='DayPicker-Body']/div[3]/div[7]")
	public static WebElement todayDate;
	public static WebElement gettodayDate() {
		return todayDate;
	}
	
	@FindBy(xpath="//div[@data-cy='returnArea']")
	public static WebElement returnArea;
	public static WebElement getReturnArea() {
		return returnArea;
	}

	@FindBy(xpath="//div[@class='DayPicker-Month'][1]/div[3]/div[4]/div[4]")
	public static WebElement returnDate;
	public static WebElement getreturnDate() {
		return returnDate;
	}

	@FindBy(xpath = "//a[text()='Search']")
	public static WebElement searchBtn;

	public static WebElement getSearchBtn() {
		return searchBtn;
	}

	@FindBy(xpath = "//div[@class='autopop__wrap makeFlex column defaultCursor']")
	public static WebElement loginPopup;

	public static WebElement getLoginPopup() {
		return loginPopup;
	}

	@FindBy(xpath = "//div[@class='splitVw-sctn pull-left']/div/div/label/div/span[2]/span")
	public static List<WebElement> depatureFlights;

	public static List<WebElement> getDepatureFlights() {
		return depatureFlights;
	}
	
	@FindBy(xpath = "//div[@class='splitVw-sctn pull-right']/div/div/label/div/span[2]/span")
	public static List<WebElement> returnFlights;

	public static List<WebElement> getReturnFlights() {
		return returnFlights;
	}
	

	@FindBy(xpath = "//li[@data-cy='account']")
	public static WebElement popupReturn;

	public static WebElement getPopupReturn() {
		return popupReturn;
	}

	public HomePagePom(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(driver, this);
	}
}
