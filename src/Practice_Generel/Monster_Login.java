package Practice_Generel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Monster_Login {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Search_Google = driver.findElement(By.name("q"));
		Search_Google.sendKeys("Monster Account Login");
		
		WebElement Google_Search = driver.findElement(By.name("btnG"));
		Google_Search.click();
	
		WebElement ClickOnLink= driver.findElement(By.linkText("Monster.com"));
		ClickOnLink.click();
		
		WebElement Type_Name = driver.findElement(By.id("EmailAddress"));
		Type_Name.sendKeys("md83shahnewaz@gmail.com");
		

		WebElement Type_Password = driver.findElement(By.name("Password"));
		Type_Password.sendKeys("Shahnewaz1@");
		
		WebElement ClickOnSign_in= driver.findElement(By.xpath("//*[@id='signInContent']/form/div[3]/input[1]"));
		ClickOnSign_in.click();
		
		WebElement ClickLink= driver.findElement(By.linkText("Skip this offer"));
		ClickLink.click();
		
		
		
		WebElement MainMenu = driver.findElement(By.xpath("//*[contains(@alt,'User avatar')]"));		
		WebElement SubMenu = driver.findElement(By.xpath("//*[@id='Li1']/div[3]/div/ul/li[4]/a"));
		
		Actions action = new Actions (driver);
		action.moveToElement(MainMenu).perform();
		SubMenu.click();
		
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
		

	}

}
