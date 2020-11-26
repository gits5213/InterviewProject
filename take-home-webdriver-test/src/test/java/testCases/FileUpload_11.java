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
		
		//FileUploadingPage fl = new FileUploadingPage(driver);
		driver.get("http://the-internet.herokuapp.com/upload");
		sleepTest(5000);
//		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#file-submit")).click();
		//fl.getChoseFile().click();
		sleepTest(5000);
//		uploadFileWithRobot(imageDir);
//		sleepTest(1000);
//		fl.getUploadFile().click();
//		Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#uploaded-files"))).getText().equals("logo.png"));
//		sleepTest(5000);
	
	}
	

}
