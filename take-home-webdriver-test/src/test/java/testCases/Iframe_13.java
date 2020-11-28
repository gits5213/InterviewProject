package testCases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testPages.iFramePage;
import utilities.Utils;

public class Iframe_13 extends BaseTest{
	
	@Test
	public void iframe_13(){
		
		iFramePage ip = new iFramePage(driver);
		driver.get(Utils.BASE_URLS + "/iframe");
		sleepTest(1000);
		ip.getPopUp().click();
		sleepTest(1000);
		
		//Test switches to Iframe and types some text.
	    //Test asserts that the typed text is as expected.
		
		//Finding all iframe tags on a web page
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int numberOfTags = elements.size();
		System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
		
		switchIframe(0);
		//or 
		//driver.switchTo().frame(0); //FrameID or Name = "mce_0_ifr"
		ip.getTextArea().sendKeys(Utils.I_SWITCHED_IFRAME);
		sleepTest(3000);
		String iFrameText = ip.getTextArea().getText();
		System.out.println(iFrameText);
		assertEquals(Utils.TEXT_AREA_TEXT, iFrameText);
		sleepTest(1000);
		
		// Switch back to main web page
		driver.switchTo().defaultContent();
		sleepTest(1000);
	
	}
}
