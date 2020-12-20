package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesPom {
	public static WebDriver driver;
	
	@FindBy(xpath="//div[@class='over-animator sp-portal__primary-item'][5]")
	public static WebElement opportunities;
	public static WebElement getOpportunities() {
		return opportunities;
	}

	@FindBy(xpath="//button[@class='button button--primary button--large']")
	public static WebElement addMileStone;
	public static WebElement getAddMileStone() {
		return addMileStone;
	}
	
	
	@FindBy(xpath="//input[@class='ember-text-field ember-view form-input-text milestone-modal__name']")
	public static WebElement mileStoneName;
	public static WebElement getMileStoneName() {
		return mileStoneName;
	}
	
	@FindBy(xpath="//textarea[@class='ember-text-area ember-view form-input-text milestone-modal__description']")
	public static WebElement mileStoneDescription;
	public static WebElement getMileStoneDescription() {
		return mileStoneDescription;
	}
	
	@FindBy(xpath="//input[@class='ember-text-field ember-view form-input-text milestone-modal__probability']")
	public static WebElement mileStoneProbability;
	public static WebElement getMileStoneProbability() {
		return mileStoneProbability;
	}
	
	@FindBy(xpath="//input[@class='ember-text-field ember-view form-input-text milestone-modal__days-until-stale']")
	public static WebElement daysUntillSale;
	public static WebElement getDaysUntillSale() {
		return daysUntillSale;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement mileStoneSaveBtn;
	public static WebElement getMileStoneSaveBtn() {
		return mileStoneSaveBtn;
	}
	
	@FindBy(xpath="//table/tbody/tr/td[1]/button")
	public static List<WebElement> mileStoneNameList;
	public static List<WebElement> getMileStoneNameList() {
		return mileStoneNameList;
	}
	
	public OpportunitiesPom(WebDriver oppdriver) {
		this.driver=oppdriver;
		PageFactory.initElements(driver, this);
	}

}
