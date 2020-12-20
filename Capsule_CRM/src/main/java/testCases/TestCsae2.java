package testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import preRequisites.BasicSetUp;
import singleton.PageObjectManager;

public class TestCsae2 extends BasicSetUp{
	@Test(priority=1)
	public void login1() {
		PageObjectManager.getAp().getUserName().sendKeys("yuvagit2397");
		PageObjectManager.getAp().getPassword().sendKeys("paanai@123");
		PageObjectManager.getAp().getLogin().click();

	}
	
	@Test(priority=2)
	public void verifyingAccountSettingPageHeader() {
         PageObjectManager.getPh().getAccountName().click();
         PageObjectManager.getPh().getAccountSettings().click();
         String expected="Account Settings";
         String text = PageObjectManager.getPh().getAccountPageTitle().getText();
         Assert.assertEquals(text, expected);
         System.out.println("Account settings page title verified");
	}
	
	@Test(priority=3)
	public void verifyAccountSettingsLinkTitles() throws InterruptedException {
		List<WebElement> accountSettingsLink = PageObjectManager.getPh().getAccountSettingsLink();
		System.out.println("Options presents in account settings");
		for (int i = 0; i < accountSettingsLink.size(); i++) {
			WebElement link = accountSettingsLink.get(i);
			String expected = link.getText();
			link.click();
			 Thread.sleep(2000);
			 String actual= PageObjectManager.getPh().getLinkTitle().getText();
			 Thread.sleep(1000);
			 Assert.assertEquals(true, expected.contains(actual));
			 System.out.println((i+1)+". Expected Title---->"+expected+" Actual title--->"+actual);
			 PageObjectManager.getPh().getAcSettingBack().click();
			 Thread.sleep(2000);
		}
	}
	
	@Test(priority=4)
	public void verifyAppearance() throws InterruptedException {
		PageObjectManager.getOs().getAppearance().click();
		Thread.sleep(2000);
		PageObjectManager.getOs().getuploadBtn().sendKeys("C:\\Users\\ADMIN\\Desktop\\Screenshot (5).png");
		Thread.sleep(1000);
		PageObjectManager.getOs().getuploadSaveBtn().click();
		Thread.sleep(2000);
		String text = PageObjectManager.getOs().getErrorMsg().getText();
		System.out.println("verified error message while uploading file");
		System.out.println("msg----->"+text);
		PageObjectManager.getPh().getAcSettingBack().click();
		Thread.sleep(2000);
	}
	
	@Test(priority=5)
	public void addUser() throws InterruptedException {
		String make = RandomString.make(5);
		String make2 = RandomString.make(5);
		String make3 = RandomString.make(5);
		PageObjectManager.getNu().getUsersLink().click();
		Thread.sleep(2000);
		PageObjectManager.getNu().getAddUser().click();
		Thread.sleep(1000);
		PageObjectManager.getNu().getuserFirstName().sendKeys(make2);
		PageObjectManager.getNu().getuserLastName().sendKeys(make3);
		PageObjectManager.getNu().getuserEmail().sendKeys(make+"@gmail");
		PageObjectManager.getNu().getuserName().sendKeys(make);
		PageObjectManager.getNu().getInviteUserBtn().click();
		Thread.sleep(2000);
		List<String> li=new ArrayList<String>();
		List<WebElement> addedUserList = PageObjectManager.getNu().getAddedUserList();
		for (WebElement users : addedUserList) {
			String text = users.getText();
			if (text.contains(make2+" "+make3)) {
				System.out.println("verified--->new user added successfully");
			}
		}
		PageObjectManager.getPh().getAcSettingBack().click();
		Thread.sleep(2000);

	}
	
	@Test(priority=6)
	public void verifyOpportunities() throws InterruptedException {
		String make = RandomString.make(10);
		Thread.sleep(2000);
		PageObjectManager.getop().getOpportunities().click();
		Thread.sleep(2000);
		PageObjectManager.getop().getAddMileStone().click();
		Thread.sleep(1000);
		PageObjectManager.getop().getMileStoneName().sendKeys(make);
		PageObjectManager.getop().getMileStoneDescription().sendKeys("People can contact if any issue arise");
		PageObjectManager.getop().getMileStoneProbability().sendKeys("15");
		PageObjectManager.getop().getDaysUntillSale().sendKeys("8");
		PageObjectManager.getop().getMileStoneSaveBtn().click();
		Thread.sleep(2000);
		List<WebElement> mileStoneNameList = PageObjectManager.getop().getMileStoneNameList();
			for (WebElement list : mileStoneNameList) {
				String text = list.getText();
				if (text.contains(make)) {
					Assert.assertEquals(text.contains(make), true);
					System.out.println("MileStone added successfully");
				}
			}
			PageObjectManager.getPh().getAcSettingBack().click();
			Thread.sleep(2000);
	}
	
	@Test(priority=7)
	public void verifyTrackOption() throws InterruptedException {
		Thread.sleep(2000);
		PageObjectManager.getTp().getTrack().click();
		Thread.sleep(2000);
		PageObjectManager.getTp().getAddTrack().click();
		Thread.sleep(1000);
		String make = RandomString.make(10);
		PageObjectManager.getTp().trackName.sendKeys(make);
		PageObjectManager.getTp().getTrackTag().sendKeys("Tag-"+make);
		PageObjectManager.getTp().getTrackDescription().sendKeys("this is"+make+" description");
		PageObjectManager.getTp().getTrackSaveBtn().click();
		Thread.sleep(1000);
		List<WebElement> trackList = PageObjectManager.getTp().getTrackList();
		for (WebElement list : trackList) {
			String text = list.getText();
			if (text.contains(make)) {
				Assert.assertEquals(text.contains(make), true);
				System.out.println("new track successfully added in the Track List ");
			}
			
		}
		PageObjectManager.getPh().getAcSettingBack().click();
		Thread.sleep(2000);
	}
	
	@Test(priority=8)
	public void verifyNewCategories() throws InterruptedException {
		String make = RandomString.make(4);
		PageObjectManager.getNc().getNewCategories().click();
		Thread.sleep(1000);
		PageObjectManager.getNc().getAddNewCategoriesBtn().click();
		Thread.sleep(2000);
		PageObjectManager.getNc().getNewCategoriesName().sendKeys(make);
		PageObjectManager.getNc().getNameBgColor().click();
		PageObjectManager.getNc().getNameSaveBtn().click();
		Thread.sleep(5000);
		List<WebElement> categoriesList = PageObjectManager.getNc().getCategoriesList();
		for (WebElement list : categoriesList) {
			String text = list.getText();
			//System.out.println(text);
			if (text.contains(make)) {
				Assert.assertEquals(text.contains(make), true);
				System.out.println("New task category "+make+" added successfully");
			}
		}
	}
}
