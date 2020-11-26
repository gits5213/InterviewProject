package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import testPages.FloatingMenuPage;
import utilities.Utils;

public class FloatingMenu_Scroll_12 extends BaseTest{
	
	@Test
	public void floatingMenu_12(){
		
	FloatingMenuPage fm = new FloatingMenuPage(driver);
	driver.get(Utils.BASE_URLS + "/floating_menu");
	sleepTest(2000);
	
	/*
	//to perform Scroll on application using Selenium
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	*/
	
	//or 
	
	//to perform Scroll on application using Selenium
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
    sleepTest(1000);
    boolean elementDisplayed = fm.getFloatingMenu().isDisplayed();
    Assert.assertEquals(elementDisplayed,true);

	}
}
