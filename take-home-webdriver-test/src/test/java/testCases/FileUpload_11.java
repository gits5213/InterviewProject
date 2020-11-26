package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import testPages.FileUploadingPage;
import utilities.Utils;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FileUpload_11 extends BaseTest {
	
	public WebDriverWait wait;
	
	@Test
	public void dynamicLoading_9(){
		
		String baseDir = System.getProperty("user.dir");
		String imageDir = baseDir + "/src/test/java/resource/logo.png";
		System.out.println(imageDir);
		
		FileUploadingPage fl = new FileUploadingPage(driver);
		driver.get(Utils.BASE_URLS + "/upload");
		sleepTest(5000);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#file-upload")));
		fl.getChoseFile().click();
		sleepTest(2000);
		uploadFileWithRobot(imageDir);
		sleepTest(2000);
		fl.getUploadFile().click();
		sleepTest(2000);
		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#uploaded-files"))).getText().equals("logo.png"));
		sleepTest(5000);
	
	}
	

}
