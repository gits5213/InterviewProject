package Practice_Generel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dice_LogIn {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Search_Google = driver.findElement(By.name("q"));
		Search_Google.sendKeys("Dice Account Login");
		
		WebElement Google_Search = driver.findElement(By.name("btnG"));
		Google_Search.click();
	
		WebElement ClickOnLink= driver.findElement(By.linkText("Sign In - Dice.com"));
		ClickOnLink.click();
		
		WebElement Type_Name = driver.findElement(By.id("email"));
		Type_Name.sendKeys("md83shahnewaz@gmail.com");
		

		WebElement Type_Password = driver.findElement(By.name("password"));
		Type_Password.sendKeys("Shahnewaz1@");
		
		WebElement ClickOnSign_in= driver.findElement(By.xpath("//*[@id='loginData']/div[3]/div/div/div[1]/button"));
		ClickOnSign_in.click();
		
		WebElement Sign_Out= driver.findElement(By.xpath("//*[@id='menu-toggle']/ul[2]/li/form/button"));
		Sign_Out.click();
		
		/*
		WebElement MainMenu = driver.findElement(By.xpath("//*[contains(@alt,'User avatar')]"));		
		WebElement SubMenu = driver.findElement(By.xpath("//*[@id='Li1']/div[3]/div/ul/li[4]/a"));
		
		Actions action = new Actions (driver);
		action.moveToElement(MainMenu).perform();
		SubMenu.click();
		
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
		*/

	}

}
