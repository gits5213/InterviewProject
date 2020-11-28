package testCases;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import testPages.Drag_and_dropPage;
import utilities.Utils;

public class Drag_and_drop_5 extends BaseTest {
	
	@Test
	public void drag_and_drop(){
		
		Drag_and_dropPage ddp = new Drag_and_dropPage(driver);;
		driver.get(Utils.BASE_URLS + "/drag_and_drop");
		
		//Test drags element A to element B.
		//Test asserts that the text on element A and B are switched.
		
		Actions act=new Actions(driver);
		sleepTest(1000);
		Action dragAndDrop = act.clickAndHold(ddp.getColumnA())
		.moveToElement(ddp.getColumnB())
		.release(ddp.getColumnB())
		.build();
		dragAndDrop.perform();
		String columnB = ddp.getColumnB().getText();
		assertEquals(Utils.COLUMN_A, columnB);
		sleepTest(1000);
	}
}
