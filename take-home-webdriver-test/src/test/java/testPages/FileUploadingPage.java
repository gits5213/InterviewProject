package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileUploadingPage extends BasePage {

	public FileUploadingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="#file-upload")
	public WebElement choseFile;
	
	@FindBy(css="#file-submit")
	public WebElement uploadFile;
	
	public WebElement getChoseFile() {
		return choseFile;
	}
	
	public WebElement getUploadFile() {
		return uploadFile;
	}

}
