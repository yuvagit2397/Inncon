package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VerifyACsettingPageHeader {
	public static WebDriver driver;

	@FindBy(xpath = "//div[@class='nav-bar-account-details']/span")
	public static WebElement accountName;

	public static WebElement getAccountName() {
		return accountName;
	}
	
	@FindBy(xpath = "//div[@class='select-box__options bottom-right']/a[contains(text(),'Account Settings')]")
	public static WebElement accountSettings;

	public static WebElement getAccountSettings() {
		return accountSettings;
	}
	
	@FindBy(xpath="//div[@class='sp-portal sp-page']/h1")
	public static WebElement accountPageTitle;
	public static WebElement getAccountPageTitle() {
		return accountPageTitle;
	}
	
	@FindBy(xpath="//div[@class='sp-portal__primary-items']/div/a/h4")
	public static List<WebElement> accountSettingsLink;
	public static List<WebElement> getAccountSettingsLink() {
		return accountSettingsLink;
	}
	
	@FindBy(xpath="//*[@class='sp-page__title']")
	public static WebElement linkTitle;
	public static WebElement getLinkTitle() {
		return linkTitle;
	}
	
	@FindBy(xpath="//ol[@class='sp-page__breadcrumbs']/li/a")
	public static WebElement acSettingBack;
	public static WebElement getAcSettingBack() {
		return acSettingBack;
	}

	public VerifyACsettingPageHeader(WebDriver phdriver) {
		this.driver = phdriver;
		PageFactory.initElements(driver, this);
	}

}
