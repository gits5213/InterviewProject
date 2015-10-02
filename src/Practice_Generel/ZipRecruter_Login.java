package Practice_Generel;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ZipRecruter_Login {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Search_Google = driver.findElement(By.name("q"));
		Search_Google.sendKeys("ZipRecruiter account login");
		
		WebElement Google_Search = driver.findElement(By.name("btnG"));
		Google_Search.click();
	
		WebElement ClickOnLink= driver.findElement(By.linkText("Sign In | ZipRecruiter"));
		ClickOnLink.click();
				
		WebElement Job_Seeker= driver.findElement(By.xpath("//*[@id='candidates_btn']/i"));
		Job_Seeker.click();
		
		WebElement Type_Name = driver.findElement(By.name("email"));
		Type_Name.sendKeys("md83shahnewaz@gmail.com");
				
		WebElement Type_Password = driver.findElement(By.name("password"));
		Type_Password.sendKeys("Shahnewaz1@");
				
		WebElement ClickLink= driver.findElement(By.name("submitted"));
		ClickLink.click();
		
		
		/*
		  Alert alert = driver.switchTo().alert();
		  alert.dismiss();  //Cancel button
		  alert.accept();  //Ok button
		 
		
		WebElement MainMenu = driver.findElement(By.xpath("//*[@id='tabProfile']/h3/a"));		
		WebElement SubMenu = driver.findElement(By.xpath("//*[@id='tabProfile']/div/a[9]"));
		
		Actions action = new Actions (driver);
		action.moveToElement(MainMenu).perform();
		SubMenu.click();
		
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
        */
	}

}
