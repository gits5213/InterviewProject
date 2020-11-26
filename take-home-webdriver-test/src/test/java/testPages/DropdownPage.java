package testPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends BasePage{
	
	public DropdownPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#content div select#dropdown")
	public WebElement dropDown;	
	
	public WebElement getDropDown() {
		return dropDown;
	}
	
	@FindBy(css = "#content div select#dropdown")
	public List<WebElement> dropDownList;
	
	public List<WebElement> getDropDownList() {
		return dropDownList;
	}
	
	public void getElementText(){
	      for (WebElement objElement : dropDownList) {
	        System.out.println(objElement.getText());
	    }
	}
}
