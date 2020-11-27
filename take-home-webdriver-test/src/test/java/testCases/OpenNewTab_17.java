package testCases;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import testPages.OpenNewTabPage;
import utilities.Utils;

public class OpenNewTab_17 extends BaseTest{
	
	@Test
	public void openNewTab_17(){
		
		OpenNewTabPage ot = new OpenNewTabPage(driver);
		driver.get(Utils.BASE_URLS + "/windows");
		sleepTest(1000);
		
		//Assert Title
		//Test clicks on the Click Here link.
		//Assert 2nd Window Title 
	    //Test asserts that a new tab is opened with text New Window.
		//Switch back to Main Window 
		// Assert Title
		
		/*
		//Optional Print windowID
		Set<String> WindowId = driver.getWindowHandles();
		Iterator<String> iterator1 = WindowId.iterator();
		System.out.println(iterator1.next());
		*/
		
		ot.getClickHere().click();
		String mainWindowTitle = driver.getTitle();
		System.out.println("Main Window Title: " + mainWindowTitle);	
		assertEquals(mainWindowTitle, "The Internet");
		
		String mainpage = driver.getWindowHandle();
		String subwinhandleString = null;
		
		//set a loop which will store all window pop up handles
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> iterator = handle.iterator();
		
		while(iterator.hasNext ()) {
			subwinhandleString = iterator.next( );
		}
		
		driver.switchTo().window(subwinhandleString);
		String subWindowTitle = driver.getTitle();
		System.out.println("Sub Window Title: " + subWindowTitle);
		assertEquals(subWindowTitle, "New Window");
		sleepTest(1000);
		
		String newWindowText = ot.getNewWindowText().getText();
		System.out.println(newWindowText);
		assertEquals(newWindowText, "New Window");
		sleepTest(1000);
		driver.close();
		
		//Again switch back to main window
		driver.switchTo().window(mainpage);
		assertEquals(mainWindowTitle, "The Internet");
		sleepTest(2000);	
	}

}
