package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackPom {
	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='ember-view sp-portal__item-link']/h4[contains(text(),'Track')]")
	public static WebElement track;
	public static WebElement getTrack() {
		return track;
	}
	
	@FindBy(xpath="//a[@class='ember-view button button--primary button--large']")
	public static WebElement addTrack;
	public static WebElement getAddTrack() {
		return addTrack;
	}
	
	@FindBy(id="j_id127:trackDescriptionDecorate:trackDescription")
	public static WebElement trackName;
	public static WebElement getTrackName() {
		return trackName;
	}
	
	@FindBy(id="j_id127:trackTagDecorate:trackTag")
	public static WebElement trackTag;
	public static WebElement getTrackTag() {
		return trackTag;
	}
	
	@FindBy(id="j_id127:taskLines:0:taskDescriptionDecorate:taskDescription")
	public static WebElement trackDescription;
	public static WebElement getTrackDescription() {
		return trackDescription;
	}
	
	@FindBy(xpath="//a[@class='btn-primary btn-clear singlesubmit']")
	public static WebElement trackSaveBtn;
	public static WebElement getTrackSaveBtn() {
		return trackSaveBtn;
	}
	
	@FindBy(xpath="//table/tbody/tr/td[1]")
	public static List<WebElement> trackList;
	public static List<WebElement> getTrackList() {
		return trackList;
	}
	
	public TrackPom(WebDriver tdriver) {
		this.driver=tdriver;
		PageFactory.initElements(driver, this);
	}

}
