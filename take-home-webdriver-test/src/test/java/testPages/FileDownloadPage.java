package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownloadPage extends BasePage{

	public FileDownloadPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="#content > div > a:nth-child(2)")
	public WebElement textDownload;
	
	public WebElement getTextDownload() {
		return textDownload;
	}

}
