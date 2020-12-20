package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCategoriesPom {
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='ember-view sp-portal__item-link']/h4[contains(text(),'Task Categories')]")
	public static WebElement newCategories;
	public static WebElement getNewCategories() {
		return newCategories;
	}
	
	@FindBy(xpath="//button[@class='button button--primary']")
	public static WebElement addNewCategoriesBtn;
	public static WebElement getAddNewCategoriesBtn() {
		return addNewCategoriesBtn;
	}
	
	@FindBy(xpath="//input[@class='ember-text-field ember-view form-input-text']")
	public static WebElement newCategoriesName;
	public static WebElement getNewCategoriesName() {
		return newCategoriesName;
	}
	
	@FindBy(xpath="//*[@class='select-box__option'][@style='background-color:#d30895']")
	public static WebElement nameBgColor;
	public static WebElement getNameBgColor() {
		return nameBgColor;
	}
	
	@FindBy(xpath="//*[@class='async-button  button button--primary']")
	public static WebElement nameSaveBtn;
	public static WebElement getNameSaveBtn() {
		return nameSaveBtn;
	}
	
	@FindBy(xpath ="//table/tbody/tr/td[1]")
	public static List<WebElement> categoriesList;
	public static List<WebElement> getCategoriesList() {
		return categoriesList;
	}
	
	public NewCategoriesPom(WebDriver catdriver) {
		this.driver=catdriver;
		PageFactory.initElements(driver,this);
	}

}
