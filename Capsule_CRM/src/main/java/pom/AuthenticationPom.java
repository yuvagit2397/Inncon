package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AuthenticationPom  {
	public WebDriver driver;

	@FindBy(id="login:usernameDecorate:username")
	public static WebElement userName;
	
	@FindBy(id="login:passwordDecorate:password")
	public static WebElement password;
	
	@FindBy(id="login:login")
	public static WebElement login;
	
	
	@FindBy(xpath="//nav[@class='nav-bar']/div/nav/div[2]")
	public static WebElement AddPersonSymbol;
	
	@FindBy(xpath="//div[@class='select-box__selected-option nav-bar-item nav-bar-item-add']")
	public static WebElement addSymbol;
	
	@FindBy(xpath="//a[starts-with(@id,'ember')][contains(text(),'Person')]")
	public static WebElement person;
	
	public static WebElement getPerson() {
		return person;
	}
	
	public static WebElement getAddSymbol() {
		return addSymbol;
	}
	
	public static WebElement getAddPersonSymbol() {
		return AddPersonSymbol;
	}


	public static WebElement getUserName() {
		return userName;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getLogin() {
		return login;
	}
	
	
	public AuthenticationPom(WebDriver authdriver) {
		this.driver=authdriver;
		PageFactory.initElements(driver, this);
	}
}
