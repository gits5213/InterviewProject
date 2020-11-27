package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenNewTabPage extends BasePage{

	public OpenNewTabPage(WebDriver driver) {
		super(driver);		
	}
	@FindBy(css="#content > div > a")
	public WebElement clickHere;	
	
	public WebElement getClickHere() {
		return clickHere;
	}
	@FindBy(css="body > div.example > h3")
	public WebElement newWindowText;	
	
	public WebElement getNewWindowText() {
		return newWindowText;
	}

}
