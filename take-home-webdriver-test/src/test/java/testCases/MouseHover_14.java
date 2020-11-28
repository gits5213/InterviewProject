package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import testPages.MouseHoverPage;
import testPages.iFramePage;
import utilities.Utils;

public class MouseHover_14 extends BaseTest{
	
	@Test
	public void mouseHover_14(){
		
		MouseHoverPage ip = new MouseHoverPage(driver);
		driver.get(Utils.BASE_URLS + "/hovers");
		sleepTest(1000);
		
		//Test does a mouse hover on each image.
	    //Test asserts that additional information is displayed for each image.
		
		Actions act = new Actions(driver);

		// First user
		WebElement user1 = ip.getHover1();
		act.moveToElement(user1).build().perform();
		sleepTest(1000);
		String hover1Text = ip.getHover1text().getText();
		assertEquals(Utils.HOVER_1_TEXT, hover1Text);
		sleepTest(2000);
		
		// Second user
		WebElement user2 = ip.getHover2();
		act.moveToElement(user2).build().perform();
		sleepTest(1000);
		String hover2Text = ip.getHover2text().getText();
		assertEquals(Utils.HOVER_2_TEXT, hover2Text);
		sleepTest(2000);
		
		// Third user
		WebElement user3 = ip.getHover3();
		act.moveToElement(user3).build().perform();
		sleepTest(1000);
		String hover3Text = ip.getHover3text().getText();
		assertEquals(Utils.HOVER_3_TEXT, hover3Text);
		sleepTest(1000);

	}
}
