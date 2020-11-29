package testCases;

import static org.testng.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import testPages.DropdownPage;
import utilities.Utils;

public class Six_Dropdown extends BaseTest {
	
	@Test
	public void dropdown(){
		
		DropdownPage dp = new DropdownPage(driver);
		driver.get(Utils.BASE_URLS + "/dropdown");
		sleepTest(1000);
		
		//Test selects Option 1 and Option 2 from the drop down menu.
		//Test asserts Option 1 and Option 2 are selected.
		
		Select select = new Select(dp.getDropDown());
		
		select.selectByIndex(1);
		WebElement option = select.getFirstSelectedOption();
		String selectedValueInDropDown = option.getText();
		System.out.println(selectedValueInDropDown);
		assertEquals(Utils.FIRST_SELECTED_VALUE_IN_DROPDOWN, selectedValueInDropDown);	
	
		//Print all the value form the Drop-down list
		dp.getElementText();
		
		//Validate Drop-down list Actual and Expected
		int count = 0;
	    String[] dropDownList = {"Please select an option", "Option 1", "Option 2"};
		
		List<WebElement> options = select.getOptions();
	    for (WebElement we : options) {
	        for (int i = 0; i < dropDownList.length; i++) {
	            if (we.getText().equals(dropDownList[i])) {
	                count++;
	            }
	        }
	    }
	    if (count == dropDownList.length) {
	        System.out.println("Dropdown list matched! :)");
	    } else {
	        System.out.println("Dropdown list doesn't matched!");
	    }
	}	
}
