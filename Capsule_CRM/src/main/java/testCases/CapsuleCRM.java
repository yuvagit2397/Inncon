package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;
import preRequisites.BasicSetUp;
import singleton.PageObjectManager;

public class CapsuleCRM extends BasicSetUp {
	String fname = RandomString.make(5);
	String lname = RandomString.make(5);

	@Test
	public static void login() {
		PageObjectManager.getAp().getUserName().sendKeys("yuvagit2397");
		PageObjectManager.getAp().getPassword().sendKeys("paanai@123");
		PageObjectManager.getAp().getLogin().click();

	}
	
	@Test(priority=1)
	public void addPerson() throws InterruptedException {
		Thread.sleep(2000);
		PageObjectManager.getAp().getAddPersonSymbol().click();
		Thread.sleep(1000);
		PageObjectManager.getAp().getAddSymbol().click();
		Thread.sleep(1000);
		WebElement person = PageObjectManager.getAp().getPerson();
		Actions ac=new Actions(driver);
		ac.moveToElement(person).click().perform();
		System.out.println(driver.getTitle());
		
	}
	
	@Test(priority=2)
	public void addingNewPersonForm() throws InterruptedException {
		Thread.sleep(1000);
		PageObjectManager.getNp().getJob().sendKeys("Tester");
		PageObjectManager.getNp().getOrganisation().sendKeys("ATech"+Keys.ENTER);
		driver.switchTo().activeElement().sendKeys(fname+Keys.TAB);
		driver.switchTo().activeElement().sendKeys(lname);
		PageObjectManager.getNp().getTags().sendKeys("QA");
		PageObjectManager.getNp().getPhone().sendKeys("12345688");
		PageObjectManager.getNp().getEmail().sendKeys(fname+"@gmail.com");
		PageObjectManager.getNp().getuserWebsite().sendKeys("yuvawebsite.com");
		PageObjectManager.getNp().getwebSelectBox().click();
		PageObjectManager.getNp().getwebSelectOption().click();
		PageObjectManager.getNp().getAddAddressBtn().click();
		PageObjectManager.getNp().getAddressBar().sendKeys("yuvasri\nKallur\nUthangarai");
		PageObjectManager.getNp().getCity().sendKeys("Krishnagiri");
		PageObjectManager.getNp().getState().sendKeys("Tamilnadu");
		PageObjectManager.getNp().getCountry().sendKeys("India");
		Thread.sleep(5000);
		WebElement saveBtn = PageObjectManager.getNp().getSaveBtn();
		saveBtn.click();
		
		WebElement yesLinkBtn = PageObjectManager.getNp().getYesLinkBtn();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", yesLinkBtn);
		
	}
	
	@Test(priority=3)
	public void verifyAddedPerson() throws InterruptedException {
		Thread.sleep(2000);
		List<String> li=new ArrayList<String>();
		Thread.sleep(2000);
		WebElement addPersonSymbol = PageObjectManager.getAp().getAddPersonSymbol();
		Thread.sleep(3000);
		addPersonSymbol.click();
		List<WebElement> personsList = PageObjectManager.getNp().getPersonsList();
		for (WebElement person : personsList) {
			String text = person.getText();
			li.add(text);
			if (text.contains(fname+" "+lname)) {
				System.out.println("same person added in the list");
				break;
			}
		}
	}
	
	@Test(priority=4)
	public void assigningCase() throws InterruptedException, AWTException { 
		Thread.sleep(2000);
		PageObjectManager.getCp().getCaseIcon().click();
		PageObjectManager.getAp().getAddSymbol().click();
		PageObjectManager.getCp().getCaseOption().click();
		Thread.sleep(2000);
		PageObjectManager.getCp().getSearchPerson().sendKeys(fname);
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		PageObjectManager.getCp().getCaseName().sendKeys("regression");
		Thread.sleep(2000);
		PageObjectManager.getCp().getCaseSaveBtn().click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=5)
	public void verifyCaseAssigning() throws InterruptedException {
		Thread.sleep(2000);
		String text = PageObjectManager.getCp().getCaseStatus().getText();
		Assert.assertEquals(text, "Open");
		System.out.println("case status is "+text);
		String text2 = PageObjectManager.getCp().getCaseAssignee().getText();
		Assert.assertEquals(text2, fname+" "+lname);
		System.out.println("case assignee name is "+text2);
	}
}
