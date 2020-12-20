package stepDef;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestRun.TestRun;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import singleton.PageObjectManager;

public class BCCI_International extends TestRun {
	Actions ac;
	List<WebElement> matchMon;
	List<WebElement> matchDates;
	List<WebElement> matchFormates;
	List<WebElement> team1;
	List<WebElement> team2;
	List<WebElement> matchCenter;
	List<String> monthtext;
	List<String> datetext;
	List<String> formattext;
	List<String> team1Name;
	List<String> team2Name;
	List<String> center;
	public static WebDriver driver=TestRun.driver;
	@Given("^user is on the BCCI page$")
	public void user_is_on_the_BCCI_page() throws Throwable {
		reports.createTest("User entering the URL");
		//driver.get("https://www.bcci.tv/");
	}

	@When("^user select International module$")
	public void user_select_International_module() throws Throwable {
		//WebElement inte = driver.findElement(By.xpath("//div[@class='navigation__menu-wrapper']/nav/ul/li[1]"));
		ac=new Actions(driver);
		reports.createTest("User entering hovering the International module");
		WebElement international = PageObjectManager.getInter().getInternational();
		ac.moveToElement(international).perform();
	}

	@When("^user selects fixtures$")
	public void user_selects_fixtures() throws Throwable {
		reports.createTest("User entering clicking the Fixtures submenu");
		WebElement fixture = PageObjectManager.getInter().getFixtures();
		ac.moveToElement(fixture).click().perform();
	}

	@Then("^user verifying teams venue and all$")
	public void user_verifying_teams_venue_and_all() throws Throwable {
		
		/*List<WebElement> months = PageObjectManager.getInter().getMonths();
		for (WebElement month : months) {
			System.out.println(month.getText());
		}*/
		reports.createTest("User got all months ");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		
		int count=0;
		while (count<=3) {
			
			try {
			     matchMon = driver.findElements(By.xpath("//div[@class='js-list']/h3/following::a/div/div/div/span[1]"));
				System.out.println(" List of match months "+matchMon.size());

				monthtext=new ArrayList<String>();
				for (WebElement mon : matchMon) {
					//wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(mon)));
					String text = mon.getText();
					monthtext.add(text);
				}
				
				
				 matchDates = driver.findElements(By.xpath("//div[@class='js-list']/a/div[1]/div[1]/span"));
				System.out.println("list of match dates "+matchDates.size());
			    datetext=new ArrayList<String>();
				for (WebElement date : matchDates) {
					//wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(date)));
					String text = date.getText();
					datetext.add(text);
				}
				
			     matchFormates  = driver.findElements(By.xpath("//div[@class='js-list']/a/div[2]/div[2]/p/strong"));
				System.out.println("list of match formates "+matchFormates.size());
				formattext=new ArrayList<String>();
				for (WebElement formate : matchFormates) {
					//wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(formate)));
					String text = formate.getText();
					formattext.add(text);
				}
				
				
				team1 = driver.findElements(By.xpath("//div[@class='js-list']/a/div[3]/div[1]/p"));
				System.out.println("list of team1 "+team1.size());
				team1Name=new ArrayList<String>();
				for (WebElement t1 : team1) {
					//wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(t1)));
					String text = t1.getText();
					team1Name.add(text);
				}
				
				team2 = driver.findElements(By.xpath("//div[@class='js-list']/a/div[3]/div[3]/p"));
				System.out.println("list of team2 "+team2.size());
				team2Name=new ArrayList<String>();
				for (WebElement t2 : team2) {
					//wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(t2)));
					String text = t2.getText();
					team2Name.add(text);
				}
				
				matchCenter = driver.findElements(By.xpath("//div[@class='js-list']/a/div[4]"));
				System.out.println("list of match centers "+matchCenter.size());
				center=new ArrayList<String>();
				for (WebElement mc : matchCenter) {
					//wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(mc)));
					String text = mc.getText();
					center.add(text);
				}
				break;
				
			}
			
			catch(StaleElementReferenceException e){
				count++;
				//driver.get(driver.getCurrentUrl());
			}
			finally {
				
			}
		}
		
		
		for (int i = 0; i < 15; i++) {
			System.out.print(" "+monthtext.get(i));
			System.out.print(" "+datetext.get(i));
			System.out.print(" "+formattext.get(i));
			System.out.print(" "+team1Name.get(i));
			System.out.print(" "+team2Name.get(i));
			System.out.print(" "+center.get(i));
			System.out.println();
		}
	
	}
	
	@Given("^user selecting players module and select Men$")
	public void user_selecting_players_module_and_select_Men() throws Throwable {
		//driver.get("https://www.bcci.tv/");
		ac=new Actions(driver);
		ac.moveToElement(PageObjectManager.getPlay().getPlayer()).perform();
		ac.moveToElement(PageObjectManager.getPlay().getMenPlayersLink()).click().perform();

	}

	@When("^user get the players name$")
	public void user_get_the_players_name() throws Throwable {
		/*List<WebElement> firstName = PageObjectManager.getPlay().getFirstName();
		for (WebElement fname : firstName) {
			String text = fname.getText();
			System.out.println(text);
			s
		}*/
	}

	@Then("^user verify the players with Grade$")
	public void user_verify_the_players_with_Grade() throws Throwable {
		List<String> A_Plusli=new ArrayList<>();
		List<String> Ali=new ArrayList<>();
		List<String> Bli=new ArrayList<>();
		
		List<WebElement> gradeAPlus = PageObjectManager.getPlay().getGradeAPlus();
		for (WebElement A_Plus : gradeAPlus) {
			String text = A_Plus.getText();
			text=text.replace("\n", " ");
			A_Plusli.add(text);
		}
		
		List<WebElement> gradeA = PageObjectManager.getPlay().getGradeA();
		System.out.println();
		for (WebElement A : gradeA) {
			String text=A.getText();
			text=text.replace("\n", " ");
			Ali.add(text);
		}
		
		List<WebElement> gradeB = PageObjectManager.getPlay().getGradeB();
		System.out.println();
		for (WebElement B : gradeB) {
			String text=B.getText();
			text=text.replace("\n", " ");
			Bli.add(text);
		}
		
		System.out.println("Grade A+ Players");
		System.out.println("----------------");
		String text1="";
		for (int i = 0; i < A_Plusli.size(); i++) {
			System.out.println(A_Plusli.get(i));
			
		}
		
		System.out.println("Grade A Players");
		System.out.println("----------------");
		for (int i = 0; i < Ali.size(); i++) {
			System.out.println(Ali.get(i));
		}
		
		System.out.println("Grade B Players");
		System.out.println("----------------");
		for (int i = 0; i < Bli.size(); i++) {
			System.out.println(Bli.get(i));
		}
	}


	
}
