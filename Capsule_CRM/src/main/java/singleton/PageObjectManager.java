package singleton;

import org.openqa.selenium.WebDriver;

import pom.AcOtherSettingPom;
import pom.AuthenticationPom;
import pom.CaseAssigningPom;
import pom.NewCategoriesPom;
import pom.NewPersonPom;
import pom.NewUserPom;
import pom.OpportunitiesPom;
import pom.TrackPom;
import pom.VerifyACsettingPageHeader;
import preRequisites.BasicSetUp;

public class PageObjectManager {
	public static WebDriver driver=BasicSetUp.driver;
	private static AuthenticationPom ap;
	private PageObjectManager() {
		
	}
	
	public static AuthenticationPom getAp() {
		if (ap==null) {
			ap=new AuthenticationPom(driver);
		}
		return ap;
	}
	
	private static NewPersonPom np;
	public static NewPersonPom getNp() {
		if (np==null) {
			np=new NewPersonPom(driver);
		}
		return np;
	}
	
	private static CaseAssigningPom cp;
	public static CaseAssigningPom getCp() {
		if (cp==null) {
			cp=new CaseAssigningPom(driver);
		}
		return cp;
	}
	
	private static VerifyACsettingPageHeader ph;
	public static VerifyACsettingPageHeader getPh() {
		if (ph==null) {
			ph=new VerifyACsettingPageHeader(driver);
		}
		return ph;
	}
	
	private static AcOtherSettingPom os;
	public static AcOtherSettingPom getOs() {
		if (os==null) {
			os=new AcOtherSettingPom(driver);
		}
		return os;
	}
	
	private static NewUserPom nu;
	public static NewUserPom getNu() {
		if (nu==null) {
			nu=new NewUserPom(driver);
		}
		return nu;
	}
	
	private static OpportunitiesPom op;
	public static OpportunitiesPom getop() {
		if (op==null) {
			op=new OpportunitiesPom(driver);
		}
		return op;
	}
	
	private static TrackPom tp;
	public static TrackPom getTp() {
		if (tp==null) {
			tp=new TrackPom(driver);
		}
		return tp;
	}
	
	private static NewCategoriesPom nc;
	public static NewCategoriesPom getNc() {
		if (nc==null) {
			nc=new NewCategoriesPom(driver);
		}
		return nc;
	}
	

}
