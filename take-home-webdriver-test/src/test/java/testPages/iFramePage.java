package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class iFramePage extends BasePage{

	public iFramePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="#tinymce > p")
	public WebElement textArea;
	
	@FindBy(css="#mceu_34 > button")
	public WebElement popUp;
	
	public WebElement getTextArea() {
		return textArea;
	}
	
	public WebElement getPopUp() {
		return popUp;
	}

	
	

}
