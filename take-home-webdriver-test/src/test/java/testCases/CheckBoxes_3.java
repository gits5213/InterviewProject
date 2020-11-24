package testCases;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import testPages.CheckboxesPage;
import utilities.Utils;

public class CheckBoxes_3 extends BaseTest {
	
	@Test
	public void checkBoxes(){
		
		CheckboxesPage cb = new CheckboxesPage(driver);
		driver.get(Utils.BASE_URLS + "/checkboxes");
		driver.manage().deleteAllCookies();
		sleepTest(1000);
		boolean check = cb.getFirstCheckbox().isSelected();
		if(cb.getFirstCheckbox().isSelected()) {
			assertEquals(true, check);
		}else {
			cb.getFirstCheckbox().click();
			assertEquals(false, check);
		}
		sleepTest(1000);
		boolean secondCheck = cb.getScondCheckbox().isSelected();
		if(cb.getScondCheckbox().isSelected()) {
			assertEquals(true, secondCheck);
		}else {
			cb.getScondCheckbox().click();
			assertEquals(false, secondCheck);
		}
		sleepTest(1000);
				
	}
	
	

}
