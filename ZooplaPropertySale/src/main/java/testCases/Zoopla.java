package testCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.ZooplaPom;
import preRequisites.Setup;
import singleton.PageObjectMan;

public class Zoopla extends Setup {
	List<Integer> li=new ArrayList<Integer>();
	List<WebElement> priceList;
	@Test()
	public void search() {
		PageObjectMan.getZoo().getSearchBox().sendKeys("london");
		PageObjectMan.getZoo().getPreferanceBtn().click();
		PageObjectMan.getZoo().getSearchBtn().click();
	}
	@Test(priority=1)
	public void gettingPriceList() {
		 priceList = ZooplaPom.getPriceList();
		 for (WebElement price : priceList) {
			String text = price.getText();
			text=text.replaceAll("[\\W]", "");
			li.add(Integer.parseInt(text));
		}
		 for (int i = 0; i <li.size(); i++) {
			 for (int j = i+1; j < li.size(); j++) {
				if (li.get(i)<li.get(j)) {
					int temp=li.get(i);
					li.set(i, li.get(j));
					li.set(j, temp);
				}
			}
		}
		 System.out.println("Price in desecnding order");
		 for (Integer pr : li) {
			System.out.println(pr);
		}
	}
	
	@Test(priority=2)
	public void selectParticularProperty() {
		int val=li.get(4);
		System.out.println(" in 5th place"+val);
		int i,j=0;
		while (val>0) {
			 i=val%10;
			 j=j+i;
			 val=val/10;
		}
		
		int count=0;
		priceList = ZooplaPom.getPriceList();
		 for (WebElement price : priceList) {
			String text = price.getText();
			text=text.replaceAll("[\\W]", "");
			int parseInt = Integer.parseInt(text);
			int a,b=0;
			while (parseInt>0) {
				 a=parseInt%10;
				 b=b+a;
				 parseInt=parseInt/10;
			}
			if (b==j) {
				Actions ac=new Actions(driver);
				ac.moveToElement(price).click().perform();
				System.out.println("5th price in descending order property clicked successfully ");
				break;
			}
			count++;
	}
	}
	
	@Test(priority=3)
	public void getAgentName() {
		WebElement agentName = PageObjectMan.getZoo().getAgentName();
		String expected = agentName.getText();
		agentName.click();
		String text = PageObjectMan.getZoo().getverifyName().getText();
		Assert.assertEquals(text, expected);
		System.out.println(" assert verified we got same agent name");
		System.out.println("expected = "+expected+" actual = "+text);
	}
}
