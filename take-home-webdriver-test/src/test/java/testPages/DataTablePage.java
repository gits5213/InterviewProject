package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataTablePage extends BasePage{

	public DataTablePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="div#column-b.column")
	public WebElement columnB;
	
	public WebElement getColumnA() {
		return columnB;
	}

}
