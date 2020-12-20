package singleton;

import org.openqa.selenium.WebDriver;

import pom.FlightDetailsPom;
import pom.HomePagePom;
import pom.NonStopAndOneStop;
import pom.PricePom;
import preRequisite.MyTripSetup;

public class PageObject extends MyTripSetup {
	public static WebDriver driver=MyTripSetup.driver;
	
	private static HomePagePom hp;
	public static HomePagePom getHp() {
		if (hp==null) {
			hp=new HomePagePom(driver);
		}
		return hp;
	}
	
	private static NonStopAndOneStop nsOs;
	public static NonStopAndOneStop getNsOs() {
		if (nsOs==null) {
			nsOs=new NonStopAndOneStop(driver);
		}
		return nsOs;
	}
	
	private static FlightDetailsPom fd;
	public static FlightDetailsPom getFd() {
		if (fd==null) {
			fd=new FlightDetailsPom(driver);
		}
		return fd;
	}
	
	private static PricePom pp;
	public static PricePom getPp() {
		if (pp==null) {
			pp=new PricePom(driver);
		}
		return pp;
	}

}