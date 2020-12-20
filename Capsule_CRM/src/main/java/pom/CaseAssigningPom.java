package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CaseAssigningPom {
	public static WebDriver driver;
	
	@FindBy(xpath="//div[@class='nav-bar-section nav-bar-main']/nav/div[5]")
	public static WebElement caseIcon;

	public static WebElement getCaseIcon() {
		return caseIcon;
	}
	
	@FindBy(xpath="//div[@class='select-box__options bottom-right']/a[4]")
	public static WebElement caseOption;

	public static WebElement getCaseOption() {
		return caseOption;
	}
	
	@FindBy(xpath="//div[@class='search-select__input-container']/input ")
	public static WebElement searchPerson;

	public static WebElement getSearchPerson() {
		return searchPerson;
	}
	
	
	
	@FindBy(xpath="//footer[@class='page-box__footer']/div/button[1]")
	public static WebElement caseSaveBtn;

	public static WebElement getCaseSaveBtn() {
		return caseSaveBtn;
	}
	
	
	@FindBy(xpath="//div[@class='kase-summary panel']/div/span")
	public static WebElement caseStatus;

	public static WebElement getCaseStatus() {
		return caseStatus;
	}
	
	@FindBy(xpath="//div[@class='page-box__content']/div[3]/descendant::input")
	public static WebElement caseName;

	public static WebElement getCaseName() {
		return caseName;
	}
	
	@FindBy(xpath="//div[@class='entity-details__subtitle']/div/div/a")
	public static WebElement caseAssignee;

	public static WebElement getCaseAssignee() {
		return caseAssignee;
	}


	public CaseAssigningPom(WebDriver casedriver) {
		this.driver=casedriver;
		PageFactory.initElements(driver, this);
	}
}
