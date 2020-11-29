package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import testPages.FileUploadingPage;
import utilities.Utils;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eleven_FileUpload extends BaseTest {
	
	public WebDriverWait wait;
	
	@Test
	public void fileUpload_11(){
		
		String baseDir = System.getProperty("user.dir");
		String imageDir = baseDir + "/resource/logo.png";
		System.out.println(imageDir);
		
	
		//https://dzone.com/articles/how-to-download-amp-upload-files-using-selenium-wi
		FileUploadingPage fl = new FileUploadingPage(driver);
		driver.get(Utils.BASE_URLS + "/upload");
		sleepTest(2000);
		
		//Test uses Upload Button or Drag and Drop to upload a file.
		//Test asserts that the file is uploaded.
		
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#file-upload")));
		fl.getChoseFile().sendKeys(imageDir);
		sleepTest(1000);
		fl.getUploadFile().click();
		sleepTest(1000);
		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#uploaded-files"))).getText().equals("logo.png"));
		sleepTest(1000);

	}
}
