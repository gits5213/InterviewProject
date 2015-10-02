package Practice_Generel;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Linkedin_LogIn {

	public static void main(String[] args)  {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Search_Google = driver.findElement(By.name("q"));
		Search_Google.sendKeys("linkedin");
		
		WebElement Google_Search = driver.findElement(By.name("btnG"));
		Google_Search.click();
	
		WebElement ClickOnLink= driver.findElement(By.linkText("Sign In"));
		ClickOnLink.click();
		
		WebElement Type_Name = driver.findElement(By.name("session_key"));
		Type_Name.sendKeys("md83shahnewaz@gmail.com");
		

		WebElement Type_Password = driver.findElement(By.name("session_password"));
		Type_Password.sendKeys("Shahnewaz1@");
		
		WebElement ClickOnSign_in= driver.findElement(By.name("signin"));
		ClickOnSign_in.click();
		
/*
		WebElement MainMenu = driver.findElement(By.xpath("//*[contains(@alt,'SHAHNEWAZ MD')]"));		
		WebElement SubMenu = driver.findElement(By.xpath("//*[@id='account-sub-nav']/div/div[2]/ul/li[1]/div/span/span[3]/a"));
		
		Actions action = new Actions (driver);
		action.moveToElement(MainMenu).perform();
		SubMenu.click();
		
		driver.manage().deleteAllCookies();
		driver.quit();
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
