package testCases;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import testPages.DropdownPage;
import utilities.Utils;

public class Dropdown extends BaseTest {
	
	@Test
	public void dropdown(){
		
		DropdownPage dp = new DropdownPage(driver);
		driver.get(Utils.BASE_URLS + "/dropdown");
		sleepTest(1000);
		
		Select select = new Select(dp.getDropDown());
		select.selectByIndex(1);
		WebElement option = select.getFirstSelectedOption();
		String selectedValueInDropDown = option.getText();
		System.out.println(selectedValueInDropDown);
		assertEquals(Utils.FIRST_SELECTED_VALUE_IN_DROPDOWN, selectedValueInDropDown);	
	}
}
