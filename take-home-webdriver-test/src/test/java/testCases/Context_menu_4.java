package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import testPages.context_menuPage;
import utilities.Utils;

public class Context_menu_4 extends BaseTest {
	
	@Test
	public void context_menu(){
		
		context_menuPage cm = new context_menuPage(driver);
		driver.get(Utils.BASE_URLS + "/context_menu");
		
		Actions action = new Actions(driver);
		WebElement box = cm.getContextMenuBox();
		action.contextClick(box).perform();
		sleepTest(1000);
		Alert alert = driver.switchTo().alert();
        String alertText = (driver.switchTo().alert().getText());
        assertEquals(Utils.ALERT_EXPECTED_TEXT, alertText);
        alert.accept();
		sleepTest(1000);
	}
}
