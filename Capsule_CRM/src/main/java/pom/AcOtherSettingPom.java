package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcOtherSettingPom {
	public static WebDriver driver;

	@FindBy(xpath = "//div[@class='sp-portal__secondary-items']/div/descendant::h4[contains(text(),'Appearance')]")
	public static WebElement appearance;
	public static WebElement getAppearance() {
		return appearance;
	}
	
	@FindBy(id = "appearance:uploadDecorate:logoImage")
	public static WebElement uploadBtn;
	public static WebElement getuploadBtn() {
		return uploadBtn;
	}
	
	@FindBy(xpath = "//div[@class='sp-page__section']/p/a[contains(text(),'Save')]")
	public static WebElement uploadSaveBtn;
	public static WebElement getuploadSaveBtn() {
		return uploadSaveBtn;
	}
	
	@FindBy(xpath = "//ul[@class='errorMsg']/li")
	public static WebElement errorMsg;
	public static WebElement getErrorMsg() {
		return errorMsg;
	}
	public AcOtherSettingPom(WebDriver appeardriver) {
		this.driver = appeardriver;
		PageFactory.initElements(driver, this);
	}

}
