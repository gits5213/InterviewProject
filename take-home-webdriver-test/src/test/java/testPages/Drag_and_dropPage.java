package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Drag_and_dropPage extends BasePage{
	
	public Drag_and_dropPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="div#column-a.column")
	public WebElement columnA;
	
	@FindBy(css="div#column-b.column")
	public WebElement columnB;
	
	public WebElement getColumnA() {
		return columnA;
	}
	public WebElement getColumnB() {
		return columnB;
	}

}
