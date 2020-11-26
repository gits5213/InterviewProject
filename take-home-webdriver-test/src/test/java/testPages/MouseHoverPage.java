package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MouseHoverPage extends BasePage{

	public MouseHoverPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="#content > div > div:nth-child(3) > img")
	public WebElement hover1;	
	
	public WebElement getHover1() {
		return hover1;
	}
	@FindBy(css="#content > div > div:nth-child(4) > img")
	public WebElement hover2;	
	
	public WebElement getHover2() {
		return hover2;
	}
	@FindBy(css="#content > div > div:nth-child(5) > img")
	public WebElement hover3;	
	
	public WebElement getHover3() {
		return hover3;
	}
	
	@FindBy(css="#content > div > div:nth-child(3) > div > h5")
	public WebElement hover1text;	
	
	public WebElement getHover1text() {
		return hover1text;
	}
	
	@FindBy(css="#content > div > div:nth-child(4) > div > h5")
	public WebElement hover2text;	
	
	public WebElement getHover2text() {
		return hover2text;
	}
	
	@FindBy(css="#content > div > div:nth-child(5) > div > h5")
	public WebElement hover3text;	
	
	public WebElement getHover3text() {
		return hover3text;
	}
	

}
