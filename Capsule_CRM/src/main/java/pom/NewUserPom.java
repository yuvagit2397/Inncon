package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserPom {
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='ember-view sp-portal__item-link']/h4[contains(text(),'Users')]")
	public static WebElement userslink;
	public static WebElement getUsersLink() {
		return userslink;
	}
	
	@FindBy(xpath="//div[@class='form-field  align-right']/a")
	public static WebElement addUser;
	public static WebElement getAddUser() {
		return addUser;
	}

	@FindBy(id ="register:firstnameDecorate:firstName")
	public static WebElement userFirstName;
	public static WebElement getuserFirstName() {
		return userFirstName;
	}
	
	@FindBy(id ="register:lastNameDecorate:lastName")
	public static WebElement userLastName;
	public static WebElement getuserLastName() {
		return userLastName;
	}
	
	@FindBy(id ="register:emailDecorate:email")
	public static WebElement userEmail;
	public static WebElement getuserEmail() {
		return userEmail;
	}
	
	@FindBy(id ="register:usernameDecorate:username")
	public static WebElement userName;
	public static WebElement getuserName() {
		return userName;
	}
	
	@FindBy(id ="register:save")
	public static WebElement inviteUserBtn;
	public static WebElement getInviteUserBtn() {
		return inviteUserBtn;
	}
	
	
	@FindBy(xpath ="//td[@class='users-index-page__name-column']/a")
	public static List<WebElement> addedUserList;
	public static List<WebElement> getAddedUserList() {
		return addedUserList;
	}
	
	public NewUserPom(WebDriver userdriver) {
		this.driver=userdriver;
		PageFactory.initElements(driver, this);
	}

}
