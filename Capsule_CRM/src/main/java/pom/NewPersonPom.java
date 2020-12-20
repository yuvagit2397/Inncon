package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPersonPom {
	public WebDriver driver;
	
	@FindBy(xpath="//*[@class='form-input-text party-form-first-name']")
	public static WebElement firstName;
	
	public static WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(xpath="//*[@class='form-input-text party-form-last-name']")
	public static WebElement lastName;
	
	public static WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(id="pendo-button-cf22fc14")
	public static WebElement gotitBtn;
	public static WebElement getGotitBtn() {
		return gotitBtn;
	}
	
	@FindBy(xpath="//*[@class='form-input-text party-form-job-title']")
	public static WebElement job;
	public static WebElement getJob() {
		return job;
	}
	
	@FindBy(xpath="//*[@role='searchbox'][contains(@placeholder,'Find an organisation')]")
	public static WebElement organisation;
	
	public static WebElement getOrganisation() {
		return organisation;
	}
	
	@FindBy(xpath="//div[@class='filter-select__input-container']/input")
	public static WebElement tags;
	
	public static WebElement getTags() {
		return tags;
	}
	
	@FindBy(xpath="//*[@class='form-input-text party-form-phone-number']")
	public static WebElement phone;
	
	public static WebElement getPhone() {
		return phone;
	}
	
	@FindBy(xpath=" //*[@class='form-input-text party-form-email-address']")
	public static WebElement email;
	
	public static WebElement getEmail() {
		return email;
	}
	
	@FindBy(xpath="//input[@class='form-input-text party-form-website']")
	public static WebElement userWebsite;
	
	public static WebElement getuserWebsite() {
		return userWebsite;
	}
	
	@FindBy(xpath=" //div[@class='repeater '][3]/div[2]/div/div/div/div[2]/div/div[2]")
	public static WebElement webSelectBox;
	
	public static WebElement getwebSelectBox() {
		return webSelectBox;
	}

	@FindBy(xpath="//*[@class='select-box__options']/div[5]")
	public static WebElement webSelectOption;
	
	public static WebElement getwebSelectOption() {
		return webSelectOption;
	}
	
	@FindBy(xpath=" //div[@class='repeater  party-form-address-repeater']/child::button")
	public static WebElement addAddressBtn;
	
	public static WebElement getAddAddressBtn() {
		return addAddressBtn;
	}
	
	
	@FindBy(xpath=" //textarea[@class='form-input-text party-form-address-street']")
	public static WebElement addressBar;
	
	public static WebElement getAddressBar() {
		return addressBar;
	}
	
	@FindBy(xpath=" //input[@class='form-input-text party-form-address-city']")
	public static WebElement city;
	
	public static WebElement getCity() {
		return city;
	}
	
	@FindBy(xpath=" //input[@class='form-input-text party-form-address-state']")
	public static WebElement state;
	
	public static WebElement getState() {
		return state;
	}
	
	@FindBy(xpath="//div[@class='collapsable-fieldset__content-inner']/div[3]/div[2]/div")
	public static WebElement country;
	
	public static WebElement getCountry() {
		return country;
	}
	
	@FindBy(xpath="//button[text()='Save']")
	public static WebElement saveBtn;
	
	public static WebElement getSaveBtn() {
		return saveBtn;
	}
	
	@FindBy(xpath="//footer[@class='modal-dialog__footer']/div/button[1]")
	public static WebElement yesLinkBtn;
	
	public static WebElement getYesLinkBtn() {
		return yesLinkBtn;
	}
	
	@FindBy(xpath="//table/tbody/tr/td[3]")
	public static List<WebElement> personsList;
	
	public static List<WebElement> getPersonsList() {
		return personsList;
	}
	
	public NewPersonPom(WebDriver newdriver) {
		this.driver=newdriver;
		PageFactory.initElements(driver, this);
	}

}
